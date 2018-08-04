
package clase01;


public class Clase01 {

   
    public static void main(String[] args) {
    
    
        SaludaVersionMetodo();
        SaludaVersionMetodo();
        //Saluda
        String cadena = Saluda("Angello");
        System.out.println(cadena);
      
        String[] nombres = {"Luis", "Jose", "Maria", "Pedro"};
        
        for (int i=0; i<nombres.length; i++){
            String mensaje = Saluda(nombres[i]);
            System.out.println(mensaje);
        }
    }


    //FUNCION
    static String Saluda(String nombre){
        String saludo = "Hola " + nombre + " como estas";
        return saludo;

}

    static void SaludaVersionMetodo(){
        System.out.println("Hola, como estas (Metodo)");
}
}
