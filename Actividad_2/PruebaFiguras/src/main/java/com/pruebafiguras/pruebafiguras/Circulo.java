
package com.pruebafiguras.pruebafiguras;

public class Circulo {
    int radio; //Se define el atributo radio
    
    Circulo(int radio){
        this.radio = radio;
    }
    /* El metodo constructor Circulo de la clase Circulo
    ** compuesto por el parametro radio 
    */
    
    /* A continuacion se especifican los metodos calcularArea
    y calcularPerimetro usando el atributo radio    
    */
    
    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    
    double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
      
}
