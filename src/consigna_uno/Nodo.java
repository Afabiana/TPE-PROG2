package consigna_uno;


public class Nodo<T> {
	private T valor;
	private Nodo<T> siguiente;
	
	public Nodo(T valor) {
		this.valor = valor;
		this.siguiente=null;
	}

	public T getValor() {
		return this.valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "valor :"+this.getValor();
	}

	public Nodo<T> getNodoSiguiente() {
		return this.siguiente;
	}

	public void setNodoSiguiente(Nodo<T> nuevoNodo) {
		this.siguiente=nuevoNodo;
	}
	
	public boolean tieneSiguiente() {
		return this.getNodoSiguiente() != null;
	}
	
	//nunca lo uso
	public void eliminar() {
		this.setValor(null);
		this.setNodoSiguiente(null);
	}
	
	


}

