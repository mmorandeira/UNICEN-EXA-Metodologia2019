package frontend;

import backend.UserManager;
import util.Pair;

import java.time.LocalDate;

import backend.ProductManager;
import backend.Mapa;
import backend.Municipio;

public class UserApp {
    private UserManager userManager;
    private boolean logeado;
    private User usuario;
    private Mapa mapa;
    private ProductManager productManager;
    private Municipio municipio;

    /*  En esta clase se encuentra la aplicacion del usuario.
        esta misma hace de intermediario entre el usuario y el backend
        peritiendo loguearse, agregar productos al acopio  y aceder a las distintas secciones de la aplicacion.
     */
    public UserApp() {
        this.userManager = UserManager.getInstance();
        this.mapa = Mapa.getInstance();
        this.productManager = ProductManager.getInstance();
        this.logeado = false;
        this.usuario = null;
        this.municipio = Municipio.getInstance();
    }

    /* Si el mail existe  y el usuario no esta logueado,
    se verifica que la password ingresada sea la correspondiente a ese mail
    de ser correcto el usuario se loguea y añade la fecha actual a la actividad del usuario
     */
    public void login(String mail, String pass) {
        if ((this.userManager.existeUser(mail)) && !this.logeado) {
            if (this.userManager.validarPassword(mail, pass)) {
                this.logeado = true;
                this.usuario = this.userManager.getUser(mail);
                this.usuario.addActivity(LocalDate.now());
            }
        }
    }

    public void verMapa() {
        this.mapa.mostrar();
    }

    public double calcularEstadisticas() {
        if (this.logeado)
            return this.usuario.getCantEnPeso();
        return 0;
    }

    /* Este metodo permite al usuario registrarse en el sistema
       verificando que el mail del mismo no este asignado a ningun otro usuario.
       luego de ser registrado el mismo se loguea.
     */
    public void signIn(String nombre, String apellido, String mail, String pass, String domicilio, String barrio, int dni) {
        if (!this.userManager.existeUser(mail) && !this.logeado) {
            User aux = new User(nombre, apellido, domicilio, barrio, pass, mail, dni);
            userManager.addUser(aux);
            login(mail, pass);
        }
    }


    public void logOut() {
        this.usuario = null;
        this.logeado = false;
    }

    public void verAhorro() {
        // Hacer simulacion, mensajes con municipio
    }


    public void verCronograma() {
        // Hacer simulacion, mensajes con municipio
    }

    public void verAyudaONG() {
        // Hacer simulacion, mensajes con municipio
    }

    // agrega productos siempre y cuando este producto este previamente en el sistema
    public void addProduct(String codBarras, Integer cant) {
        if ((this.productManager.existeProducto(codBarras)) && this.logeado) {
            Product p = this.productManager.getProducto(codBarras);
            Pair<Product, Integer> pAux = new Pair<Product, Integer>(p, cant);
            this.usuario.addAcopio(pAux);
            this.municipio.addAcopio(this.usuario, pAux);
        }
    }

}