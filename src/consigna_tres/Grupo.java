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
		this.elementos.addOrdenado(e);
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
	
	//ya se puede evaluar si dos grupos son iguales
	public boolean equals(Object o) {
		try {
			int coincidencias=0;
			Grupo otro = (Grupo) o;
			for(Elemento elem: this.elementos)
				for(Elemento ele: otro.elementos)
					if(ele.equals(elem)) {
						coincidencias++;
					}
			return (coincidencias==this.elementos.size())&&(this.elementos.size()==otro.elementos.size());
		}
		catch(Exception e) {
			return false;
		}
	}
}
