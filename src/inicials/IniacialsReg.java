/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicials;

import java.util.Arrays;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static jdk.nashorn.internal.objects.annotations.SpecializedFunction.LinkLogic.isEmpty;

/**
 *
 * @author pedro
 */
public class IniacialsReg {
    
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
        //String noutext;
        String separadors = "[.,;?!¡¿\'\"]+";
        
        System.out.println("Per favor introdueixi el text que vol usar: ");
        text = ent1.nextLine().trim();
        //text= llimpiarText(text);
        String[] paraules = text.split(separadors); // convertim cada cadena entre separadors en una paraula
        System.out.println(Arrays.toString(paraules));

        for (String paraula: paraules) System.out.println(paraula.charAt(0));
    
}
}

