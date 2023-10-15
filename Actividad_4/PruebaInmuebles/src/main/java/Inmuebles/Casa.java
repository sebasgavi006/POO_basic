package Inmuebles;

/**
* Esta clase denominada Casa modela un tipo específico de inmueble
* destinado para la vivienda con atributos como el número de pisos
* que tiene una casa.
*/
public class Casa extends InmuebleVivienda {
    protected int numeroPisos; /* Atributo que identica el número de
    pisos que tiene una casa */
    
/**
* Constructor de la clase Casa
*/
public Casa(int identificadorInmobiliario, int area, String direccion,
int numeroHabitaciones, int numeroBanos, int numeroPisos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion,
    numeroHabitaciones, numeroBanos);
    this.numeroPisos = numeroPisos;
}

/**
* Método que muestra en pantalla los datos de una casa
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Número de pisos = " + numeroPisos);
}
}