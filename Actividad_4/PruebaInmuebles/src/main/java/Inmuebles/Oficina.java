package Inmuebles;
/**
* Esta clase denominada Oficina modela un tipo específico de local
* con atributos como el valor por área y un valor booleano para
* determinar si pertenece o no al gobierno.
*/
public class Oficina extends Local {
    // Atributo que identifica el valor por área de una oficina
    protected static double valorArea = 3500000;
    // Atributo que identifica si una oficina pertenece o no al gobierno
    protected boolean esGobierno;
/**
* Constructor de la clase Oficina
*/
public Oficina(int identificadorInmobiliario, int area, String
direccion, tipo tipoLocal, boolean esGobierno) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, area, direccion, tipoLocal);
this.esGobierno = esGobierno;
}
/**
* Método que muestra en pantalla los datos de una oficina
*/
void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println("Es oficina gubernamental = " + esGobierno);
System.out.println();
}
}