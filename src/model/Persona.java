package model;

/**
 * Representa a una persona vinculada a la agencia Llanquihue Tour.
 * Esta clase funciona como clase base para otros tipos de personas,
 * como empleados y guias turisticos.
 */
public class Persona {

    private String rut;
    private String nombre;
    private String telefono;
    private String correo;
    private Direccion direccion;

    /**
     * Constructor vacio de la clase Persona.
     */
    public Persona() {
    }

    /**
     * Constructor con parametros de la clase Persona.
     *
     * @param rut rut de la persona
     * @param nombre nombre de la persona
     * @param telefono telefono de contacto
     * @param correo correo electronico
     * @param direccion direccion asociada a la persona
     */
    public Persona(String rut, String nombre, String telefono, String correo, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Retorna la informacion de la persona en formato de texto.
     *
     * @return datos de la persona
     */
    @Override
    public String toString() {
        return "Persona{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}