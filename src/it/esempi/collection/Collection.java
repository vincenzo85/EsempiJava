package it.esempi.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import it.esempi.db.model.Libro;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lista();
		listaStringhe();
		
		
		
		
	}
	
	public static List<Integer> lista() {
		
		List listaUtenti = new ArrayList();
		
		// "array list implements list";
		
		// " scatola di oggetti di tipo diverso 
		
		System.out.println(listaUtenti.add(new Integer(10)));
		listaUtenti.add(new String("ciao"));
		
				
		return listaUtenti;
		
	}
	
	public static List<String> listaStringhe() {
		
		
		List<String> listaUtenti = new ArrayList<String>();
		
		// "array list implements list";
		
		// " scatola di oggetti di tipo diverso 
	
		listaUtenti.add(new String("altro"));
		listaUtenti.add(new String("ciao"));
		System.out.println("test");
		Iterator<String> iterator = listaUtenti.iterator();
		
		while(iterator.hasNext()) {
			System.out.println((String) iterator.toString());
			iterator.next();
			}
		
		return  listaUtenti;
		
		
		
		
	}
	
	

}
