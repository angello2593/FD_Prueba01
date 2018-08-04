
package clase01;


public class Metodos {
    
    public static void main(String[] args) {
        
        //Alumno 1
       ProcesarOperacion("Luis", 11, 12, 20);
        //Alumno 2
       ProcesarOperacion("Ana", 16, 13, 17);
        
    }
    
    static void ProcesarOperacion( String nombre, double n1, double n2, double n3){
        SaludarAlumno(nombre);
        CalcularPromedio(n1, n2, n3);
    }
    static void SaludarAlumno(String nombreAlumno){
        System.out.println("Hola " + nombreAlumno);
    }
    
    static void CalcularPromedio(double n1, double n2, double n3){
        double promedio = (n1+n2+n3)/3;
        if (promedio > 15){
            System.out.println("Felicitaciones!!!");
        }else{
            System.out.println("Debes estudiar CRJ!!!");
        
    }
    }
}
