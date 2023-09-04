
import java.util.Scanner;

public class Ejercicio_Propuesto_18 {

    public static void main(String[] args) {
        /* Se declaran las variables y se leen las entradas de
        todos los datos necesarios: codigoEmpleado, nombres,
        numeroHoras, valorHora, y porcentRetencion
        */
        
        float salarioBruto, salarioNeto;
        
        //Lee el codigo del empleado (entero)
        System.out.println("Ingrese el codigo del empleado: ");
        Scanner entrada1 = new Scanner(System.in);
        int codigoEmpleado = entrada1.nextInt();
        
        //Lee el nombre del empleado (Cadena de caracteres)
        System.out.println("Ingrese el nombre completo del empleado: ");
        Scanner entrada2 = new Scanner(System.in);
        String nombreEmpleado = entrada2.nextLine();
        
        //Lee el numero de horas trabajadas al mes (decimal)
        System.out.println("Ingrese las horas trabajadas al mes: ");
        Scanner entrada3 = new Scanner(System.in);
        float numeroHoras = entrada3.nextFloat();
        
        //Lee el valor por horas trabajada (decimal)
        System.out.println("Ingrese el valor por hora trabajada: ");
        Scanner entrada4 = new Scanner(System.in);
        float valorHora = entrada4.nextFloat();
        
        //Lee el porcentaje de retencion (decimal)
        System.out.println("Ingrese el porcentaje de retencion: ");
        Scanner entrada5 = new Scanner(System.in);
        float porcentRetencion = entrada5.nextFloat();
        
        /* Se realizan las operaciones para calcular los salarioBruto
           y salarioNeto
        */
        
        salarioBruto = numeroHoras * valorHora;
        
        float porcentDecimal;
        
        if(porcentRetencion < 0 || porcentRetencion >1) {
            porcentDecimal = porcentRetencion / 100;
        }
        else {
            porcentDecimal = porcentRetencion;
        }
        
        salarioNeto = salarioBruto * (1 - porcentDecimal);
        
        System.out.println("El codigo del empleado es: "+codigoEmpleado);
        System.out.println("El nombre del empleado es: "+nombreEmpleado);
        System.out.println("El salario bruto del empleado es: "+salarioBruto);
        System.out.println("El salario neto del empleado es: "+salarioNeto);
        
    }
}