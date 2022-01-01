package CapituloLibro;

import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Capitulo {

	private String titulo;
	private int paginas;
	private Libro libro;
	
	public Capitulo(String titulo, int paginas) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;
	}

	public Capitulo() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(paginas, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitulo other = (Capitulo) obj;
		return paginas == other.paginas && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Capitulo [titulo=" + titulo + ", paginas=" + paginas + ", libro=" + libro + "]";
	}
	
	
	
	

}
