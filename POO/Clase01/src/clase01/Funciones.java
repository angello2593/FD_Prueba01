
package clase01;


public class Funciones {
    
    public static void main(String[] args) {
        
        String saludo = "";
        double promedio = 0;
        String mensajeFinal = "";
        
        //Alumno 1
            ProcesarOperacion("Luis", 11, 12, 20);
            ProcesarOperacion("Ana", 16, 13, 17);
        
        //Alumno 2
          
    }
    
    static void ProcesarOperacion(String nombre, double n1, double n2, double n3){
        String saludo = "";
        double promedio = 0;
        String mensajeFinal = "";
        saludo = SaludarAlumno(nombre);
        promedio = CalcularPromedio(n1, n2, n3);
        mensajeFinal = MensajeFinal(promedio);
        System.out.println(saludo);
        System.out.println(mensajeFinal);
    }
    
    static String SaludarAlumno(String nombreAlumno){
        String mensaje = "Hola " + nombreAlumno;
        return mensaje;
    }
    
    static double CalcularPromedio(double n1, double n2, double n3){
        double promedio = (n1 + n2 + n3)/3;
        return promedio;
    }
    
    static String MensajeFinal(double promedio){
       String mensaje;
       if (promedio > 15){
           mensaje = "Felicitaciones!!!";
       }else {
           mensaje = "Debes estudiar!!!";
       }
       return mensaje;
    }
    
}

