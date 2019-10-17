
package Objeto;


public class Empleado {
   // atributos
    String codigo;
    String AreaLaboral;
    float Sueldo;
    float MontoHE;
    float HorasExtras;
    float AFP;
    float DescuentoAFP;
    float SNP;
    float DescuentoSNP;
    float Salud;
    float DescuentoSalud;
    float TotalDescuento;
    float SueldoNeto;
    float SueldoTotal;
    // El Metodo
    public float montoHE(){
        return MontoHE=(Sueldo/240)*HorasExtras;
    }
    public float DescuentoAFP(){
        return DescuentoAFP=(Sueldo*11/130);
    }
    public float DescuentoSNP(){
        return DescuentoSNP=(Sueldo*11/130);
    }
    public float DescuentoSalud(){
        return DescuentoSalud=(Sueldo*3/100);
    }
    public float SueldoNeto(){
        return SueldoNeto=(Sueldo-TotalDescuento);
    }
    public float TotalDescuento(){
        return SueldoNeto=SueldoNeto+MontoHE;
    }
}
