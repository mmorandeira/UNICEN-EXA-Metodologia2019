package backend;

import etc.Camion;
import etc.Coordenada;
import etc.Producto;
import etc.Usuario;

import java.util.HashMap;

public class Municipio {

    private static Municipio instance;

    //    definiendo estructuras a utilizar
    private Mapa map;
    private HashMap<String, Usuario> usuarios;
    private HashMap<String, Camion> camiones;
    private HashMap<String, Producto> productos;
    private HashMap<String, Coordenada> puntos;
    public final String CASA = "Casa";

    private Municipio() {
        this.usuarios = new HashMap<String, Usuario>();
        this.camiones = new HashMap<String, Camion>();
        this.productos = new HashMap<String, Producto>();
        this.puntos = new HashMap<String, Coordenada>();
        this.map = Mapa.getInstance();
    }

    public static Municipio getInstance() {
        if (instance == null) {
            instance = new Municipio();
        }
        return instance;
    }

    public void addUsuario(Usuario u) {
        this.usuarios.put(u.getMail(), u);
        this.map.addPunto(CASA, u.getDireccion());
    }

    public void addCamion(Camion c) {
        this.camiones.put(c.getPatente(), c);
    }

    public void addProducto(Producto p) {
        this.productos.put(p.getCodigoBarra(), p);
    }

    public void addPunto(Coordenada p) {
        this.map.addPunto(Coordenada, p);
        this.puntos.put(p.getNombre(), p);
    }

    public boolean existeUsuario(String mail) {
        return this.usuarios.containsKey(mail);
    }

    public Usuario validarPass(String email, String pass) {
        if (this.usuarios.get(email).getPassword().equals(pass))
            return this.usuarios.get(email);
        return null;
    }

    public Mapa getMapa() {
        return this.map;
    }

}
