package strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author pedro
 */
public class Palindrom {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text;
        StringBuilder revers;
        Pattern pattern = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\s\\p{Punct}]");
        String separadors = "[ .,;?!¡¿\'\"]+";

        System.out.println("Per favor introdueixi el text que vol usar: ");
        text = ent.nextLine();
        revers = new StringBuilder(text);
        if (text.equals(revers.reverse().toString())) {
            System.out.println("Són palindroms");
        } else {
            System.out.println("No són palindroms");
        }
    }
}