/**
 *
 * @author sgaviriav
 */

//Se importan las librerias necesarias
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_propuesto_17 {

    public static void main(String[] args) {
        
        //Se declara la variable
        double radio, area, circunferencia;
        
        //Se solicita el valor del radio al usuario
        System.out.println("Ingrese el valor del radio (puede ser decimal): ");
        Scanner entrada = new Scanner(System.in);
        radio = entrada.nextDouble();
        
        //Se hacen las operaciones para halla
        //el area y la circunferencia
        area = Math.PI * Math.pow(radio,2);
        circunferencia = 2 * Math.PI * radio;
        
        //Se imprimen los resultados
        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println("El area del circulo es: " + formato1.format(area));
        System.out.println("La circunferencia del circulo es: " + formato1.format(circunferencia));
   
    }
}
