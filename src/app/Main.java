package app;

import model.Direccion;
import model.Empleado;
import model.GuiaTuristico;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Permite crear objetos del modelo y mostrar su informacion por consola.
 */
public class Main {

    public static void main(String[] args) {

        Direccion direccionEmpleado = new Direccion(
                "Vicente Perez Rosales",
                120,
                "Llanquihue",
                "Los Lagos"
        );

        Empleado empleado = new Empleado(
                "12.345.678-9",
                "Carlos Muñoz",
                "987654321",
                "carlos.munoz@llanquihuetour.cl",
                direccionEmpleado,
                "Coordinador de reservas",
                750000
        );

        Direccion direccionGuia = new Direccion(
                "Costanera",
                45,
                "Puerto Varas",
                "Los Lagos"
        );

        GuiaTuristico guia = new GuiaTuristico(
                "18.765.432-1",
                "María Soto",
                "912345678",
                "maria.soto@llanquihuetour.cl",
                direccionGuia,
                "Inglés",
                5,
                45000
        );

        Direccion direccionGuiaSetter = new Direccion();
        direccionGuiaSetter.setCalle("Lago Llanquihue");
        direccionGuiaSetter.setNumero(300);
        direccionGuiaSetter.setComuna("Frutillar");
        direccionGuiaSetter.setRegion("Los Lagos");

        GuiaTuristico guiaSetter = new GuiaTuristico();
        guiaSetter.setRut("16.111.222-3");
        guiaSetter.setNombre("Pedro Vargas");
        guiaSetter.setTelefono("923456789");
        guiaSetter.setCorreo("pedro.vargas@llanquihuetour.cl");
        guiaSetter.setDireccion(direccionGuiaSetter);
        guiaSetter.setIdioma("Español");
        guiaSetter.setAniosExperiencia(3);
        guiaSetter.setTarifaPorTour(35000);

        System.out.println("=== SISTEMA LLANQUIHUE TOUR ===");
        System.out.println();

        System.out.println("Empleado registrado:");
        System.out.println(empleado);
        System.out.println();

        System.out.println("Guía turístico registrado:");
        System.out.println(guia);
        System.out.println();

        System.out.println("Guía turístico registrado con constructor vacío y setters:");
        System.out.println(guiaSetter);
    }
}
