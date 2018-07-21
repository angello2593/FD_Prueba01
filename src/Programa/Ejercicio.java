
package Programa;

/**
 *
 * @author Administrador
 */
public class Ejercicio {
    
        public static void main(String[] args) {
        
             String[] nombres = {"Malote", "Makako", "Creepnan", "Choy", "Pompi", "Mangudai"};
             double[] notas = {12, 10, 11, 20, 02, 16};
             
             for (int i = 0; i < nombres.length; i++)
                 if (notas[i] > 16){
                     System.out.println(nombres[i] + " tiene " + notas[i] + " ===> Muy bien");
                 }
                     else if (notas[i] > 10){
                             System.out.println(nombres[i] + " tiene " + notas[i] + " ===> Mejorando");
                             }
                     else {
                         System.out.println(nombres[i] + " tiene " + notas[i] + " ===> Necesita apoyo");
                     }
                 
             
                 
             
    }
}
