package capses;

import java.util.*;

/**
 *
 * @author pedro
 * @param <E>
 */
public class MultiCapsa<E> {

  
    private final Collection<E> contingut;

   
    public MultiCapsa(Collection<E> implement) {
        this.contingut = implement;
    }

    public boolean afegir(E element) {
        return this.contingut.add(element);
    }

    public boolean esBuida() {
        return this.contingut.isEmpty();
    }


    public boolean eliminar() {
        // també podem fer un try catch per veure si esta ple o no.
        if (!esBuida()) {
            contingut.remove(obtenir());
            return true;
        }
        return false;
    }
    
        public E obtenir() {
        if (!esBuida()) {
            return contingut.iterator().next();
        }
        return null;
    }

    public boolean buidar() {
        if (!esBuida()) {
            contingut.clear();
            return false;
        }
        return true;
    }
    
    public <E extends Comparable> Collection <E> Ordenar(){
        
        List llista = new ArrayList<>(this.contingut);
        
        Collections.sort(llista);

        return llista;
    }
    
     public static void main(String[] args) {

        MultiCapsa mc = new MultiCapsa(new ArrayList());

        mc.afegir("Primer");
        mc.afegir("Segon");

        System.out.println((mc.esBuida() ? "buida" : "no buida"));

        System.out.println(mc.obtenir());

        mc.eliminar();

        System.out.println(mc.obtenir());

        mc.eliminar();

        System.out.println((mc.buidar() ? "buidada" : "no buidada"));

        System.out.println((mc.esBuida() ? "buida" : "no buida"));

        mc = new MultiCapsa(new HashSet());

        mc.afegir("Primer");

        mc.afegir("Segon");

        System.out.println((mc.esBuida() ? "buida" : "no buida"));

        System.out.println(mc.obtenir());

        mc.eliminar();

        System.out.println(mc.obtenir());

        mc.eliminar();

        System.out.println((mc.buidar() ? "buidada" : "no buidada"));

        System.out.println((mc.esBuida() ? "buida" : "no buida"));

    }
    
}
    
   class Bicycle implements Comparable<Bicycle>{
       
       
       @Override
       public int compareTo(Bicycle o){
           return this.cadence+o.cadence;
       }
    
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }

    
}



