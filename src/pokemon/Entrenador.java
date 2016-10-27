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
public class Entrenador {
    

    
    public Entrenador(String nom, int edat, int medalla) {
        
        this.nom = nom;
        this.medalla = medalla;
        this.edat = edat;
    }
    
    private final String nom;
    private final int edat;
    private final int medalla;

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public int getMedalla() {
        return medalla;
    }

    
    
    
}
