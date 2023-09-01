
package com.pruebafiguras.pruebafiguras;

public class PruebaFiguras {

    public static void main(String[] args) {
        
        /* Se definen objetos instanciados a cada una
        ** de las clases creadas anteriormente, con
        ** sus respectivos parametro
        */
        
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        
        /* Se muestran los resultados de cada objeto (valores)
        ** cuando cada instancia pasa por los respectivos
        ** metodos de cada clase
        */
        
        System.out.println("El area del circulo es = "+
                figura1.calcularArea()); /* Cada objeto, al estar
        instanciado en una clase especifica, puede acceder a sus metodos*/
        System.out.println("El perimetro del circulo es = "+
                figura1.calcularPerimetro());
        System.out.println(); //Deja un salto de linea
        
        System.out.println("El area del rectangulo es = "+
                figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = "+
                figura2.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del cuadrado es = "+
                figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = "+
                figura3.calcularPerimetro());
        System.out.println();
        
        System.out.println("El area del triangulo es = "+
                figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = "+
                figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        
    }
}
