package it.esempijava;

import it.esempijava.crm.model.Studente;

public class EsempioStudente {
	
	public static void istanzioStudente() {
		String nome = "Marcello";
		String email = "Marcello.dellaria@libero.it";
		int eta = 12;
		String cognome = "Dell'Aria";
		String matricola ="09345";
		
		Studente s = new Studente(nome, email, eta, cognome, matricola);
		
		System.out.println("Sto stampando studente utilizzando il metodo toString di cui ho fatto l'override");
		System.out.println(s);
	}

}
