package etc;
import java.util.Vector;

public class User {
	

    private Vector<Pair<Producto,Integer>> coleccionDeAcopio;
    private String nombre;
    private String apellido;
    private String domicilio;  //ubicacion?
    private String password;
    private String mail;
    private int dni;

    public Pair<Producto,Integer> getAcopio (int i){
        return coleccionDeAcopio.elementAt(i);
    }

    public void addAcopio (Pair<Producto,Integer> acopio){
        coleccionDeAcopio.add(acopio);
    }

    public double getPromedio(){ //devuelve la suma de cantidades de productos
       int suma;
       for (int i; i<coleccionDeAcopio.size();i++){
           suma+=coleccionDeAcopio.elementAt(i).getSecond();
       }
       return suma;
    }

    public int getAcopioSize(){
        return coleccionDeAcopio.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
