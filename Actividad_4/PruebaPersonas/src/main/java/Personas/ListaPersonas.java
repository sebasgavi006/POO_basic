
package Personas;
import java.util.*;

/**
* Esta clase denominada ListaPersonas define un vector de Personas.
*/
public class ListaPersonas {
    Vector listaPersonas; // Atributo que identifica un vector de personas

/**
* Constructor de la clase ListaPersonas
*/
public ListaPersonas() {
    listaPersonas = new Vector(); // Crea el vector de personas
}

/**
* Método que permite agregar una persona al vector de personas
*/
public void anadirPersona(Persona p) {
    listaPersonas.add(p);
}

/**
* Método que permite eliminar una persona del vector de personas
*/
public void eliminarPersona(int i) {
    listaPersonas.removeElementAt(i);
}

/**
* Método que permite eliminar todos los elementos del vector de
* personas
*/
public void borrarLista() {
    listaPersonas.removeAllElements();
}
}