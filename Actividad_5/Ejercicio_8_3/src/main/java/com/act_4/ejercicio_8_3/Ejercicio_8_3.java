
package com.act_4.ejercicio_8_3;

/**
* Esta clase define el punto de ingreso al programa de figuras
* geométricas. Por lo tanto, cuenta con un método main de acceso al
* programa.
*/
public class Ejercicio_8_3 {
/**
* Método main que sirve de punto de entrada al programa
*/
public static void main(String[] args) {
VentanaPrincipal miVentanaPrincipal; /* Define la ventana
principal */
miVentanaPrincipal= new VentanaPrincipal(); /* Crea la ventana
principal */
miVentanaPrincipal.setVisible(true); /* Establece la ventana
como visible */
// Establece que la ventana no puede cambiar su tamaño
miVentanaPrincipal.setResizable(false);
}
}