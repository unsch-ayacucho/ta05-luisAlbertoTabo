
package Objeto;

/**
 *TABOADA PAUCAR LUIS A.
 */
public class Estudiante {

  //Definimos sus atributos
    private int Codigo;
    private String Apellidos;
    public String Especialidad;
    float nota1; // las notas mayor mente pueden ser flotantes
    float nota2;
    float nota3;
    float nota4;
    float notaMenor;
    float promedio;
    // cosntructor

    public Estudiante(int Codigo, String Apellidos, String Especialidad) {
        this.Codigo = Codigo;
        this.Apellidos = Apellidos;
        this.Especialidad = Especialidad;
    }
    // operacion
    // utilizacion los metodos get y set
    // get: optener
    // set: asignar

    public int getCodigo() {
        return Codigo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getEspecialidad() {
        return Especialidad;
    }
    public void promedio(float nota1,float nota2, float nota3, float nota4, float notaMenor){
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
        
        this.notaMenor=notaMenor;
        this.promedio=(nota1+ nota2+nota3+nota4-notaMenor)/3;
    }
    public void imprimirPromedio(){
        System.out.println("el promedio es: "+ promedio);
    }
    public static void main(String[] args) {
        // creacion de los objetos
        Estudiante nota = new Estudiante(23479425,"Taboada","INGENIERIA");
        
        System.out.println("Codigo :"+nota.getCodigo());
        System.out.println("Apellido :"+nota.getApellidos());
        System.out.println("Especialidad :"+nota.getEspecialidad());
        nota.promedio(14, 17, 18, 11, 11);
        nota.imprimirPromedio();
    }
    
}
