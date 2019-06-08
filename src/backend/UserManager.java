package backend;

import java.util.HashMap;

public class UserManager {
    private HashMap<String,User> usuarios;
    static UserManager instance;

    private UserManager(){
        this.usuarios = new HashMap<String,User>();
    }

    public static UserManager getInstance() {
        if(instance == null)
            instance = new UserManager();
        return instance;
    }

    public void addUser(User usuario){
        usuarios.put(usuario.getMail(),usuario);
    }

    public boolean validarUsuario(String mail, String password){
        return usuarios.containsKey(mail) && usuarios.get(mail).getPassword().equals(password);
    }

}
