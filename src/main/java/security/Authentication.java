package security;

public class Authentication {


    SecurityRepo securityRepo;

    public Authentication(){
        securityRepo = new SecurityRepo();
    }

    public void setSecurityRepo(SecurityRepo securityRepo){
        this.securityRepo = securityRepo;
    }

    public String loginUser(String usuario, String password){
        Boolean loginValidado = this.securityRepo.verifyCredentials(usuario, password);

        if (! loginValidado)
            return  "User or password incorrect";

        String permisos = this.securityRepo.getPermisos(usuario);

        return "User authenticated successfully with permissions: " + permisos;
    }
}
