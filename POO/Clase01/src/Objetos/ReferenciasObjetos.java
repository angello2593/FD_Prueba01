
package Objetos;

import POO.Docente;


public class ReferenciasObjetos {
    
    public static void main(String[] args) {
          
    //Como crear un objeto
        Docente objDocente1 = new Docente();
        objDocente1.setNombre("Luis");
        objDocente1.setApellido("Cordova");
        objDocente1.setDni("45842095");

        String nombreDocente = objDocente1.getNombre();

        
        
}
}
