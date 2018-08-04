
package clase01;


public class ProgEstructurada {
 
    public static void main(String[] args) {
        
        //ALUMNO 1
        System.out.println("Hola Luis");
        double nota1 = 11;
        double nota2 = 12;
        double nota3 = 20;
        
        double promedio = (nota1+nota2+nota3)/3;
        if (promedio > 15)
            System.out.println("Felicitaciones!!!");
        else
            System.out.println("Estudia MRD!!!");
        
        //ALUMNO 2
        System.out.println("Hola Ana");
        double notaAn1 = 16;
        double notaAn2 = 13;
        double notaAn3 = 17;
        
        double prom = (notaAn1+notaAn2+notaAn3)/3;
        if (prom > 15)
            System.out.println("Felicitaciones!!!");
        else
            System.out.println("Estudia MRD!!!");
        
    }
}
