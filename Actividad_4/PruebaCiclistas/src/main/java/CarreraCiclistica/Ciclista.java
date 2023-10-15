
package CarreraCiclistica;

/**
* Esta clase abstracta denominada Ciclista posee como atributos un
* identificador, un nombre y un tiempo acumulado en una carrera
* ciclística.
*/
public abstract class Ciclista {
    private int identificador; /* Atributo que define el identificador de
    un ciclista */
    private String nombre; // Atributo que define el nombre del ciclista
    private int tiempoAcumulado = 0; /* Atributo que define el tiempo
    acumulado de un ciclista */

/**
* Constructor de la clase Ciclista
*/
public Ciclista(int identificador, String nombre) {
    this.identificador = identificador;
    this.nombre = nombre;
}

/**
* Método abstracto que muestra en pantalla el tipo específico de un
* ciclista
*/
abstract String imprimirTipo();

/**
* Método que devuelve el identificador de un ciclista
*/
protected int getIdentificador() {
    return identificador;
}

/**
* Método que establece el identificador de un ciclista
*/
protected void setIdentificador() {
    this.identificador = identificador;
}

/**
* Método que devuelve el nombre de un ciclista
*/
protected String getNombre() {
    return nombre;
}

/**
* Método que establece el nombre de un ciclista
*/
protected void setNombre(String nombre) {
    this.nombre = nombre;
}

/**
* Método que devuelve el puesto que ocupa un ciclista en la
* posición general de la competencia
*/
protected int getPosicionGeneral(int posicionGeneral) {
    return posicionGeneral;
}

/**
* Método que establece el puesto que ocupa un ciclista en la
* posición general
*/
protected void setPosicionGeneral(int posicionGeneral) {
    posicionGeneral = posicionGeneral;
}

/**
* Método que devuelve el tiempo acumulado de un ciclista en una
* competencia
*/
protected int getTiempoAcumulado() {
    return tiempoAcumulado;
}

/**
* Método que establece el tiempo acumulado por un ciclista
*/
protected void setTiempoAcumulado(int tiempoAcumulado) {
    this.tiempoAcumulado = tiempoAcumulado;
}

/**
* Método muestra en pantalla los datos de un ciclista
*/
protected void imprimir() {
    System.out.println("Identificador = " + identificador);
    System.out.println("Nombre = " + nombre);
    System.out.println("Tiempo Acumulado = " + tiempoAcumulado);
}
}