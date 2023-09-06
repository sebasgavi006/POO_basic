
import java.util.Scanner;

public class Ejercicio_Propuesto_22 {

    public static void main(String[] args) {
        /* Se ingresan como String el nombre del empleado, y como float
        el Salario por hora y el numero de horas trabajadas
        */
        
        System.out.println("Ingrese el nombre del empleado: ");
        Scanner entrada1 = new Scanner(System.in);
        String nombre = entrada1.nextLine();
        
        System.out.println("Ingrese el salario por hora del trabajdor: ");
        Scanner entrada2 = new Scanner(System.in);
        float salarioHora = entrada2.nextFloat();
        
        System.out.println("Ingrese el numero de horas trabajadas en el mes: ");
        Scanner entrada3 = new Scanner(System.in);
        float horas = entrada3.nextFloat();
        
        /* Se hace una comparacion para saber si el salario mensual del trabajador
        es mayor de $450000, y se muestran las salidas segun sea el caso
        */
        
        float salarioBasico = salarioHora * horas;
         
        if(salarioBasico > 450000) {
            System.out.print("El trabajador "+nombre);
            System.out.printf(" devenga un salario mensual de %.2f", salarioBasico);
        }
        else {
            System.out.print("El trabajador se llama "+nombre);
        }
        
    }
}
