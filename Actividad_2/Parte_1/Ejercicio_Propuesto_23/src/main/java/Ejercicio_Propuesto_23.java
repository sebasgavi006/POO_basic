
import java.util.Scanner;

public class Ejercicio_Propuesto_23 {

    public static void main(String[] args) {
        /* Se leen los valores de los parametros A, B y C, todos ellos
        tipos de datos Double para poder utilizar el metodo .pow y .sqrt
        de la clase Math
        */
        
        double solucion1, solucion2;
        
        System.out.println("Ingrese el parametro A: ");
        Scanner parameterA = new Scanner(System.in);
        double A = parameterA.nextDouble();
        
        System.out.println("Ingrese el parametro B: ");
        Scanner parameterB = new Scanner(System.in);
        double B = parameterB.nextDouble();
        
        System.out.println("Ingrese el parametro C: ");
        Scanner parameterC = new Scanner(System.in);
        double C = parameterC.nextDouble();
        
        /* Se codifica la ecuacion para la Solucion de una Ecuacion
        Cuadratica General, a partir de los parametros (coeficientes)
        que acompañan la variable en sus diferentes potencias
        */
        
        /* Se presupone que la solucion de la ecuacion de segundo grado
        es de caracter real */
        
        solucion1 = (-B + Math.sqrt(Math.pow(B,2) - (4 * A * C))) / (2 * A); //Solucion con signo mas
        solucion2 = (-B - Math.sqrt(Math.pow(B,2) - (4 * A * C))) / (2 * A); //Solucion con el signo menos
        
        System.out.printf("Las soluciones de la ecuacion de segundo grado son: x= %.2f", solucion1);
        System.out.printf(" y x= %.2f", solucion2);
                          
    }
}
