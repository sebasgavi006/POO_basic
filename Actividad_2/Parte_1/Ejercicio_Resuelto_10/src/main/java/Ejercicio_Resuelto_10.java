
import java.util.Scanner;

public class Ejercicio_Resuelto_10 {

    public static void main(String[] args) {
        
        /* Se obtienen las entradas del programa, siendo Numero de inscripcion,
        Nombres, Patrimonio y Estaro social
        */
        
        System.out.println("Ingrese el numero de inscripcion: ");
        Scanner entrada1 = new Scanner(System.in);
        int numeroInscripcion = entrada1.nextInt();
        
        System.out.println("Ingrese el nombre: ");
        Scanner entrada2 = new Scanner(System.in);
        String nombres = entrada2.nextLine();
        
        System.out.println("Ingrese el patrimonio: ");
        Scanner entrada3 = new Scanner(System.in);
        float patrimonio = entrada3.nextFloat();
        
        System.out.println("Ingrese el estrato social: ");
        Scanner entrada4 = new Scanner(System.in);
        int estrato = entrada4.nextInt();
        
        /* Se imprimen las salidas Numero de inscripcion, Nombres y el
        calculo del patrimonio segun el caso
        */
        
        System.out.println("El numero de inscripcion es: " + numeroInscripcion);
        System.out.println("El nombre es: " + nombres);
        
        if( estrato > 3 && patrimonio > 2000000) {
            System.out.println("El valor de la matricula es: " + (50000 + (patrimonio*0.03)));
        } else {
            System.out.println("El valor de la matricula es: " + 50000 );
        }
        
        
    }
}
