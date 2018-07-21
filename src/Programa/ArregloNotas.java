
package Programa;

/**
 *
 * @author Administrador
 */
public class ArregloNotas {
    
    public static void main(String[] args) {
    
    double j = 0;
    double[] notas = {11.5, 1000, 13, 18, 66666};
    
    for (int i = 0; i < notas.length; i++){
       
        if ( notas[i] > j){
            j = notas[i];
            
        }
        
}
System.out.println("El mayor es: " + j);
 
 
}
}