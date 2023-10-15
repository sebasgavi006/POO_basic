
package CarreraCiclistica;

/**
* Esta clase denominada Contrarrelojista es un tipo de Ciclista que se
* encuentra mejor adaptado a las etapas contrarreloj. Posee un nuevo
* atributo: su velocidad máxima
*/

public class Contrarrelojista extends Ciclista {
    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMaxima;
    
/**
* Constructor de la clase Escalador
*/
public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
    super(identificador, nombre);
    this.velocidadMaxima = velocidadMaxima;
}

/**
* Método que devuelve la velocidad máxima de un contrarrelojista
*/
protected double getVelocidadMaxima() {
    return velocidadMaxima;
}

/**
* Método que establece la velocidad máxima de un contrarrelojista
*/
protected void setVelocidadMáxima(double velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
}

/**
* Método que muestra en pantalla los datos de un contrarrelojista
*/
protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Aceleración promedio = " + velocidadMaxima);
}
/**
* Método que devuelve el tipo de ciclista
*/
protected String imprimirTipo() {
    return "Es un constrarrelojista";
}
}
