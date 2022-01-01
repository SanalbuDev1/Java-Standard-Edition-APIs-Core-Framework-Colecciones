package com.frameworkcollections.example.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


//la implemtancion de prueba3 solo fue de una duda que salio de momento anda que ver con el video
public class CollectionsImpl implements prueba3 {

	public static void main(String[] args) {

		/* Se crea la lista, List extiende de Iterable */
		Collection<String> lista = new ArrayList<String>();
		lista.add("hola");
		lista.add("que tal");
		lista.add("bye");
		
		System.out.println(lista.contains("tal"));
		
		lista.addAll(lista);
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(((ArrayList<String>) lista).get(i));
		}
		
		System.out.println(lista.hashCode());
		
		
		/**/
		System.out.println("lista 2");
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("hola");
		lista2.add("que tal");
		lista2.add("bye");
		lista2.addAll(lista);
		System.out.println(lista2.retainAll(lista));
	}

	@Override
	public List<String> datos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> prueba() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> datosPrueba2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> pruebaDatosPrueba2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		
	}

	

}
