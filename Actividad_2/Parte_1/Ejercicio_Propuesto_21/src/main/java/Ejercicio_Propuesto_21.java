
import java.util.Scanner;

public class Ejercicio_Propuesto_21 {

    public static void main(String[] args) {
        /* Se declaran las variables a utilizar */
        
        double perimetro, semiperimetro, s, area;
        
        /* Se ingresa el valor del lado del triangulo */   
        System.out.println("Ingrese el valor del primer lado del triangulo: ");
        Scanner objeto_lado1 = new Scanner(System.in);
        float lado1 = objeto_lado1.nextFloat();
        
        System.out.println("Ingrese el valor del segundo lado del triangulo: ");
        Scanner objeto_lado2 = new Scanner(System.in);
        float lado2 = objeto_lado2.nextFloat();
        
        System.out.println("Ingrese el valor del tercer lado del triangulo: ");
        Scanner objeto_lado3 = new Scanner(System.in);
        float lado3 = objeto_lado3.nextFloat();
        
        /* Se hacen los calculos y se imprimen los resultados */
        perimetro = lado1 + lado2 + lado3;
        
        //El semiperimetro es la mitad del perimetro
        semiperimetro = perimetro / 2;
        s = semiperimetro;
                
        //Usando la Formula de Heron para calcular el area a partir del semiperimetro
        area = Math.sqrt(s * (s-lado1) * (s-lado2) + (s-lado3));
        
        System.out.printf("El perimetro del triangulo es: %.2f", perimetro);
        System.out.println();
        System.out.printf("El semiperimetro del triangulo es: %.2f", semiperimetro );
        System.out.println();
        System.out.printf("El area del triangulo es: %.2f", area );
        System.out.println();
        
    }
}
