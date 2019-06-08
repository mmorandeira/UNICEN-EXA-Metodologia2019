package etc;

public class Product {

    private String codigoDeBarra;
    private String nombre;
    private float peso;
    private float volumen;

    public Product(String codigoDeBarra, String nombre, float peso, float volumen) {
        this.codigoDeBarra = codigoDeBarra;
        this.nombre = nombre;
        this.peso = peso;
        this.volumen = volumen;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

}
