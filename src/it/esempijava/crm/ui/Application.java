package it.esempijava.crm.ui;

import it.esempijava.EsempiLista;
import it.esempijava.crm.model.Partecipante;

public class Application {

	public static void main(String[] args) {
		
		/* Cambiando il right value di Esempio lo switch case attiva il relativo metodo dell'esempio */
		
		int Esempio = EsempiLista.ESEMPIO_CLASSE;
		
		
		switch (Esempio) {
		case EsempiLista.ESEMPIO_STAMPA:
			
			stampa();
						
			break;
			
		case EsempiLista.ESEMPIO_CLASSE:
		
			
			instanziaPartecipante();
		
			break;
		
		}
		

	}
	
	public static void stampa() {
		System.out.println("Testo stampato su console");
	}
	
	public static void instanziaPartecipante() {
		
		/* ISTANZIO PARTECIPANTE CON E SETTO LE VARIABILI CON IL METODO SET */
	
		Partecipante p = new Partecipante();
		
		p.setNome("vincenzo");
		p.setCognome("di franco");
		p.setEmail("vincenzo.difranco@gmail.com");
		p.setEta(33);
		
		
		System.out.println(p);
		
	
	}
	

}
