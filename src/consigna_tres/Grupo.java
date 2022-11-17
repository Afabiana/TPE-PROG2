package consigna_tres;

import java.util.Comparator;

import consigna_uno.ListaVinculada;

public class Grupo extends Elemento{
	
	private ListaVinculada<Elemento> elementos;
	private String nombre;
	
	public Grupo(Comparator<Elemento> c, String nombre) {
		this.nombre=nombre;
		this.elementos=new ListaVinculada<Elemento>(c);
	}
	
	public void add(Elemento e) {
		this.elementos.addNodoOrd(e);
	}
	
	@Override
	public int getCantAlumnos() {
        int suma = 0;
        for (Elemento e : elementos) {
            suma += e.getCantAlumnos();
        }
        return suma;
	}
	
	public String toString() {
		String res="Grupo "+this.nombre+"\n"+"[";
		for(Elemento e: elementos) {
			res+=e+"\n";
		}
		return res+"]";
	}

}
