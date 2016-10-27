package pokemon;
/**
 *
 * @author pedro
 */
public class Pokedex {

    public String nom;
    public String tipus;
    public int posicio;

    public Pokedex(int posicio, String nom, String tipus) {
        this.nom = nom;
        this.tipus = tipus;
        this.posicio = posicio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getPosicio() {
        return posicio;
    }

    public void setPosicio(int posicio) {
        this.posicio = posicio;
    }

    
}
