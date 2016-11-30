/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparar;

import java.util.*;

/**
 *
 * @author pedro
 */
public class Compare2 {
    
                    //Usem la classe persona que hem creat al mateix paquet
    
    public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Persona("Pepe", "Perez"));
		ts.add(new Persona("Pipi", "Perez"));
		ts.add(new Persona("Manolito", "Cascos"));
		ts.add(new Persona("Pipi", "Perez"));
		ts.add(new Persona("Sara", "Alonso"));
 
		System.out.println(ts);
	}
    
}
