/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llistes;

import java.util.*;

/**
 *
 * @author pedro
 */
public class Map {
    
    
    public static void main(String args[])
    {
		// Definim un HashMap
		HashMap global = new HashMap();
 
		// Insertar valors "key"-"value" al HashMap
		global.put("Pikachu", "Elèctric");
		global.put("Venusur", "Planta");
		global.put("Charmander", "Foc");
		global.put("Zubat", "Volador");
		global.put("Golem", "Roca");
 
		// Definir Iterator per extraure o imprimir valors 
		for( Iterator it = global.keySet().iterator(); it.hasNext();) { 
			String s = (String)it.next();
			String s1 = (String)global.get(s);
			System.out.println("Pokemon: "+s + " - " + "Tipus: "+s1);
		}
	}
    
}
