package Animales;
/**
* Esta clase concreta denominada Gato es una subclase de Felino.
*/
public class Gato extends Felino {
/**
* Método que devuelve un String con el sonido de un gato
*/
public String getSonido() {
return "Maullido";
}

/**
* Método que devuelve un String con los alimentos de un gato
*/
public String getAlimentos() {
return "Ratones";
}

/**
* Método que devuelve un String con el hábitat de un gato
*/
public String getHabitat() {
return "Doméstico";
}

/**
* Método que devuelve un String con el nombre científico de un gato
*/
public String getNombreCientifico() {
return "Felis silvestris catus";
}
}
