package pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Moviment {
    
    private final String nom;
    private final String tipus;
    private final int poder;
    private final int PP;
    private final List moviment = new ArrayList();

    public String getNom() {
        return nom;
    }

    public String getTipus() {
        return tipus;
    }

    public int getPoder() {
        return poder;
    }

    public int getPP() {
        return PP;
    }

    public List getMoviment() {
        return moviment;
    }
    
 
    
    public Moviment(String nom, String tipus, int poder, int PP, List moviment){
        
        this.nom = nom;
        this.tipus = tipus;
        this.poder = poder;
        this.PP = PP;
        //this.moviment = [];
        
        
    }

    
}
