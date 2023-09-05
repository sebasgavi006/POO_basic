
import java.util.Scanner;

public class Ejercicio_Resuelto_13 {

    public static void main(String[] args) {
        /* Se declaran las variables y se leen las entradas */
        
        double valorPagar, porcentDesc;
        
        System.out.println("Ingrese el valor de la compra: ");
        Scanner entrada1 = new Scanner(System.in);
        float valorCompra = entrada1.nextFloat();
        
        System.out.println("Ingrese el color de la bolita (no deje ningun espacio): ");
        Scanner entrada2 = new Scanner(System.in);
        String colorBolita = entrada2.nextLine();
        
        /* Hacemos que las letras del string ingresado queden en mayusculas */
        
        String colorBolita_Mayus = colorBolita.toUpperCase();
        
        if ("BLANCO".equals(colorBolita_Mayus)) {
            porcentDesc = 0;
        }
        else if ("VERDE".equals(colorBolita_Mayus)) {
            porcentDesc = 0.1;
        }
        else if ("AMARILLO".equals(colorBolita_Mayus)) {
            porcentDesc = 0.25;
        }
        else if ("AZUL".equals(colorBolita_Mayus)) {
            porcentDesc = 0.5;
        }
        else {
            porcentDesc = 1;
        }
        
        valorPagar = valorCompra - (valorCompra * porcentDesc);
        
        System.out.printf("El cliente debe pagar: %.2f", valorPagar);
        System.out.println();
        
    }
}
