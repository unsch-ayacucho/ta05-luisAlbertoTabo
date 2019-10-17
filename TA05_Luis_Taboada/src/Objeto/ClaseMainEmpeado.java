
package Objeto;

/**
 *
 * @author ASUS
 */
public class ClaseMainEmpeado {

    public static void main(String[] args) {
        // objeto del a clase empleado
        Empleado emp= new Empleado();
        //atributos
        emp.HorasExtras=10;
        emp.Sueldo=100;
        emp.AFP=1/100;
        emp.SNP=1/100;
        emp.Salud=3/100;
        
        //metodos del objetos
        float MontoHE=emp.montoHE();
        System.out.println("el monto :"+MontoHE);
        float DescuentoAFP=emp.DescuentoAFP();
        System.out.println("el descuento en AFP :"+DescuentoAFP);
        float DescuentoSNP=emp.DescuentoSNP();
        System.out.println("Descuento SNP :"+ DescuentoSNP);
        float DescuentoSalud=emp.DescuentoSalud();
        System.out.println("Descuento en Salud :"+ DescuentoSalud);
        float TotalDescuento=emp.TotalDescuento();
        System.out.println("El total Descuento :"+TotalDescuento);
        float SueldoNeto=emp.SueldoNeto();
        System.out.println("El SUeldo Neto :"+ SueldoNeto);
    }
    
}
