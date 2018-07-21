
package Programa;

/**
 *
 * @author Administrador
 */
public class Arreglos {
    
    public static void main(String[] args) {
            // DEFINIR ARREGLOS EN 2 LINEAS
            String[] apellidos;
            apellidos = new String[5];
            //DEFINIR ARREGLOS EN 1 LINEA
            String[] nombres = new String[5];
            //ASIGNAR VALORES A LOS ARREGLOS
            apellidos[0] = "Cordova";
            apellidos[1] = "Ramirez";
            apellidos[2] = "Leon";
            apellidos[3] = "Perez";
            apellidos[4] = "Sanchez";
            //DEFINIR ARREGLOS CON VALORES POR DEFECTO
            String[] departamentos = {"Lima", "Piura", "Tacna", "Puno", "Cuzco", "Loreto"};
            
            System.out.println("Tamaño del arreglo departamentos: " + departamentos.length);
            System.out.println("Tamaño del arreglo apellidos: " + apellidos.length);
            System.out.println("Tamaño del arreglo nombres: " + nombres.length);
            
            departamentos[0] = "Arequipa"; //MODIFICANDO DE LIMA A AREQUIPA
            //OBTENER EL VALOR DEL INDICE 1
            System.out.println("Valor departamentos indice 1 = " + departamentos[1]);
            //RECORRER ARREGLOS VALOR POR VALOR
            for (int i=0; i < departamentos.length; i++){
                System.out.println("El valor en la posicion " + i + " => " + departamentos[i]);
            }
             
    }
    
}
