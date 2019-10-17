
package Objeto;

/**
 * TABOADA PAUCAR LUIS.
 */
public class Ventana {
    int tamaño;
    String Color;
    String Marca;
    String Tactil;
    float Precio;
    
    public static void main(String[] args) {
        // VARIABLES
        Ventana ven= new Ventana();
        // asignacion de datos
        ven.tamaño=24;
        ven.Tactil="Incorporado";
        ven.Precio=2000;
        ven.Marca="Sansun";
        ven.Color="Negro Claro";
        //imprimer los datos
        System.out.println("el tamaño en pulgadas :"+ ven.tamaño);
        System.out.println("tactil :"+ ven.Tactil);
        System.out.println("Precio :"+ ven.Precio);
        System.out.println("Marca :"+ ven.Marca);
        System.out.println("Color: "+ ven.Color);
    }
    
}
