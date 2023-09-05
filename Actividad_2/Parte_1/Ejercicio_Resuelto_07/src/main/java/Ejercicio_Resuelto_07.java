
import java.util.Scanner;

public class Ejercicio_Resuelto_07 {

    public static void main(String[] args) {
        
        /* Se leen los valores A y B como entradas */
        
        System.out.println("Ingrese un numero A: ");
        Scanner entrada1 = new Scanner(System.in);
        float A = entrada1.nextFloat();
        
        System.out.println("Ingrese un numero B: ");
        Scanner entrada2 = new Scanner(System.in);
        float B = entrada2.nextFloat();
        
        /* Se hace la comparacion entre ellos */
        
        if(A > B){
            System.out.println("A es mayor que B");
        }
        else if (A < B){
            System.out.println("A es menor que B");
        }
        else {
            System.out.println("A es igual a B");
        }
    }
}
