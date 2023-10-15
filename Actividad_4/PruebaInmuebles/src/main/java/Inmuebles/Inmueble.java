package Inmuebles;
/**
* Esta clase denominada Inmueble modela un inmueble que posee
* como atributos un identificador, un área, una dirección y un precio
* de venta. Es la clase raíz de una jerarquía de herencia.
*/


public class Inmueble {
    // Atributo para el identificador inmobiliario de un inmueble
    protected int identificadorInmobiliario;
    protected int area; // Atributo que identifica el área de un inmueble
    protected String direccion; /* Atributo que identifica la dirección de
    un inmueble */
    protected double precioVenta; /* Atributo que identifica el precio de
    venta de un inmueble */
/**
* Constructor de la clase Inmueble
*/
Inmueble(int identificadorInmobiliario, int area, String direccion) {
    this.identificadorInmobiliario = identificadorInmobiliario;
    this.area = area;
    this.direccion = direccion;
}

/**
* Método que a partir del valor del área de un inmueble, calcula su
* precio de venta
*/
double calcularPrecioVenta(double valorArea) {
    precioVenta = area * valorArea;
    return precioVenta;
}

/**
* Método que muestra en pantalla los datos de un inmueble
*/
void imprimir() {
    System.out.println("Identificador inmobiliario = " +
    identificadorInmobiliario);
    System.out.println("Area = " + area);
    System.out.println("Dirección = " + direccion);
    System.out.println("Precio de venta = $" + precioVenta);
}
}