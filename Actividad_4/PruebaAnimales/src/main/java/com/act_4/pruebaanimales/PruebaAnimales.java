
package com.act_4.pruebaanimales;

/*
* Accedemos a todoas las clases del paquete Animales
*/
import Animales.*;

/**
* Esta clase prueba diferentes animales y sus métodos que están
* en el paquete Animales.
*/
public class PruebaAnimales {
/**
* Método main que crea un array de varios animales y para cada uno
* muestra en pantalla su nombre científico, su sonido, alimentos y
* hábitat
*/
public static void main(String[] args) {
    Animal[] animales = new Animal[4]; /* Define un array de cuatro
    elementos de tipo Animal */
    animales[0] = new Gato();
    animales[1] = new Perro();
    animales[2] = new Lobo();
    animales[3] = new Leon();
    for (int i = 0; i < animales.length; i++) {
        System.out.println(animales[i].getNombreCientifico());
        System.out.println("Sonido: " + animales[i].getSonido());
        System.out.println("Alimentos: " + animales[i].
        getAlimentos());
        System.out.println("Hábitat: " + animales[i].getHabitat());
        System.out.println();
    }
}
}