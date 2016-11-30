package questionari;

/**
 *
 * @author pedro
 */
import java.util.Scanner;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Questionari {

    //1 --> Demanar usuari la introduccio per teclat d'un text
    //2 --> Demanar usuari introducció d'un caracter a buscar d'ins del text
    //3 --> Preguntar si vol distingir entre majuscules i minuscules(Si/No)
    //4 --> Preguntar si vol bsucar d'esquerra a dreta o de dreta a esquerra
    //5 --> Mostrar les posicions on es troba el caracter dins del text segons 
    //      l'ordre de busqueda sol·licitada. recordar que el primer caracter es el 0
    //      i l'ultim es length -1
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Comencem el programa!!");
        System.out.println ("Per favor introdueixi el text que vol usar: ");
        String entradaTeclat1 = "";
        Scanner entradaEscaner1 = new Scanner (System.in);
        entradaTeclat1 = entradaEscaner1.nextLine (); 
        System.out.println ("Molt bé, has introduït: \"" + entradaTeclat1 +"\"");
        
      
        System.out.println ("Introdueixi ara el caràcter que vol que busquessem: ");
        String entradaTeclat2 = "";
        Scanner entradaEscaner2 = new Scanner (System.in);
        entradaTeclat2 = entradaEscaner2.nextLine (); 
        if (entradaTeclat2.length()!= 1 || isNumber(entradaTeclat2)){
            System.out.println("Has introduït una resposta incorrecta");
            System.out.println ("Introdueixi ara el caràcter que vol que busquessem: ");
            entradaTeclat2 = entradaEscaner2.nextLine ();
        }else{
        System.out.println ("Molt bé, has introduït: \"" + entradaTeclat2 +"\"");
        }
        
        
        boolean semafor = true;
        Scanner sc = new Scanner(System.in); 
        String opc; 
        System.out.println ("Diferenciem entre majúscules i minúscules?"); 
        System.out.println("S / N"); 
        opc = sc.next(); // Llegim resposta 
        if (opc.equals("s") || opc.equals("S")) {
            
            System.out.println ("TODO code per resposta sí!!");
            
        }else if (opc.equals("n") || opc.equals("N")){
            System.out.println("TODO code per resposta no!!");
        }else{
            System.out.println("No has respos correctament");
            System.out.println ("Diferenciem entre majúscules i minúscules?"); 
            System.out.println("S / N"); 
            opc = sc.next();
        }
        
    }
   
}