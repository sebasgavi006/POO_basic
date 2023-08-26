/**
 *
 * @author sgaviriav
 */

public class Ejercicio_resuelto_5 {

    public static void main(String[] args) {
         
        //Se delcaran las variables y se inicializan
        double suma=0, x=20, y=40;
        
        //Se realizan las operaciones del problema
        suma = suma + x;
        x = x + Math.pow(y,2);
        suma = suma + x / y;
        
        //Se imprime la salida
        System.out.println("El valor de la suma es: 0.2%f"+suma);
        
    }
}
