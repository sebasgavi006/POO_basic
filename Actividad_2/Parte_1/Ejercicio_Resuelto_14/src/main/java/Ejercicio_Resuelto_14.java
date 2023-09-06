
import java.util.Scanner;

public class Ejercicio_Resuelto_14 {

    public static void main(String[] args) {
        /* Se leen los valores de las ventas de los tres departamentos de la
        empresa y el salario que reciben los vendedores de cada departamento
        */
        
        double salario1, salario2, salario3;
        
        System.out.println("Ingrese el valor de las ventas del depto. 1: ");
        Scanner entrada1 = new Scanner(System.in);
        float ventas1 = entrada1.nextFloat();
        
        System.out.println("Ingrese el valor de las ventas del depto. 2: ");
        Scanner entrada2 = new Scanner(System.in);
        float ventas2 = entrada2.nextFloat();
        
        System.out.println("Ingrese el valor de las ventas del depto. 3: ");
        Scanner entrada3 = new Scanner(System.in);
        float ventas3 = entrada3.nextFloat();
        
        System.out.println("Ingrese el valor del salario de los vendedores: ");
        Scanner entrada4 = new Scanner(System.in);
        float salarioBase = entrada4.nextFloat();
        
        /* Se calcula el 33% de las ventas totales */
        double porcVentas = (ventas1 + ventas2 + ventas3) * 0.33;
        
        /* Se busca el/los departamentos con ventas >33% del total, y se incrementa el 20%
        el salario de sus empleados
        */
        
        if(ventas1 > porcVentas) {
            salario1 = salarioBase * 1.2;
        }
        else {
            salario1 = salarioBase;
        }
        
        if(ventas2 > porcVentas) {
            salario2 = salarioBase * 1.2;
        }
        else {
            salario2 = salarioBase;
        }
        
        if(ventas3 > porcVentas) {
            salario3 = salarioBase * 1.2;
        }
        else {
            salario3 = salarioBase;
        }
        
        System.out.printf("El salario de los vendedores del depto. 1 es: %.2f", salario1);
        System.out.println();
        System.out.printf("El salario de los vendedores del depto. 2 es: %.2f", salario2 );
        System.out.println();
        System.out.printf("El salario de los vendedores del depto. 3 es: %.2f", salario3 );
        System.out.println();
    }
}
