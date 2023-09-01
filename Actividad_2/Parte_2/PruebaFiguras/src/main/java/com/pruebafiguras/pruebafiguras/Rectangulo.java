
package com.pruebafiguras.pruebafiguras;

public class Rectangulo {
    
    // Se crean los atributos para la clasr Rectangulo
    int base;
    int altura;
    
    /* Constructor de la clase Rectangulo, cuyos
    ** parametros son base y altura
    */
    
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /* Se instancian los metodos calcularArea y
    ** calcularPerimetro, utilizando los
    ** parametros base y altura
    */
    
    float calcularArea() {
        return base*altura;
    }
    
    float calcularPerimetro() {
        return (2*base) + (2*altura);
    }
    
}
