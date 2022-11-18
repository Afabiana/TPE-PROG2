package consigna_tres;

import java.util.Comparator;

import consigna_uno.ListaVinculada;

public class Grupo extends Elemento{
	
	private ListaVinculada<Elemento> elementos;
	private String nombre;
	private Comparator<Elemento> ordenList; //es el comp que le voy a pasar a la lista vinculada
	
	public Grupo(Comparator<Elemento> ordenList, String nombre) {
		this.nombre=nombre;
		this.ordenList=ordenList;
		this.elementos=new ListaVinculada<Elemento>(ordenList);
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
	
	public ListaVinculada<Elemento> getElementos(){
		ListaVinculada<Elemento> result=new ListaVinculada<Elemento>(this.ordenList);
		for(Elemento e : elementos)
			result.addOrdenado(e);
		return result;
	}
	
	//ya se puede evaluar si dos grupos son iguales
	//defino el equals porque la lista lo va a necesitar para buscar o eliminar ocurrencias
	public boolean equals(Object o) {
		try {
			int coincidencias=0;
			Grupo otro = (Grupo) o;
			for(Elemento elem: this.elementos)
				for(Elemento ele: otro.getElementos())
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
