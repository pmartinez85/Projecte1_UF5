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

        list = new ArrayList<>(SIZE);

        for (int i = 0; i < SIZE; i++) {

            list.add(i);

        }

    }

    public void writeList(String fileName) {
        
        PrintWriter out = null;

        try {

            out = new PrintWriter(new FileWriter(fileName));

            for (int i = 0; i < SIZE; i++) {

                out.println("Value at: " + i + " = " + list.get(i));

            }
        } catch (IOException e) {
            System.err.println("S'ha capturat una IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Tanquem PrintWriter");
                out.close();
            } else {
                System.out.println("Printwriter no està obert");
            }
        }

    }

    public void readList(String fileName) {

        String line;
        RandomAccessFile raf;
        try {
            raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {

                Integer i = Integer.parseInt(line);

                System.out.println(i);
                list.add(i);
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LlistaDeNumeros1.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(LlistaDeNumeros1.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            if (out != null) {
                System.out.println("Tanquem PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter no està obert");
            }
    }

}
   
public static void main(String[] args) {
    
    
    
}
    
}