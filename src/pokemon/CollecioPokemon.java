/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author pedro
 */
public class CollecioPokemon{
    
    public static void main(String arg[]) {
        Collection llistaTipusPokemons = new ArrayList<>(); // El tipus de llistaTipusPokemons es Collection
        
        llistaTipusPokemons.add("Planta");
        llistaTipusPokemons.add("Aigua");
        llistaTipusPokemons.add("Foc");
        llistaTipusPokemons.add("Elèctric");
        llistaTipusPokemons.add("Volador");
        llistaTipusPokemons.add("Roca");
        
        
        System.out.println("Nombre d'elements abans de'eliminar res: " + llistaTipusPokemons.size() ) ;
        
        System.out.println (llistaTipusPokemons.toString() ) ;
        
        llistaTipusPokemons.remove ("Volador");
        llistaTipusPokemons.remove ("Roca");
        
        System.out.println("Nombre d'elements després d'eliminar Volador i Roca:" + llistaTipusPokemons.size() ) ;
        
        System.out.println(llistaTipusPokemons.toString () );
        }
}
    

