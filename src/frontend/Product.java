package frontend;

public class Product {

    private String codigoDeBarra;
    private String nombre;
    private float peso;
    private float volumen;
    private String material;

    public Product(String codigoDeBarra, String nombre, float peso, float volumen, String material) {
        this.codigoDeBarra = codigoDeBarra;
        this.nombre = nombre;
        this.peso = peso;
        this.volumen = volumen;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
