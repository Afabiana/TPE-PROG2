package consigna_dos;

import java.util.ArrayList;

public class Alumno{
	
	private int dni;
	private String nombre;
	private String apellido;
	private int edad;
	//private LocalDate nacimiento; //a partir de esta fecha podria calcular edad.
	private ArrayList<String> intereses;
	
	public Alumno(String nombre, String apellido, int dni, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad=edad;
		this.intereses=new ArrayList<>();
	}

	//getters
	public int getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	//setters
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void addInteres(String interes) {
		if(!this.intereses.contains(interes))
			this.intereses.add(interes);
	}
	
	public String toString() {
		return this.getNombre()+" "+this.getApellido()+", "+this.getDni();
	}
}
