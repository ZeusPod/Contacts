package app.com.zeusdev.contacts.app.com.zeusdev.contacts.util;

/**
 * Created by Zeus on 02/10/2014.
 */
public class Contacto {

    String nombre, telefono, direccion, email;

    public Contacto(String nombre, String telefono, String direccion, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    //<editor-fold desc="Getters Methods">
    public String getNombre() {
        return nombre;
    }

    //<editor-fold desc="Setters Methods">
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //</editor-fold>

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //</editor-fold>


}
