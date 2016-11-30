package pokemon;

import java.util.*;

/**
 *
 * @author pedro
 */
public class TipusPokemon{
    
    public static void main(String arg[]) {
        
        Collection TipusPokemons = new ArrayList<>(); // El tipus de llistaTipusPokemons es Collection
        
        TipusPokemons.add("Planta");
        TipusPokemons.add("Aigua");
        TipusPokemons.add("Foc");
        TipusPokemons.add("Elèctric");
        TipusPokemons.add("Volador");
        TipusPokemons.add("Roca");
        
        
        System.out.println("Nombre d'elements abans de'eliminar res: " + TipusPokemons.size() ) ;
        
        System.out.println (TipusPokemons.toString() ) ;
        
        TipusPokemons.remove ("Volador");
        TipusPokemons.remove ("Roca");
        
        System.out.println("Nombre d'elements després d'eliminar Volador i Roca:" + TipusPokemons.size() ) ;
        
        System.out.println(TipusPokemons.toString () );
        }
}
    

