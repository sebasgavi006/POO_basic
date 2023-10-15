package Inmuebles;
/**
* Esta clase denominada CasaIndependiente modela un tipo específico
* de casa urbana que no está en conjunto cerrado y es completamente
* independiente de otras casas. Tiene un atributo estático para
* especificar un valor del área del inmueble.
*/
public class CasaIndependiente extends CasaUrbana {
    // Atributo que identifica el valor por área de una casa independiente
    protected static double valorArea = 3000000;
/**
* Constructor de la clase CasaIndependiente
*/
public CasaIndependiente(int identificadorInmobiliario, int area,
String direccion, int numeroHabitaciones, int numeroBanos, int
numeroPisos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion,
    numeroHabitaciones, numeroBanos, numeroPisos);
}
/**
* Método que muestra en pantalla los datos de una casa independiente
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println();
}
}