package frontend;

public class Product {

    private String codigoDeBarra;
    private String nombre;
    private double peso;
    private double volumen;
    private String material;

    public Product(String codigoDeBarra, String nombre, double peso, double volumen, String material) {
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codigoDeBarra='" + codigoDeBarra + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", volumen=" + volumen +
                ", material='" + material + '\'' +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
