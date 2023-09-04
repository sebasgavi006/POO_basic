
import java.util.Scanner;

public class Ejercicio_Propuesto_19 {

    public static void main(String[] args) {
        /* Se declaran las variables a utilizar */
        
        float perimetro;
        double altura, area;
        
        /* Se ingresa el valor del lado del triangulo */        
        System.out.println("Ingrese el valor del lado del triangulo equilatero: ");
        Scanner objeto_lado = new Scanner(System.in);
        float lado = objeto_lado.nextFloat();
        
        perimetro = lado * 3;
        
        altura = (lado * Math.sqrt(3)) / 2;
        
        area = (lado * altura) / 2;
        
        System.out.println("El perimetro del triangulo equilatero es: "+perimetro);
        System.out.printf("La altura del trianqulo equilatero es: %.2f", altura );
        System.out.println();
        System.out.printf("El area del trianqulo equilatero es: %.2f", area );
        
    }
}
