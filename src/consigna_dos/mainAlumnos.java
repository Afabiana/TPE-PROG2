package consigna_dos;

import comparadores.ComparadorApellido;
import comparadores.ComparadorCompuesto;
import comparadores.ComparadorDni;
import comparadores.ComparadorNombre;
import consigna_uno.ListaVinculada;

public class mainAlumnos {

	public static void main(String[] args) {
		
	    Alumno a0= new Alumno("Papu", "Gomez", 12314215, 34);
	    Alumno a1= new Alumno("lionel", "messi", 34343434, 34);
	    Alumno a2= new Alumno("homero", "simpson", 34343435, 35);
	    Alumno a3= new Alumno("lisa", "simpson", 34343436, 31);
	    Alumno a4= new Alumno("lionel", "scaloni", 34343437, 38);
	    Alumno a5= new Alumno("Papu", "Gomez", 12314214, 34);
	    
	    ComparadorNombre orden1= new ComparadorNombre();
	    ComparadorApellido orden2= new ComparadorApellido();
	    ComparadorDni orden3 = new ComparadorDni();
	    
	    ComparadorCompuesto<Alumno> comp1= new ComparadorCompuesto<Alumno>(orden1, orden2);
	    ComparadorCompuesto<Alumno> comp2= new ComparadorCompuesto<Alumno>(comp1, orden3);
	    
		
		ListaVinculada<Alumno> alumnos = new ListaVinculada<Alumno>(comp2);
		
		alumnos.addOrdenado(a0);
		alumnos.addOrdenado(a1);
		alumnos.addOrdenado(a2);
		alumnos.addOrdenado(a3);
		alumnos.addOrdenado(a4);
		alumnos.addOrdenado(a5);
		
		for(Alumno a : alumnos) {
			System.out.println(a);
		}

	}

}
