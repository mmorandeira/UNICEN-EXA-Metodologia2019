import backend.UserManager;

public class UserApp {
    UserManager userManager;

    public UserApp(){
        userManager=UserManager.getInstance();
    }


}
