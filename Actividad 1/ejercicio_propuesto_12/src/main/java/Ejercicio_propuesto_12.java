/**
 *
 * @author sgaviriav
 */
public class Ejercicio_propuesto_12 {

    public static void main(String[] args) {
        
        int hours=48, price_hour=5000, gross_salary;
        float perc_retention=(float) 0.125, net_salary, retention;
                
        gross_salary = hours * price_hour;
        retention = gross_salary * perc_retention;
        net_salary = gross_salary - retention;
        
        System.out.println("El salario bruto es: "+gross_salary);
        System.out.println("El valor de la reteción en la fuente es: "+retention);
        System.out.println("El salario neto es: "+net_salary);
        
    }
}
