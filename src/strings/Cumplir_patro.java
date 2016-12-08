/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author pedro
 */

import java.text.Normalizer;
import java.util.regex.PatternSyntaxException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Cumplir_patro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;

        System.out.println("Introdueix un text. INTRO per acabar:");
        do {
            text = input.nextLine().toLowerCase();
            
        } while (text.isEmpty());

        text = Normalizer.normalize(text, Normalizer.Form.NFD);
        
        text = text.replaceAll("\\p{M}", "");

        Pattern pattern = null;
        
        try {
            pattern = Pattern.compile("(^\\w+)\\W+(\\w+)\\W+(\\w+).+\\3\\W+\\2\\W+(\\1)$");
            
        } catch (PatternSyntaxException e) {
            
            System.out.println("Error amb l'expressió regular: " + e.getDescription() + "\nTorna-ho a intentar.");
        }
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
            
            System.out.println("El text cumpleix amb el patró!");
            
        } else {
            
            System.out.println("El text NO cumpleix amb el patró!");
        }

    }
}


