package backend;

import etc.Coordenada;
import etc.PuntoItinerante;
import etc.Usuario;

import java.util.HashMap;

public class Mapa {

    private static Mapa instance;
    private HashMap<String, Coordenada> puntos;
    private HashMap<String, Coordenada> casas;
    private Municipio municipio;

    public Mapa() {
        this.puntos = new HashMap<String, Coordenada>();
    }

    public static Mapa getInstance() {
        if (instance == null) {
            instance = new Mapa();
        }
        return instance;
    }

    public void addPuntoItinerante(PuntoItinerante puntoItinerante) {
        this.puntos.put(puntoItinerante.getNombre(), puntoItinerante.getDireccion());
    }

    public void addCasa(Usuario usuario) {
        this.casas.put(usuario.getMail(), usuario.getDireccion());
    }

    public String mostrarPuntos() {
        return this.puntos.toString();
    }
}
