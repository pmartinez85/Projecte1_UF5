package trobaremail;
import java.util.Scanner;
import java.util.regex.*;
// @author pedro

                // --->>>> Una altra expressió per validar mails -->>    

//    "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"

public class Validador {

    public static boolean isEmail(String valor) {

        return validar("^[\\w-\\.]+\\@[\\w\\.-]+\\.[a-z]{2,4}$", valor);
    }

    public static boolean validar(String expReg, String valor) {
        Pattern patro = Pattern.compile(expReg);
        Matcher match = patro.matcher(valor);
        return match.matches();
    }

    public static void main(String[] args) {

        Scanner ent1 = new Scanner(System.in);
        System.out.println("Per favor introdueixi el seu correu: ");
        String text = ent1.nextLine().trim();

        if (isEmail(text)) {
            System.out.println(text + " és un e-mail vàlid");
        } else {
            System.out.println(text + " no és un e-mail vàlid");
        }

    }

}
