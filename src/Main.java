import backend.UserManager;
import etc.User;

public class Main {
	public static void main(String[] args) {
		ProductManager pm = ProductManager.getIntance();
        UserManager userManager = UserManager.getInstance();
        User flizalde = new User("Facundo Manuel","Lizalde Frias", "Alsina 70", "notelavoyadecir","facundolizalde@gmail.com",39671568);
        User sur = new User("Facundo", "Martinez Abalo", "Costa Rica 562", "contrasenia", "ilovepenguins@gmail.com", 38957200);
        User pela = new User("Eliel Arturo", "Catauro Nardela", "Mirage 123", "dizleccia", "tubizcochito@gmail.com", 39423084);
        User mati = new User("Matias", "Morandeira Lucero", "Alem 674", "horaciolovenohomo", "matimoran@gmail.com", 40020042);
        User juan = new User("Juan Pablo","Correa Divitto", "Rosales 2283", "suplente4ever", "juampicorrea21@gmail.com", 41324982);
        userManager.addUser(flizalde);
        userManager.addUser(sur);
        userManager.addUser(pela);
        userManager.addUser(mati);
        userManager.addUser(juan);
        Product p1 = new Product("00000001", "Botella plastica 2,25", 0.500, 0.2);
        Product p2 = new Product("00000002", "Paquete de yerba", 0.1, 0.01);
        Product p3 = new Product("00000003", "Latita bebida", 0.1, 0.02);
        Product p4 = new Product("00000004", "Tapita plastica", 0.05, 0.005);
        Product p5 = new Product("00000005", "Envase desodorante", 0.2, 0.02);
        Product p6 = new Product("00000006", "Botella plastica 1,5", 0.25, 0.1);
        Product p7 = new Product("00000007", "Botella plastica 0,5", 0.1, 0.05);
        pm.addProduct(p1)
        pm.addProduct(p2);
        pm.addProduct(p3);
        pm.addProduct(p4);
        pm.addProduct(p5);
        pm.addProduct(p6);
        pm.addProduct(p7);
        System.out.println(userManager.imprimirUsuarios());
    }
}
