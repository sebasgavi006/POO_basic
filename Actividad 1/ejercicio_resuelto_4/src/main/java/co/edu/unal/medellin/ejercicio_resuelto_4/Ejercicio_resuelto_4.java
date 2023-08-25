package co.edu.unal.medellin.ejercicio_resuelto_4;
/*
@author sgaviriav
 */
import java.util.Scanner;
public class Ejercicio_resuelto_4 {

    public static void main(String[] args) {
        
        int Juan, Alberto, Ana, Mama_Juan;
        System.out.println("¿Cual es la edad de Juan?: ");
        Scanner Edad_Juan = new Scanner(System.in);
        Juan = Edad_Juan.nextInt();
        Alberto = Juan * 2 / 3;
        Ana = Juan * 4 / 3;
        Mama_Juan = Juan+Alberto+Ana;
        System.out.println("La edad de los miembros de la familia es: ");
        System.out.println("Juan: "+Juan);
        System.out.println("Alberto: "+Alberto);
        System.out.println("Ana: "+Ana);
        System.out.println("Mama de Juan: "+Mama_Juan);
               
    }
}