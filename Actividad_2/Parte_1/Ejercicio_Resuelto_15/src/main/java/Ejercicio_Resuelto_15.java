
import java.util.Scanner;

public class Ejercicio_Resuelto_15 {

    public static void main(String[] args) {
        /* Se solicita ingresar el valor del peso de las 4 esferas, donde 
        3 de ellas pesan lo mismo. 
        Se declaran el resto de variables
        */
        
        System.out.println("Ingrese el peso de la esfera A: ");
        Scanner objeto_pesoA = new Scanner(System.in);
        float pesoA = objeto_pesoA.nextFloat();
        
        System.out.println("Ingrese el peso de la esfera B: ");
        Scanner objeto_pesoB = new Scanner(System.in);
        float pesoB = objeto_pesoB.nextFloat();
        
        System.out.println("Ingrese el peso de la esfera C: ");
        Scanner objeto_pesoC = new Scanner(System.in);
        float pesoC = objeto_pesoC.nextFloat();
        
        System.out.println("Ingrese el peso de la esfera D: ");
        Scanner objeto_pesoD = new Scanner(System.in);
        float pesoD = objeto_pesoD.nextFloat();
        
        /* Se comparan el peso de una de las esferas con el de otras dos,
        para hallar la esfera de diferente peso.
        Se determina cual esfera pesa mas, con respecto a la esfera usada
        en la comparacion inicial
        */
        
        if((pesoA == pesoB) && (pesoA == pesoC)){
            System.out.print("La esfera D es la diferente y ");
            if(pesoD > pesoA){
                System.out.println("es de mayor peso");
            }
            else {
                System.out.println("es de menor peso");
            }
        }
        
        else if((pesoA == pesoC) && (pesoA == pesoD)){
            System.out.print("La esfera B es la diferente y ");
            if(pesoB > pesoA){
                System.out.println("es de mayor peso");
            }
            else {
                System.out.println("es de menor peso");
            }
        }
        
        
        else if((pesoA == pesoB) && (pesoA == pesoD)){
            System.out.print("La esfera C es la diferente y ");
            if(pesoC > pesoA){
                System.out.println("es de mayor peso");
            }
            else {
                System.out.println("es de menor peso");
            }
        }
        
        else {
            System.out.print("La esfera A es la diferente y ");
            if (pesoA > pesoB) {
                System.out.println("es de mayor peso");
            }
            else {
                System.out.println("es de menor peso");
            }            
        }
        
    }
}
