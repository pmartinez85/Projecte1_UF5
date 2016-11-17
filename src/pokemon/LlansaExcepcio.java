/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author pedro
 */
import java.io.PrintWriter;


public class LlansaExcepcio {

   private PrintWriter fitxer = null;

   void metode1() {
      metode2();
   }

   void metode2() {
      metode3();
   }

   void metode3() {
      metode4();
   }

   void metode4() {
      //fitxer=new PrintWriter("c:/sortida.txt"); //descomentar per llençar excepció
   }

   public static void main(String[] args) {
      // TODO code application logic here
      LlansaExcepcio ll = new LlansaExcepcio();
      ll.metode1();
   }
}