package etc;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String mail,nombre,password;
    private Coordenada direccion;
    private List<Acopio> acopios;

    @Override
    public String toString() {
        return "Usuario{" +
                "mail='" + mail + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return mail.equals(usuario.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mail);
    }

    public Usuario(String mail, String nombre, String password, Coordenada direccion) {
        this.mail = mail;
        this.nombre = nombre;
        this.password = password;
        this.direccion = direccion;
        this.acopios = new ArrayList<Acopio>();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Coordenada getDireccion() {
        return direccion;
    }

    public void setDireccion(Coordenada direccion) {
        this.direccion = direccion;
    }
}
