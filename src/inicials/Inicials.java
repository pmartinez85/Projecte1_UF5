/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicials;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Inicials {

    /**
     * @param args the command line arguments
     */
    
        public static String llimpiarText(String text) {
        StringBuilder nouText;
        nouText = new StringBuilder();
        for (int x = 0; x < text.length(); x++) {

            if (Character.isLetter(text.charAt(x))) {

                nouText = nouText.append(text.charAt(x));

            }
        }

        return nouText.toString();
    }
    public static void main(String[] args) {
        
        
        
        
        Scanner ent1 = new Scanner(System.in);
        String text;
        String separadors = "[ .,;?!¡¿\'\"]+";
        
        System.out.println("Per favor introdueixi el text que vol usar: ");
        text = ent1.nextLine().trim();
        String[] paraules = text.split(separadors); // convertim cada cadena entre separadors en una paraula
        System.out.println(Arrays.toString(paraules));

        for (String paraula: paraules) System.out.println(paraula.charAt(0));

       


//        do{ //falta acabar!
//            StringBuilder paraula;
//            paraula = new StringBuilder();
//            for (int x = 0; x < text.length(); x++) {
//
//            if (Character.isLetter(text.charAt(x))) {
//
//                StringBuilder novaparaula = paraula.append(text.charAt(x));
//                System.out.println(novaparaula);
//
//            }else{
//               
//            }
//        }
//            
//        }while (text.isEmpty());
        
    


//Manera de Fer-ho de Santi---> Sols en un boleà que canvia d'estat.
    
//    
//    boolean enParaula = False;
//    for (int i = 0; i < text.length(); i++) {
//    if (!enParaula){
//}
//    if ((Character.isDigit(text.charAt(i)) || (Character.isLetter(text.charAt(i))){
//        enParaula= true;
//        System.out.println(text.CharAt(i));
//        
//    }else{((!Character.isDigit(text.charAt(i)) || (Character.isLetter(text.charAt(i))){
//        enParaula=false;
//    }
//    }     
//}

    }
}





