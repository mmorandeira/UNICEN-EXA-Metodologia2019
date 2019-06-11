package backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import util.Pair;
import frontend.Product;
import frontend.User;

public class Municipio {
    ProductManager productManager;
    private List<PuntoItinerante> puntoItinerantes;
    private List<String> ong;
    private List<Pair<String, Date>> cronograma;
    private List<Pair<User, Pair<Product, Integer>>> acopioAcumulado;
    static Municipio instance;

    private Municipio() {
        productManager = ProductManager.getInstance();
        puntoItinerantes = new ArrayList<PuntoItinerante>();
        ong = new ArrayList<String>();
        cronograma = new ArrayList<>();
        acopioAcumulado = new ArrayList<>();
    }

    public static Municipio getInstance() {
        if (instance == null)
            instance = new Municipio();
        return instance;
    }

    public void addONG(String ong) {
        this.ong.add(ong);
    }

    public void addPuntoItinerante(PuntoItinerante p) {
        //verificarSiExistePunto
        this.puntoItinerantes.add(p);
    }

    public void addCronograma(Pair<String, Date> c) {
        this.cronograma.add(c);
    }

    public String getEstadisticas() {
        return "Estadistica";
    }

    public void addAcopio(User u, Pair<Product, Integer> p) {
        Pair<User, Pair<Product, Integer>> aux = new Pair<User, Pair<Product, Integer>>(u, p);
        this.acopioAcumulado.add(aux);
    }

    public List<Pair<User, Pair<Product, Integer>>> getAcopioAcumulado(){
        List<Pair<User, Pair<Product, Integer>>> aux = new ArrayList<Pair<User, Pair<Product, Integer>>>();
        aux.addAll(this.acopioAcumulado);
        return aux;
    }

}