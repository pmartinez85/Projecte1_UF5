/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxers;

/**
 *
 * @author pedro
 */
import java.io.*;
import static java.lang.System.out;

import java.util.List;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LlistaDeNumeros1 {

    private final List<Integer> list;

    private static final int SIZE = 10; 

    public LlistaDeNumeros1 () {

        list = new ArrayList<Integer>(SIZE);

        for (int i = 0; i < SIZE; i++) {

            list.add(new Integer(i));

        }

    }

    public void writeList(String fileName) {

        try {

           PrintWriter out = new PrintWriter(new FileWriter(fileName));

            for (int i = 0; i < SIZE; i++) {

                out.println("Value at: " + i + " = " + list.get(i));

            }
            out.close();
            
        } catch (IOException e) {
            System.err.println("S'ha capturat una IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Tanquem PrintWriter correctament");
            } else {
                System.out.println("Printwriter no està obert");
            }
        }

    }

    public void readList(String fileName) {

        String line;
        try {
           RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {

                Integer i = Integer.parseInt(line);

                System.out.println(i);
                list.add(i);
            } 
            raf.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LlistaDeNumeros1.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No hi ha fitxer " + ex);
        }catch (IOException ex) {
            Logger.getLogger(LlistaDeNumeros1.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("capturem l'error " + ex);
        }finally {
            if (out != null) {
                System.out.println("Tanquem RandomAccessFile");
            } else {
                System.out.println("RandomAccessFile no està obert");
            }
    }

}
   
public static void main(String[] args) {
    
    LlistaDeNumeros1 novallista = new LlistaDeNumeros1();
    
    System.out.println("Primer cas, es crea un fitxer asdadasd.txt:");
    novallista.writeList("asdasdqsad.txt"); //excepció
    
    System.out.println("Segon cas, creem fitxer write.txt amb la llista:");
    novallista.writeList("write.txt"); //creem el fitxer amb la llista
    
    System.out.println("Tercer cas:");
    novallista.readList("read.txt"); //este sí que va
    
    System.out.println("Quart cas:");
    novallista.readList("fitxernoexisteix"); //exepcio
    
}
    
}