package HashSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDatos {

	public static void main(String[] args) {
		
		Set<Object> conjunto = new TreeSet<Object>();
		
		Persona p1 = new Persona("persona1");
		Persona p2 = new Persona("persona4");
		Persona p3 = new Persona("persona2");		
		conjunto.add(p1);
		conjunto.add(p2);
		conjunto.add(p3);
		
		for ( Object string : conjunto) {
			System.out.println( ((Persona) string).getNombre());
		}
	}
	
	
}
