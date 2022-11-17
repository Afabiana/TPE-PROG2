package consigna_uno;

import java.util.Comparator;
import java.util.Iterator;

public class ListaVinculada<T> implements Iterable<T> {
	
	private Nodo<T> primero;
	private Comparator<T> orden;
	
	public ListaVinculada(Comparator<T> orden) {
		this.primero = null;
		this.orden=orden;
	}
	
	public void setOrden(Comparator<T> c) {
		this.orden=c;
	}
	

	public void addNodoOrd(T valor){
		Nodo<T> nuevo = new Nodo<T>(valor);
		//si la lista esta vacia nuevo va a tomar la pos[0]
		if (this.estaVacia()){
			
			this.primero = nuevo; 
		
		}else if(this.orden.compare(primero.getValor(), nuevo.getValor())>=0) {//si primero.valor<||>nuevo.valor 
			
			nuevo.setNodoSiguiente(primero); //primero va a pasar a pos [1]
			this.primero=nuevo; //nuevo pasa a pos[0]
			
		}else{	
			Nodo<T> tmp=null;
			Nodo<T> actual=this.primero;
			while (actual!=null&&this.orden.compare(actual.getValor(),nuevo.getValor())<0){
				tmp=actual;
				actual=actual.getNodoSiguiente();
			}
			if (actual == null){
                tmp.setNodoSiguiente(nuevo);
			}else{
            	Nodo<T> nodoSiguente = tmp.getNodoSiguiente();
                nuevo.setNodoSiguiente(nodoSiguente);
                tmp.setNodoSiguiente(nuevo);
            }
		}
	} 
	
	private boolean estaVacia() {
		return this.primero == null;
	}

	public Nodo<T> getPrimerNodo() {
		return this.primero;
	}
	
	public void eliminarNodoPorPos(int pos) {
		int iteracion=0;
		Nodo<T> aux=this.primero;
		
		if(pos<this.size()) {
			if(pos==0)
				this.primero=aux.getNodoSiguiente();
			else
				while(pos-1>iteracion) {
					aux=aux.getNodoSiguiente();
					iteracion++;
				}
				aux.setNodoSiguiente(aux.getNodoSiguiente().getNodoSiguiente());
		}		
	}
	
	
	public void EliminarTodaOcurrencia(T valor) {
		int pos=0;
		for(T elemento : this){
			if(valor.equals(elemento)) { //cada objeto q meta en la lista va a tener definido el equals
				this.eliminarNodoPorPos(pos);
				pos--;
			}
			pos++;
		}
		
	}
	
	public int getPosPrimerOcurrencia(T valor) {
		int pos=0;
		for(T elemento : this){
			if(valor.equals(elemento)) {
				return pos;
			}
			pos++;
		}
		return -1;
	}
	
	public int size(){
		int pos = 0;
		Nodo<T> aux = this.primero;
		while (aux != null){
			pos++;
		    aux = aux.getNodoSiguiente();
		}
		return pos;
	}
	
	public Nodo<T> getNodoPorPos(int pos) {
		int iteracion=0;
		Nodo<T> aux=this.primero;
		if(pos>this.size())
			return null;
		while(pos>iteracion) {
			aux=aux.getNodoSiguiente();
			iteracion++;
		}
		//si me piden la pos 0, voy a retornar el primero, xq no va a entrar en el while
		return aux;
	}

	//el toString esta provisorio para poder comparar en el main si iterator anda bien
	public String toString() {
		String result="Lista Vinculada"+"\n";
		Nodo<T> aux = this.primero;
		while (aux != null){
			result+=aux+"\n";
		    aux = aux.getNodoSiguiente();
		}
		return result;
	}
	
	//para que tenga sentido, antes de reordenar le voy a setear el comparador
	//o podria recibir un nuevo comparador aca y setear desde este metodo idk
	public void reordenar() {
		Nodo<T> aux=this.primero;
		this.primero=null;
		while(aux!=null) {
			this.addNodoOrd(aux.getValor());
			aux=aux.getNodoSiguiente();
			
		}
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterador<T>(this.primero);
	}
}
	

