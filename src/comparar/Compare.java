package comparar;

import java.util.*;

/**
 *
 * @author pedro
 */

class Comparacio implements Comparator {
        @Override
	public int compare(Object pkm1, Object pkm2) {
		//Compara cadenes ignorant les maj/min
		return ((String) pkm1).compareToIgnoreCase((String) pkm2);
	}
    
}

public class Compare {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new Comparacio ());
		ts.add("Pikachu");
		ts.add("pikachu");
		ts.add("Charmander");
		ts.add("Golem");
		ts.add("Mew");
		ts.add("mew");
		ts.add("Mewtwo");
		System.out.println(ts);
	}
}
 
