import backend.UserManager;
import etc.User;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        User flizalde = new User("Facundo Manuel","Lizalde Frias", "Alsina 70", "notelavoyadecir","facundolizalde@gmail.com",39671568);
        userManager.addUser(flizalde);
        userManager.imprimirUsuarios();
    }
}
