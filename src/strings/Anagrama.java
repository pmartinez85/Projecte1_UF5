/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Arrays;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author pedro
 */
public class Anagrama {

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
        String text1;
        
        
        System.out.println("Per favor introdueixi el text que vol usar: ");
        text1 = toUpperCase(ent1.nextLine());
        String textNet1 = llimpiarText(text1);
        System.out.println("Per favor introdueixi el text que vol saber si es anagrama: ");
        text1 = toUpperCase(ent1.nextLine());
        String textNet2 = llimpiarText(text1);
        
        System.out.println(textNet1 + textNet2);
        
        
        char[] aText1 = textNet1.toCharArray();
        Arrays.sort(aText1);
        
        char[] aText2 = textNet1.toCharArray();
        Arrays.sort(aText2);
            
        
        if (Arrays.equals(aText1, aText2)){
            
        System.out.println(Arrays.toString(aText2) + "i" + Arrays.toString(aText2) + "Són Anagrama");
        }else{
            System.out.println("No són anagrama");
        }
  }
    
}



