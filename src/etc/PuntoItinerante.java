package etc;

import java.util.Objects;

public class PuntoItinerante {
    private Coordenada direccion;
    private String nombre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PuntoItinerante that = (PuntoItinerante) o;
        return Objects.equals(direccion, that.direccion) &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, nombre);
    }

    public Coordenada getDireccion() {
        return direccion;
    }

    public void setDireccion(Coordenada direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PuntoItinerante(Coordenada direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
    }
}
