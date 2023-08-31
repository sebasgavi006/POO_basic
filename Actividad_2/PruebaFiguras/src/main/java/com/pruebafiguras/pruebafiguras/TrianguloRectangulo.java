
package com.pruebafiguras.pruebafiguras;

public class TrianguloRectangulo {
    
    // Se definen los atributos de la clase TrianguloRectangulo
    int base;
    int altura;
    
    /* Se define el Constructor de la clase,
    ** cuyos parametros son base y altura
    */
    
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /* Se definen los metodos calcularArea,
    ** calcularPetrimetro, calcularHipotenusa
    ** y determinarTipoTriangulo; cuyos parametros
    son base y altura
    */
    
    double calcularArea() {
        return (base*altura/2);
    }
    
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca
        la clase calcularHipotenusa*/
    }
    
    double calcularHipotenusa() {
        return Math.pow((base*base + altura*altura), 0.5);
    }
    
    void determinarTipoTriangulo() {
        
        if ((base == altura) && (base == calcularHipotenusa())
                && (altura == calcularHipotenusa()))
            System.out.println("Es un triangulo equilatero");
        /* Equilatero: todos sus lados son iguales */
        
        else if ((base != altura) && (base != calcularHipotenusa())
                && (altura != calcularHipotenusa()))
            System.out.println("Es un triangulo escaleno");
        /* Escaleno: todos sus lados son diferentes */
        
        else
            System.out.println("Es un triangulo isosceles");
        /* Isosceles: dos de sus lados son iguales */
    }
    
}
