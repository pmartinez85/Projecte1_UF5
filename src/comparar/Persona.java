/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparar;

/**
 *
 * @author pedro
 */
public class Persona implements Comparable {
	private String nom, cognom;
 
	public String nom(){
		return nom;
	}
 
	public String cognom() {
		return cognom;
	}
 
	public Persona(String nom, String cognom) {
		if (nom==null || cognom==null)
			throw new NullPointerException();	//Comprovar els nulls
		this.nom = nom;
		this.cognom = cognom;
	}
 
        @Override
	public boolean equals(Object o) {
			if (!(o instanceof Persona))
				return false;		
			Persona n = (Persona)o;
			// mètode equals retorna false si argument
			// no es del tipus adecuat o es nul
			return n.nom.equals(nom) && n.cognom.equals(cognom);
	}
 
        @Override
	public int hashCode() {
		return 31 * nom.hashCode() + cognom.hashCode();
	}	// hashcode té en compte els dos camps
 
        @Override
	public String toString() {
		return nom + " " + cognom;
	}
 
        @Override
	public int compareTo(Object o) {
		// llença ClassCastException si argument no es del tipus Name
		Persona n = (Persona)o;	
		int lastCmp = cognom.compareTo(n.cognom);
		return (lastCmp!=0 ? lastCmp : nom.compareTo(n.nom));
		// primer comparem els cognoms, i si son iguals llavors els noms
	}
}
