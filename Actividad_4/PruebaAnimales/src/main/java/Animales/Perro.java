
package Animales;

/**
* Esta clase concreta denominada Perro es una subclase de Cánido.
*/
public class Perro extends Canido {
/**
* Método que devuelve un String con el sonido de un perro
*/
public String getSonido() {
return "Ladrido";
}

/**
* Método que devuelve un String con los alimentos de un perro
*/
public String getAlimentos() {
return "Carnívoro";
}

/**
* Método que devuelve un String con el hábitat de un perro
*/
public String getHabitat() {
return "Doméstico";
}

/**
* Método que devuelve un String con el nombre científico de un perro
*/
public String getNombreCientifico() {
return "Canis lupus familiaris";
}

}