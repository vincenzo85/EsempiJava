package it.esempijava;

import it.esempijava.crm.model.Docente;
public class EsempioDocente {
	
	public static void istanzioDocente() {
		String nome = "Francesco";
		String email = "Francesco.bono@libero.it";
		int eta = 52;
		String cognome = "Bono";
		String piva ="09345";
		
		Docente s = new Docente(nome, cognome, eta, email, piva);
		
		
		System.out.println("Sto stampando docente utilizzando il metodo toString di cui ho fatto l'override");
		System.out.println(s);
		
		System.out.println("Sto stampando docente utilizzando il metodo calcola compenso giornaliero della classe astratta Partecipante");
		
		System.out.println(s + " compenso  € " + s.calcolaCompensoGiornaliero());
		
		
		
		
	}

}
