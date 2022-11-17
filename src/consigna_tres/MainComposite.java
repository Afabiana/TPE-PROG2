package consigna_tres;

import comparadores.ComparadorCantAlumnos;
import consigna_uno.ListaVinculada;

public class MainComposite {

	public static void main(String[] args) {
		
		ComparadorCantAlumnos c = new ComparadorCantAlumnos();
		//generando nodo Historia y sus 3 nodos hijos (flora, martin y roman)
		Grupo historia= new Grupo(c,"historia");
		
		Alumno martin = new Alumno("Martin", "Gomez", 34111222, 34);
		martin.addInteres("romanos");
		martin.addInteres("egipcios");
		martin.addInteres("griegos");
		Alumno roman = new Alumno("Roman", "Bazan", 32555111, 34);
		roman.addInteres("argentina");
		Alumno flora = new Alumno("Flora", "Rivas", 34555111, 34);
		flora.addInteres("historia");
		flora.addInteres("antigua");
		
		historia.add(flora);
		historia.add(roman);
		historia.add(martin);
		
		//generando nodo "humanas"- Nodos hijos(2): nodo historia(generado previamente) y Mora Diaz
		Grupo humanas= new Grupo(c, "humanas");
		
		Alumno mora = new Alumno("Mora", "Diaz", 37124425, 34);
		mora.addInteres("psicologia");
		mora.addInteres("Freud");
		
		humanas.add(historia);
		humanas.add(mora);
		
		//generando nodo "exactas"- Nodos hijos(2): juana garcia y federico lopez
		Grupo exactas= new Grupo(c,"exactas");
		
		Alumno fede = new Alumno("Federico", "Lopez", 35999888, 34);
		fede.addInteres("redes");
		fede.addInteres("php");
		fede.addInteres("java");
		fede.addInteres("Python");
		
		Alumno juana = new Alumno("Juana", "Garcia", 27123455, 34);
		juana.addInteres("programacion");
		juana.addInteres("php");
		juana.addInteres("java");
		
		exactas.add(fede);
		exactas.add(juana);
		
		//generando nodo raiz "unicen"- Nodos hijos (3): nodo exactas, humanas y john doe
		Grupo unicen= new Grupo(c,"unicen");
		
		Alumno john = new Alumno("John", "Doe", 1200000, 34);
		john.addInteres("intercambio");
		
		unicen.add(john);
		unicen.add(exactas);
		unicen.add(humanas);
		
		//segunda estructura
		
		//generando nodo "los fibo" - Nodos hijos(3): jose paso, bernardino rivas, isaac newton
		Grupo fibo= new Grupo(c, "los fibo");
		
		Alumno bernardino = new Alumno("Bernardino", "Rivas", 30987654, 34);
		bernardino.addInteres("matematicas");
		
		Alumno jose = new Alumno("Jose", "Paso", 33322112, 34);
		jose.addInteres("problemas");
		
		Alumno isaac = new Alumno("Isaac", "Newton", 12343565, 34);
		isaac.addInteres("sucesiones");
		
		fibo.add(bernardino);
		fibo.add(jose);
		fibo.add(isaac);
		
		//generando nodo "matea2" - Nodos hijos(2): julio cesar y juan juarez
		Grupo matea2= new Grupo(c,"matea2");
		
		Alumno juan = new Alumno("Juan", "Juarez", 33222444, 34);
		juan.addInteres("sucesiones");
		juan.addInteres("algebra");
		
		Alumno julio = new Alumno("Julio", "Cesar", 333222111, 34);
		julio.addInteres("sucesiones");
		julio.addInteres("algebra");
		
		matea2.add(juan);
		matea2.add(julio);
		
		//generando nodo raiz "olimpiadas matematicas" - Nodos hijos (2) "matea2" y "los fibo"
		Grupo olimpiadas=new Grupo(c,"olimpiadas matematicas");
		olimpiadas.add(matea2);
		olimpiadas.add(fibo);
		
		//Implementar las siguientes dos estructuras e insértelas en una lista vinculada
		//ordenadas por cantidad total de alumnos (de mayor a menor)
		ListaVinculada<Elemento> universidad= new ListaVinculada<Elemento>(c);
		universidad.addNodoOrd(unicen);
		universidad.addNodoOrd(olimpiadas);
		
		for(Elemento e: universidad)
			System.out.println(e);
		

		
	}

}
