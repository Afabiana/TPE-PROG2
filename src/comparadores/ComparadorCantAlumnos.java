package comparadores;

import java.util.Comparator;

import consigna_tres.Elemento;

public class ComparadorCantAlumnos implements Comparator<Elemento>{
	
	@Override
	public int compare(Elemento o1, Elemento o2) {
		return o1.getCantAlumnos()-o2.getCantAlumnos();
	}

}
