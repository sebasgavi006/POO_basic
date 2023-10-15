package Inmuebles;
/**
* Esta clase denominada CasaUrbana modela un tipo específico de casa
* destinada para la vivienda localizada en el sector urbano.
*/
public class CasaUrbana extends Casa {
    
/**
* Constructor de la clase CasaUrbana
*/
public CasaUrbana(int identificadorInmobiliario, int area, String
direccion, int numeroHabitaciones, int numeroBanos, int
numeroPisos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion,
    numeroHabitaciones, numeroBanos, numeroPisos);
}
/**
* Método que muestra en pantalla los datos de una casa urbana
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
}
}