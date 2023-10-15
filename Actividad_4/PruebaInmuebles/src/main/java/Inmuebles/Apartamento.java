package Inmuebles;

/**
* Esta clase denominada Apartamento modela un tipo de inmueble
* específico destinado para la vivienda.
*/

public class Apartamento extends InmuebleVivienda {
/**
* Constructor de la clase Apartamento
*/
public Apartamento(int identificadorInmobiliario, int area, String
direccion, int numeroHabitaciones, int numeroBanos) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion,
    numeroHabitaciones, numeroBanos);
}
/**
* Método que muestra en pantalla los datos de un apartamento
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
}
}
