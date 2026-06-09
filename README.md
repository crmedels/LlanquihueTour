# Llanquihue Tour

## Descripción del proyecto

Este proyecto corresponde a un sistema básico desarrollado en Java para representar personas vinculadas a la agencia de turismo Llanquihue Tour.

El objetivo principal es aplicar conceptos de programación orientada a objetos, tales como clases, objetos, encapsulamiento, herencia, composición, constructores, métodos get y set, método toString() y organización del código en paquetes.

## Estructura del proyecto

El proyecto está organizado en dos paquetes principales:

- `model`: contiene las clases del dominio del sistema.
- `app`: contiene la clase principal que permite ejecutar el programa.

## Clases implementadas

### Direccion

Representa la dirección de una persona vinculada a la agencia. Contiene datos como calle, número, comuna y región.

### Persona

Representa una persona general dentro del sistema. Funciona como clase base para otros tipos de personas. Contiene datos como rut, nombre, teléfono, correo y dirección.

Esta clase utiliza composición, ya que contiene un objeto de tipo `Direccion`.

### Empleado

Representa a un empleado de la agencia. Hereda los datos generales de la clase `Persona` y agrega información propia del rol laboral, como cargo y sueldo.

### GuiaTuristico

Representa a un guía turístico vinculado a la agencia. Hereda los datos generales de la clase `Persona` y agrega información relacionada con su labor turística, como idioma, años de experiencia y tarifa por tour.

### Main

Clase principal ubicada en el paquete `app`. Permite crear objetos de las clases implementadas y mostrar sus datos por consola mediante el método `toString()`.

## Conceptos aplicados

- Programación orientada a objetos.
- Encapsulamiento mediante atributos privados.
- Constructores vacíos y constructores con parámetros.
- Métodos get y set.
- Método `toString()`.
- Herencia mediante `extends`.
- Composición de clases.
- Organización del proyecto en paquetes.
- Documentación mediante comentarios Javadoc.

## Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que las clases se encuentren dentro de los paquetes correspondientes.
3. Ejecutar la clase `Main`, ubicada en el paquete `app`.
4. Revisar la salida generada por consola.

## Autor

Cristofer Medel