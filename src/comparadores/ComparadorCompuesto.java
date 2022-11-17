package comparadores;

import java.util.Comparator;

public class ComparadorCompuesto<T> implements Comparator<T>{
	Comparator<T> c1, c2;
	
	public ComparadorCompuesto(Comparator<T> c1, Comparator<T> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(T o1, T o2) {
		int result= c1.compare(o1, o2);
		if(result==0)
			return c2.compare(o1, o2);
		return result;
	}

}
