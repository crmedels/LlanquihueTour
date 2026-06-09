package model;

/**
 * Representa a un empleado de la agencia Llanquihue Tour.
 * Esta clase hereda los datos generales de Persona y agrega
 * informacion propia del rol laboral.
 */
public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    /**
     * Constructor vacio de la clase Empleado.
     */
    public Empleado() {
    }

    /**
     * Constructor con parametros de la clase Empleado.
     *
     * @param rut rut del empleado
     * @param nombre nombre del empleado
     * @param telefono telefono de contacto
     * @param correo correo electronico
     * @param direccion direccion asociada al empleado
     * @param cargo cargo que cumple dentro de la agencia
     * @param sueldo sueldo del empleado
     */
    public Empleado(String rut, String nombre, String telefono, String correo,
                    Direccion direccion, String cargo, double sueldo) {
        super(rut, nombre, telefono, correo, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Retorna la informacion del empleado en formato de texto.
     *
     * @return datos del empleado
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "rut='" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", teléfono='" + getTelefono() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", dirección=" + getDireccion() +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
