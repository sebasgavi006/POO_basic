
package CarreraCiclistica;

/**
* Esta clase denominada Velocista es un tipo de Ciclista caracterizado
* por poseer gran potencia y alta velocidad punta en esfuerzos cortos.
* Posee nuevos atributos como la potencia promedio y la velocidad
* promedio
*/

public class Velocista extends Ciclista {
    private double potenciaPromedio; /* Atributo que define la potencia
    promedio de un velocista */
    private double velocidadPromedio; /* Atributo que define la
    velocidad promedio de un velocista */
    
/**
* Constructor de la clase Velocista
*/
public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
    super(identificador, nombre);
    potenciaPromedio = potenciaPromedio;
    this.velocidadPromedio = velocidadPromedio;
}

/**
* Método que devuelve la potencia promedio de un velocista
*/
protected double getPotenciaPromedio() {
    return potenciaPromedio;
}

/**
* Método que establece la potencia promedio de un velocista
*/
protected void setPotenciaPromedio(double potenciaPromedio) {
    this.potenciaPromedio = potenciaPromedio;
}

/**
* Método que devuelve la velocidad promedio de un velocista
*/
protected double getvelocidadPromedio() {
    return velocidadPromedio;
}

/**
* Método que establece la velocidad promedio de un velocista
*/
protected void setVelocidadPromedio(double velocidadPromedio) {
    this.velocidadPromedio = velocidadPromedio;
}

/**
* Método que muestra en pantalla los datos de un velocista
*/
protected void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Potencia promedio = " + potenciaPromedio);
    System.out.println("Velocidad promedio = " + velocidadPromedio);
}

/**
* Método que devuelve el tipo de ciclista
*/
protected String imprimirTipo() {
    return "Es un velocista";
}
}