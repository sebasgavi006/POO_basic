
package Animales;

/**
* Esta clase concreta denominada Lobo es una subclase de Cánido.
*/
public class Lobo extends Canido {
/**
* Método que devuelve un String con el sonido de un lobo
*/
public String getSonido() {
return "Aullido";
}

/**
* Método que devuelve un String con los alimentos de un lobo
*/
public String getAlimentos() {
return "Carnívoro";
}

/**
* Método que devuelve un String con el hábitat de un lobo
*/
public String getHabitat() {
return "Bosque";
}

/**
* Método que devuelve un String con el nombre científico de un lobo
*/
public String getNombreCientifico() {
return "Canis lupus";
}
}