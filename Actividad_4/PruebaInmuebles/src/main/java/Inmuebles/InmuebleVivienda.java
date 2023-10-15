package Inmuebles;

/**
* Esta clase denominada InmuebleVivienda modela un inmueble
* destinado para la vivienda con atributos como el número de
* habitaciones y el número de baños que posee
*/

public class InmuebleVivienda extends Inmueble {
    /* Atributo que identifica el número de habitación de un inmueble
    para vivienda */
    protected int numeroHabitaciones;
    /* Atributo que identifica el número de baños de un inmueble para
    vivienda */
    protected int numeroBanos;
    
/**
* Constructor de la clase InmuebleVivienda
*/
public InmuebleVivienda(int identificadorInmobiliario, int area, String
direccion, int numeroHabitaciones, int numeroBanos) {
    super(identificadorInmobiliario, area, direccion); /* Invoca al
    constructor de la clase padre */
    this.numeroHabitaciones = numeroHabitaciones;
    this.numeroBanos = numeroBanos;
}

/**
* Método que muestra en pantalla los datos de un inmueble para la
* vivienda
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Número de habitaciones = " +
    numeroHabitaciones);
    System.out.println("Número de baños = " + numeroBanos);
}
}