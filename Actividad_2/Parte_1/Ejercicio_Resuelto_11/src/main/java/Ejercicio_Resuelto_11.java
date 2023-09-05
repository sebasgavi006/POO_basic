        
import java.util.Scanner;

public class Ejercicio_Resuelto_11 {

    public static void main(String[] args) {
        /* Se declaran las variables para el problema, que son 3 variables para
        3 numeros y una variable para almacenar el numero mayor*/
        
        int n1, n2, n3, mayor;        
        
        /* Se leen los valores A y B como entradas */
        
        System.out.println("Ingrese el primer numero entero: ");
        Scanner input1 = new Scanner(System.in);
        n1 = input1.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        Scanner input2 = new Scanner(System.in);
        n2 = input2.nextInt();
       
        System.out.println("Ingrese el tercer numero entero: ");
        Scanner input3 = new Scanner(System.in);
        n3 = input3.nextInt();
        
        /* Se hace la comparacion entre los 3 numeros para hallar el mayor */
        
        if(n1 > n2 && n1>n3){
            mayor = n1;
        }
        else if (n2 > n3){
            mayor = n2;
        }
        else {
            mayor = n3;
        }
        
        System.out.println("El valor mayor entre "+n1+", "+n2+" y "+n3+" es: "+mayor);
        
    }
}