package frontend;

import util.Pair;

import java.time.LocalDate;
import java.util.Vector;

public class User {


    private Vector<Pair<Product, Integer>> coleccionDeAcopio;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String barrio;//ubicacion?
    private String password;
    private String mail;
    private Vector<LocalDate> activity;
    private int dni;

    public User(String nombre, String apellido, String domicilio, String barrio, String password, String mail, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.barrio = barrio;
        this.password = password;
        this.mail = mail;
        this.dni = dni;
        this.coleccionDeAcopio = new Vector<Pair<Product, Integer>>();
        this.activity = new Vector<LocalDate>();
    }

    public Pair<Product, Integer> getAcopio(int i) {
        return coleccionDeAcopio.elementAt(i);
    }

    public void addAcopio(Pair<Product, Integer> acopio) {
        coleccionDeAcopio.add(acopio);
    }

    public double getCantEnPeso() { //devuelve la suma de cantidades en kg
        double suma = 0;
        for (int i=0; i < coleccionDeAcopio.size(); i++) {
        	suma += (coleccionDeAcopio.elementAt(i).getSecond()* (double)coleccionDeAcopio.elementAt(i).getFirst().getPeso());
        }
        return suma;
    }

    public int getAcopioSize() {
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

    
    public void setBarrio(String barrio) {
    	this.barrio = barrio;
    }
    
    public String getBarrio() {
    	return this.barrio;
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

    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", dni=" + dni +
                '}';
    }

    public void addActivity(LocalDate activity){
        this.activity.add(activity);
    }
    
    public String getActivity() {
    	return this.activity.toString();
    }
    
}
