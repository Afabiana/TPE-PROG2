package consigna_uno;

import java.util.Iterator;

//aca arranca el iterador concreto
public class Iterador<T> implements Iterator<T>{
	
		private Nodo<T> cursor;
		
		public Iterador(Nodo<T> cursor){
		    this.cursor=cursor;
		}
		
		@Override
		public boolean hasNext() {
		    return this.cursor!=null;
		}
		
		@Override
		public T next() {
		    T valor= this.cursor.getValor();
		    this.cursor=cursor.getNodoSiguiente();
		    return valor; 		
	}
}

