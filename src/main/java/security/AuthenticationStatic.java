package security;

public class AuthenticationStatic {

    public String loginUser(String usuario, String password){
        Boolean loginValidado = SecurityStaticRepo.verifyCredentials(usuario, password);

        if (! loginValidado)
            return  "User or password incorrect";

        String permisos = SecurityStaticRepo.getPermisos(usuario);

        return "User authenticated successfully with permissions: " + permisos;
    }

}
