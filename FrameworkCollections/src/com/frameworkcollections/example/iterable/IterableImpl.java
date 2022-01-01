package com.frameworkcollections.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableImpl {

	public static void main(String[] args) {
		
		/* Se crea la lista, List extiende de Iterable */
		List<String> lista = new ArrayList<String>();
		lista.add("hola");
		lista.add("que tal");
		lista.add("bye");
		
		/* Un iterable es algo que se puede recorrer */
		Iterable<String> miIterable = lista;
		
		/* Encargado del recorrido */
		Iterator it = miIterable.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			//it.remove();
		}
		
        it = miIterable.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String dato: lista) {
			System.out.println(dato);
		}
	}
	
}
