
import java.util.Scanner;

public class Ejercicio_Resuelto_12 {

    public static void main(String[] args) {
        /* Se delcaran todas las variables implicadas
        en el problema, y se inicializan las primeras realizando 
        inicialmente la lectura de las mismas 
        */
        
        /*HET = Horas extras trabajadas
          HEE8 = Horas extras que exceden de 8
          SALARIO = Salario semanal del trabajador
        */
        
        float HET, HEE8, SALARIO;
        
        System.out.println("Ingrese el nombre del trabajador: ");
        Scanner nombre = new Scanner(System.in);
        String NOM = nombre.nextLine();
        
        System.out.println("Ingrese el numero de horas trabajadas en la semana: ");
        Scanner horas = new Scanner(System.in);
        float NHT = horas.nextFloat();
        
        System.out.println("Ingrese el valor normal de la hora de trabajo: ");
        Scanner valorHora = new Scanner(System.in);
        float VHN = valorHora.nextFloat();
        
        if(NHT > 40) {
            HET = NHT - 40;
            if(HET > 8) {
                HEE8 = HET - 8;
                SALARIO = (40 * VHN) + (16 * VHN) + (HEE8 * 3 * VHN);
            }
            else {
                SALARIO = (40 * VHN) + (HET * 2 * VHN);
            }
        }    
        else {
            SALARIO = NHT * VHN;
        }
        
        System.out.print("El trabajdor "+NOM+" devengo: $");
        System.out.printf("%.2f", SALARIO);
        
    }
}
