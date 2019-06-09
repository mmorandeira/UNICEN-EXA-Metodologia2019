import backend.UserManager;
import etc.User;

public class UserApp {
    private UserManager userManager;
    private boolean logeado;
    private User usuario;
    private Mapa mapa;

    public UserApp(){
        userManager=UserManager.getInstance();
    }


}
