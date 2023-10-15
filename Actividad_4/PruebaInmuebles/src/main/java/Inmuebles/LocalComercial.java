package Inmuebles;
/**
* Esta clase denominada LocalComercial modela un tipo específico de
* Local destinado para un uso comercial con atributos como el valor
* por área y el centro comercial al cual pertenece.
*/
public class LocalComercial extends Local {
    // Atributo que identifica el valor por área de un local comercial
    protected static double valorArea = 3000000;
    /* Atributo que identifica el centro comercial donde está ubicado el
    local comercial */
    protected String centroComercial;
/**
* Constructor de la clase LocalComercial
*/
public LocalComercial(int identificadorInmobiliario, int area, String
direccion, tipo tipoLocal, String centroComercial) {
    // Invoca al constructor de la clase padre
    super(identificadorInmobiliario, area, direccion, tipoLocal);
    this.centroComercial = centroComercial;
}
/**
* Método que muestra en pantalla los datos de un local comercial
*/
void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Centro comercial = " + centroComercial);
    System.out.println();
}
}
