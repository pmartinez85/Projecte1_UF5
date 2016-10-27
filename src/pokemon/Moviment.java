package pokemon;

/**
 *
 * @author pedro
 */
public class Moviment {
    
    private final String nom;
    private final String tipus;
    private final int poder;
    private final int PP;

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
 
    
    public Moviment(String nom, String tipus, int poder, int PP){
        
        this.nom = nom;
        this.tipus = tipus;
        this.poder = poder;
        this.PP = PP;
        
        
    }

    
}
