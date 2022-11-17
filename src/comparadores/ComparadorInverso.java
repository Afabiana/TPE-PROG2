package comparadores;

import java.util.Comparator;

public class ComparadorInverso<T> implements Comparator<T>{
	Comparator<T> c ;
	
	public ComparadorInverso(Comparator<T> c) {
		this.c = c;
	}

	@Override
	public int compare(T o1, T o2) {
		return -c.compare(o1, o2);
	}

}
