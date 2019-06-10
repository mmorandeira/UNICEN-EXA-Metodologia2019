import backend.UserManager;
import frontend.UserApp;
import frontend.User;
import backend.ProductManager;
import frontend.Product;

public class Main {
	public static void main(String[] args) {
		ProductManager pm = ProductManager.getInstance();
		UserApp app = new UserApp();
        UserManager userManager = UserManager.getInstance();
        User flizalde = new User("Facundo Manuel","Lizalde Frias", "Alsina 70", "No barrio", "notelavoyadecir","facundolizalde@gmail.com", 39671568);
        User sur = new User("Facundo", "Martinez Abalo", "Costa Rica 562", "Terminal", "contrasenia", "ilovepenguins@gmail.com", 38957200);
        User pela = new User("Eliel Arturo", "Catauro Nardela", "Mirage 123", "Mirage", "dizleccia", "tubizcochito@gmail.com", 39423084);
        User mati = new User("Matias", "Morandeira Lucero", "Alem 674", "Terminal", "horaciolovenohomo", "matimoran@gmail.com", 40020042);
        User juan = new User("Juan Pablo","Correa Divitto", "Rosales 2283", "Villa Aguirre", "suplente4ever", "juampicorrea21@gmail.com", 41324982);
        userManager.addUser(flizalde);
        userManager.addUser(sur);
        userManager.addUser(pela);
        userManager.addUser(mati);
        userManager.addUser(juan);
        Product p1 = new Product("00000001", "Botella plastica 2,25", 0.500f, 0.2f);
        Product p2 = new Product("00000002", "Paquete de yerba", 0.1f, 0.01f);
        Product p3 = new Product("00000003", "Latita bebida", 0.1f, 0.02f);
        Product p4 = new Product("00000004", "Tapita plastica", 0.05f, 0.005f);
        Product p5 = new Product("00000005", "Envase desodorante", 0.2f, 0.02f);
        Product p6 = new Product("00000006", "Botella plastica 1,5", 0.25f, 0.1f);
        Product p7 = new Product("00000007", "Botella plastica 0,5", 0.1f, 0.05f);
        pm.addProduct(p1);
        pm.addProduct(p2);
        pm.addProduct(p3);
        pm.addProduct(p4);
        pm.addProduct(p5);
        pm.addProduct(p6);
        pm.addProduct(p7);
        userManager.imprimirUsuarios();
        app.login("matimoran@gmail.com", "horaciolovenohomo");
        app.addProduct("00000001", 3);
        System.out.println(app.calcularEstadisticas()+ "kg");
        app.signIn("Sofia", "Mangaterra", "sofimangaterra@gmail.com", "123456789", "Calle 123", "Mirage", 40124452);
    }
}
