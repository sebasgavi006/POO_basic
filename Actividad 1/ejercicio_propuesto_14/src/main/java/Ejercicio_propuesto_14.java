/**
 *
 * @author sgaviriav
 */

import java.util.Scanner;
public class Ejercicio_propuesto_14 {

    public static void main(String[] args) {
        
        //Se declara la variable y se inicializa
        double number;
        
        //Se lee el numero 
        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        number = entrada.nextDouble();
        
        //Se imprimen los resultados
        System.out.println("El cuadrado del numero ingresado es: "+ (Math.pow(number,2)));
        System.out.println("El cubo del numero ingresado es: "+ (Math.pow(number,3)));
        
    }
}
