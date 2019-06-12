import backend.*;
import frontend.UserApp;
import frontend.User;
import frontend.Product;

public class Main {
        private static ProductManager productManager;
        private static UserManager userManager;
        private static UserApp userApp;
        private static Municipio municipio;

        public static void main(String[] args) {
                inicializar1();
                escenario1();
                escenario2();
        }

        /*En este metodo se iniciliza lo comun a todos lo
         * necesario para la ejecucion de los escenarios
         * se agregan unos productos y usuarios
         * */

        public static void inicializar1() {
                productManager = ProductManager.getInstance();
                userManager = UserManager.getInstance();
                userApp = new UserApp();
                municipio = Municipio.getInstance();
                User flizalde = new User("Facundo Manuel", "Lizalde Frias", "Alsina 70", "No barrio", "notelavoyadecir", "facundolizalde@gmail.com", 39671568);
                User sur = new User("Facundo", "Martinez Abalo", "Costa Rica 562", "Terminal", "contrasenia", "ilovepenguins@gmail.com", 38957200);
                User pela = new User("Eliel Arturo", "Catauro Nardela", "Mirage 123", "Mirage", "dizleccia", "tubizcochito@gmail.com", 39423084);
                User mati = new User("Matias", "Morandeira Lucero", "Alem 674", "Terminal", "ahreloco", "matimoran@gmail.com", 40020042);
                User juan = new User("Juan Pablo", "Correa Divitto", "Rosales 2283", "Villa Aguirre", "suplente4ever", "juampicorrea21@gmail.com", 41324982);
                userManager.addUser(flizalde);
                userManager.addUser(sur);
                userManager.addUser(pela);
                userManager.addUser(mati);
                userManager.addUser(juan);
                Product p1 = new Product("00000001", "Botella plastica 2,25", 0.500, 0.2, "plastico");
                Product p2 = new Product("00000002", "Paquete de yerba", 0.1, 0.01, "papel");
                Product p3 = new Product("00000003", "Latita bebida", 0.1, 0.02, "aluminio");
                Product p4 = new Product("00000004", "Tapita plastica", 0.05, 0.005, "plastico");
                Product p5 = new Product("00000005", "Envase desodorante", 0.2, 0.02, "aluminio");
                Product p6 = new Product("00000006", "Botella plastica 1,5", 0.25, 0.1, "plastico");
                Product p7 = new Product("00000007", "Botella plastica 0,5", 0.1, 0.05, "plastico");
                productManager.addProduct(p1);
                productManager.addProduct(p2);
                productManager.addProduct(p3);
                productManager.addProduct(p4);
                productManager.addProduct(p5);
                productManager.addProduct(p6);
                productManager.addProduct(p7);
        }

        /*En este escenario un usuario desea loguarse
         * como el usuario no estaba registrado, este se registra
         * y añade unos productos a su acopio, de los cuales algunos
         * no existen. Luego para comporobar que esto funcione
         * correctamente se verifican las estadisticas
         */
        public static void escenario1(){
                userManager.imprimirUsuarios();
                userApp.login("sofimangaterra@gmail.com", "123456789"); //Cuenta no existente por lo que no se puede logear
                userApp.addProduct("00000001", 3);//SIMULAR QUE LA APP LE DICE QUE NO EXISTE CUENTA POR LO QUE NO PUEDE REGISTRAR ACOPIO
                userApp.signIn("Sofia", "Mangaterra", "sofimangaterra@gmail.com", "123456789", "Calle 123", "Mirage", 40124452);
                userApp.addProduct("00000001", 3);
                userApp.addProduct("00000002", 1);
                userApp.addProduct("00000004", 4);
                userApp.addProduct("01230914", 5); //Producto no existente (Emula producto no reciclable)
                userApp.addProduct("91249344", 3); //Producto no existente (Emula producto no reciclable)
                System.out.println(userApp.calcularEstadisticas() + "kg");
        }
        
        /*En este escenario la municipalidad desea vizualizar las
        * estadisticas del barrio "MIRAGE" para esto
        * se crean unos productos y unos vecinos y son registrados los acopios
        * (para esto se usa el metodo inicializar1())
        * se creea una instancia de la clase EstadisticaPorBarrio
        * y se llama al metoodo calcular
        * */
        public static void escenario2(){
            //estadisticas de barrio "Mirage"
            EstadisticaPorBarrio c1 = new EstadisticaPorBarrio("Mirage");
            System.out.println(c1.calcularKilosAcumulado(municipio));
            System.out.println(c1.calcularVolumenAcumulado(municipio));
            //estadisticas del material papel
            EstadisticaPorMaterial c2 = new EstadisticaPorMaterial("papel");
            System.out.println(c2.calcularKilosAcumulado(municipio));
            System.out.println(c2.calcularVolumenAcumulado(municipio));
        }

}
