package model;

/**
 * Representa a un guia turistico vinculado a la agencia Llanquihue Tour.
 * Esta clase hereda los datos generales de Persona y agrega informacion
 * relacionada con su trabajo en actividades turisticas.
 */
public class GuiaTuristico extends Persona {

    private String idioma;
    private int aniosExperiencia;
    private double tarifaPorTour;

    /**
     * Constructor vacio de la clase GuiaTuristico.
     */
    public GuiaTuristico() {
    }

    /**
     * Constructor con parametros de la clase GuiaTuristico.
     *
     * @param rut rut del guia turistico
     * @param nombre nombre del guia turistico
     * @param telefono telefono de contacto
     * @param correo correo electronico
     * @param direccion direccion asociada al guia turistico
     * @param idioma idioma principal que maneja el guia
     * @param aniosExperiencia anios de experiencia en turismo
     * @param tarifaPorTour tarifa cobrada por tour
     */
    public GuiaTuristico(String rut, String nombre, String telefono, String correo,
                         Direccion direccion, String idioma, int aniosExperiencia,
                         double tarifaPorTour) {
        super(rut, nombre, telefono, correo, direccion);
        this.idioma = idioma;
        this.aniosExperiencia = aniosExperiencia;
        this.tarifaPorTour = tarifaPorTour;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public double getTarifaPorTour() {
        return tarifaPorTour;
    }

    public void setTarifaPorTour(double tarifaPorTour) {
        this.tarifaPorTour = tarifaPorTour;
    }

    /**
     * Retorna la informacion del guia turistico en formato de texto.
     *
     * @return datos del guia turistico
     */
    @Override
    public String toString() {
        return "GuiaTuristico{" +
                "rut='" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", teléfono='" + getTelefono() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                ", dirección=" + getDireccion() +
                ", idioma='" + idioma + '\'' +
                ", añosExperiencia=" + aniosExperiencia +
                ", tarifaPorTour=" + tarifaPorTour +
                '}';
    }
}