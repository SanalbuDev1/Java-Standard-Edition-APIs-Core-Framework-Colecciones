package HashSet;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		HashSet<String> conjunto = new HashSet<>();
		conjunto.add("hola");
		conjunto.add("que");
		conjunto.add("tal");
		conjunto.add("hola");
		
		for (String lista: conjunto) {
			System.out.println(lista);
		}		
		
		Persona p1 = new Persona("pedro");
		Persona p2 = new Persona("juan");
		Persona p3 = new Persona("juan");
		
		System.out.println("");
		conjunto.add(p1.getNombre());
		conjunto.add(p2.getNombre());
		conjunto.add(p3.getNombre());
		
		for (String lista2: conjunto) {
			System.out.println(lista2);
		}
		
	}
	
}
