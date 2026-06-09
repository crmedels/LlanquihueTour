package model;

/**
 * Representa la direccion de una persona vinculada a la agencia Llanquihue Tour.
 * Esta clase se utiliza como composicion dentro de la clase Persona.
 */
public class Direccion {

    private String calle;
    private int numero;
    private String comuna;
    private String region;

    /**
     * Constructor vacio de la clase Direccion.
     */
    public Direccion() {
    }

    /**
     * Constructor con parametros de la clase Direccion.
     *
     * @param calle nombre de la calle
     * @param numero numero de la direccion
     * @param comuna comuna donde se ubica la direccion
     * @param region region donde se ubica la direccion
     */
    public Direccion(String calle, int numero, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Retorna la informacion de la direccion en formato de texto.
     *
     * @return datos de la direccion
     */
    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", número=" + numero +
                ", comuna='" + comuna + '\'' +
                ", región='" + region + '\'' +
                '}';
    }
}