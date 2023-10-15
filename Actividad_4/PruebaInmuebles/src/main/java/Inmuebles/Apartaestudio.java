package Inmuebles;
/**
* Esta clase denominada Apartaestudio modela un tipo específico de
* apartamento que tiene una sola habitación.
*/
    public class Apartaestudio extends Apartamento {
    // Atributo que identifica el valor por área de un apartaestudio
    protected static double valorArea = 1500000;
/**
* Constructor de la clase Apartaestudio
*/
public Apartaestudio(int identificadorInmobiliario, int area, String
direccion, int numeroHabitaciones, int numeroBanos) {
    // Invoca al constructor de la clase padre
    // Los apartaestudios tienen una sola habitación y un solo baño
    super(identificadorInmobiliario, area, direccion, 1, 1);
}
/**
* Método que muestra en pantalla los datos de un apartaestudio
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println();
}
}
