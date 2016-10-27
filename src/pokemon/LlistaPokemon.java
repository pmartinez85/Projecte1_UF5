/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class LlistaPokemon {
    
    
    public static void main(String[] args) {
        
		// LinkedList
		List llista1 = new LinkedList();
 
		// Afegim i creem un iterator
		llista1.add("Bulbasur");
                llista1.add("Ivysur");
                llista1.add("Venusur");
		llista1.add("Charmander");
                llista1.add("Charmilion");
                llista1.add("Charizard");
		llista1.add("Squirtle");
                llista1.add("Wartortle");
                llista1.add("Blastoise");
                llista1.add("Pikachu");
                llista1.add("Raichu");
                
		Iterator iterador = llista1.iterator();
 
		// Recorrem i mostrem la llista
		while (iterador.hasNext()) {
			String element = (String) iterador.next();
			System.out.print(element + " ");
		}
		System.out.println("--LinkedList--");
 
		// ArrayList
		List llista2 = new ArrayList();
 
		// Afegim nodes y creem un Iterator
		llista2.add("Bulbasour");
                llista2.add("Ivysour");
                llista2.add("Venusour");
		llista2.add("Charmander");
                llista2.add("Charmilion");
                llista2.add("Charizard");
		llista2.add("Squirtle");
                llista2.add("Wartortle");
                llista2.add("Blastoise");
                llista2.add("Pikachu");
                llista2.add("Raichu");
		Iterator iterador2 = llista2.iterator();
 
		// Recorrem y mostrem la llista
		while (iterador2.hasNext()) {
			String element = (String) iterador2.next();
			System.out.print(element + " ");
		}
		System.out.println("--ArrayList--");
	}

    
}
