package com.frameworkcollections.example.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListImpl implements Serializable{

	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("hola");
		lista.add("que tal");
		lista.add("bye");
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
		System.out.println(lista.indexOf("hola"));
		
	}
	


}
