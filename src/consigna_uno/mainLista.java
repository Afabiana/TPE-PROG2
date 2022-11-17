package consigna_uno;

import comparadores.ComparadorAsc;
import comparadores.ComparadorInverso;
import comparadores.ComparadorString;

public class mainLista {

	public static void main(String[] args) {
			
			
		//----------------desarrollo lista de integers----------------
	
		Integer a=10;
		Integer b=21;
		Integer c=1;
		Integer d=5;
		Integer e=11;
	
		ComparadorAsc orden= new ComparadorAsc();
	
		ListaVinculada<Integer> lista = new ListaVinculada<Integer>(orden);
	
		lista.addNodoOrd(a);
		lista.addNodoOrd(b);
		lista.addNodoOrd(c);
		lista.addNodoOrd(d);
		lista.addNodoOrd(e);
	
			
	        
		//b) Se recorra la lista creada (utilizando un foreach) y se impriman los valores por consola
		System.out.println("Lista de enteros");
	    for(Integer numero : lista) {
	        System.out.println(numero);
	    }
	    
	    //c) Se elimine el primer elemento de la lista (por posición)
	    System.out.println("\n"+ "Se va a eliminar por pos el primer nodo cuyo valor es: "+lista.getNodoPorPos(0)+"\n");
	    lista.eliminarNodoPorPos(0);
	    
	    //c) luego el elemento “5” 
	    System.out.println("Se elimina el valor 5\n");
	    lista.EliminarTodaOcurrencia(5);
	    
	    //c) luego el elemento “11” (dado el elemento).
	    System.out.println("Se elimina el valor 11\n");
	    lista.EliminarTodaOcurrencia(11);
	    
	    //c) Volver a recorrer e imprimir la lista resultante.
	    System.out.println("Lista de enteros con elementos ya eliminados");
	    for(Integer numero : lista) {
	        System.out.println(numero);
	    }
	    
	    //----------------desarrollo lista de strings----------------
	    
	    //d)Se crea la lista de strings, con los valores insertados en el siguiente orden:
	    //“Fácil”, “Es”, “Parcial”, “Prog 2”.
	    
	    String f="Facil";
	    String g="Es";
	    String h="Parcial";
	    String i="Prog2";
	    
	    ComparadorString compTexto= new ComparadorString();
	    
	    ListaVinculada<String> textos= new ListaVinculada<String>(compTexto);
	
		textos.addNodoOrd(f);
		textos.addNodoOrd(g);
		textos.addNodoOrd(h);
		textos.addNodoOrd(i);
	
		//e) Se recorra la lista creada y se impriman los valores por consola
		System.out.println("\n"+"Lista de strings");
		
	    for(String palabra : textos) {
	        System.out.println(palabra);
	    }
	    
	    //f) Imprimir por consola en qué posición se encuentra la palabra “Parcial”.
	    int pos= textos.getPosPrimerOcurrencia("Parcial");
	    System.out.println("\n"+"La palabra 'Parcial' se cuentra en la posicion: "+pos+"\n");
	    
	    //g) Imprimir por consola en qué posición se encuentra la palabra “Recuperatorio”
	    int posrecu= textos.getPosPrimerOcurrencia("Recuperatorio"); //va a ser negativo porque no existe
	    System.out.println("La palabra 'recuperatorio' se cuentra en la posicion: "+posrecu+"\n");
	  
	    //h) Se cambie el orden de la lista de strings para que los elementos queden ordenados descendentemente.
	    ComparadorInverso<String> inverso= new ComparadorInverso<String>(compTexto);
	    textos.setOrden(inverso);
	    textos.reordenar();
	    
	    System.out.println("Lista de strings con orden invertido");
	    for(String palabra : textos) {
	        System.out.println(palabra);
	    }
	    //----------------Consigna 4.i) esta resuelta en paquete:consigna_tres-archivo:mainComposite----------------
      
	}

}
