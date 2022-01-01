package CapituloLibro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Libro {

	private String titulo;
	private String autor;
	private List<Capitulo> listaCapitulos;

	public Libro() {
		super();
		this.listaCapitulos = new ArrayList<>();
	}

	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.listaCapitulos = new ArrayList<>();
	}
	
	public void addCapitulo(Capitulo capitulo) {
		listaCapitulos.add(capitulo);
	}
	
	public int cantidadCapitulos() {
		return listaCapitulos.size();
	}
	
	public int numeroPaginas() {
		int contador = 0;
		for (Capitulo datos: listaCapitulos) {
			contador += datos.getPaginas();
		}
		return contador;
	}
	
	public boolean cambiarCapitulo(Capitulo viejo, Capitulo nuevo) {
		int posicion = listaCapitulos.indexOf(viejo);
		listaCapitulos.set(posicion, nuevo);
		if(posicion != -1) {
			return true;
		}else{
			return false;
		}
		
		
	}
	
	public boolean contieneCapitulo(Capitulo c) {
		
		return this.listaCapitulos.contains(c);
		
		/* forma vieja 
		for (int i = 0; i < listaCapitulos.size(); i++) {
			if(this.listaCapitulos.get(i).equals(c)) {
				return true;
			}
		}
		
		return false;
		*/
	}

}
