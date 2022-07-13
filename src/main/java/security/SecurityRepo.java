package security;

import java.util.HashMap;

public class SecurityRepo {

    private HashMap<String, String> usuariosPasswords;
    private HashMap<String, String> usuariosPermisos;

    public SecurityRepo(){
        /*usuariosPasswords = new HashMap<String, String>();
        usuariosPasswords.put("admin", "123");
        usuariosPasswords.put("supervisor", "456");
        usuariosPasswords.put("usr", "789");

        usuariosPermisos = new HashMap<String, String>();
        usuariosPermisos.put("admin", "CRUD");
        usuariosPermisos.put("supervisor", "CRU");
        usuariosPermisos.put("usr", "R");*/
    }

    public String getPermisos(String usuario) {
        return null; // this.usuariosPermisos.get(usuario);
    }

    public Boolean verifyCredentials(String usuario, String password){

        /*String passwordStored = this.usuariosPasswords.get(usuario);

        if (passwordStored == null)
            return false;

        return  (passwordStored == password);*/

        return null;
    }
}
