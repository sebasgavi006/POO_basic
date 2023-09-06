
import java.util.Scanner;

public class Ejercicio_Propuesto_24 {

    public static void main(String[] args) {
        
        /* Se leen los pesos de las esferas A, B y C como entradas */
        
        System.out.println("Ingrese el peso de la esfera A: ");
        Scanner entrada1 = new Scanner(System.in);
        float pesoA = entrada1.nextFloat();
        
        System.out.println("Ingrese el peso de la esfera B: ");
        Scanner entrada2 = new Scanner(System.in);
        float pesoB = entrada2.nextFloat();
        
        System.out.println("Ingrese el peso de la esfera C: ");
        Scanner entrada3 = new Scanner(System.in);
        float pesoC = entrada3.nextFloat();
        
        /* Se hace la comparacion entre ellos */
        
        if((pesoA > pesoB) && (pesoA > pesoC)){
            System.out.println("La esfera A es la que pesa más");
        }
        else if ((pesoB > pesoA) && (pesoB > pesoC)){
            System.out.println("La esfera B es la que pesa más");
        }
        else {
            System.out.println("La esfera C es la que pesa más");
        }
    }
}