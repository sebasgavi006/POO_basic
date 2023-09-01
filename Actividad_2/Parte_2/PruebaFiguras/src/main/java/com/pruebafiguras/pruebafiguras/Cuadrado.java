
package com.pruebafiguras.pruebafiguras;

public class Cuadrado {
    
    int lado; // El atributo de la clase cuadrado es el lado
    
    /* Se instancia el Constructor Cuadrado, cuyo
    ** parametro es el lado
    */
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    /* Se instancian los metodos calcularArea
    ** y calcularPerimetro, que usaran el 
    ** parametro lado
    */
    
    double calcularArea() {
        return Math.pow(lado,2);
    }
    
    double calcularPerimetro() {
        return (4*lado);
    }
    
}
