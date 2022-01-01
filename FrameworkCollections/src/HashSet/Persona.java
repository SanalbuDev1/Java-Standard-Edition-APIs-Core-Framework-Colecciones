package HashSet;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona implements Comparable {

	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Dos personas con el mismo nombre tienen el mismo hashs
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre);
	}	

	@Override
	public int compareTo(Object o) {
	
		Persona per = (Persona) o;
		return this.getNombre().compareTo(per.getNombre());
	}	
	
	
	
	
	
}
