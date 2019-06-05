package etc;

import java.util.List;
import java.util.Objects;

public class Camion {
    private String patente;
    private Coordenada posicion;
    private List<PuntoItinerante> recorrido;

    public Camion(String patente, Coordenada posicion) {
        this.patente = patente;
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camion camion = (Camion) o;
        return Objects.equals(patente, camion.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Coordenada getPosicion() {
        return posicion;
    }

    public void setPosicion(Coordenada posicion) {
        this.posicion = posicion;
    }
}
