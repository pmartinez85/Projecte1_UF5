package llistes;


import java.util.*;

/**
 *
 * @author pedro
 */
public class LlistaPokemon {
    
    
    public static void main(String[] args) {
        
		// LinkedList
		Collection pokemon = new LinkedList<>();
 
		// Afegim i creem un iterator
		pokemon.add("Bulbasur");
                pokemon.add("Ivysur");
                pokemon.add("Venusur");
		pokemon.add("Charmander");
                pokemon.add("Charmilion");
                pokemon.add("Charizard");
		pokemon.add("Squirtle");
                pokemon.add("Wartortle");
                pokemon.add("Blastoise");
                pokemon.add("Pikachu");
                pokemon.add("Raichu");
                
		Iterator iterador = pokemon.iterator();
 
		// Recorrem i mostrem la llista
		while (iterador.hasNext()) {
			String element = (String) iterador.next();
			System.out.print(element + " ");
		}
		System.out.println("--LinkedList--");
 
		// ArrayList
		Collection pkm = new ArrayList<>();
 
		// Afegim nodes y creem un Iterator
		pkm.add("Bulbasour");
                pkm.add("Ivysour");
                pkm.add("Venusour");
		pkm.add("Charmander");
                pkm.add("Charmilion");
                pkm.add("Charizard");
		pkm.add("Squirtle");
                pkm.add("Wartortle");
                pkm.add("Blastoise");
                pkm.add("Pikachu");
                pkm.add("Raichu");
		Iterator iterador2 = pkm.iterator();
 
		// Recorrem y mostrem la llista
		while (iterador2.hasNext()) {
			String element = (String) iterador2.next();
			System.out.print(element + " ");
		}
		System.out.println("--ArrayList--");
	}

    
}
