package it.esempijava.crm.ui;

import it.esempijava.EsempiLista;
import it.esempijava.EsempiPartecipante;
import it.esempijava.crm.model.Partecipante;

public class Application {

	public static void main(String[] args) {
		
		/* Cambiando il right value di Esempio lo switch case attiva il relativo metodo dell'esempio */
		
		int Esempio = EsempiLista.ESEMPIO_EQUALS;
		
		
		switch (Esempio) {
		case EsempiLista.ESEMPIO_STAMPA:
			
			stampa();
						
			break;
			
		case EsempiLista.ESEMPIO_CLASSE:
		
			
			EsempiPartecipante.instanziaPartecipante();
		
			break;
			
		case EsempiLista.ESEMPIO_EQUALS:
		
			
			EsempiPartecipante.EsempioEquals();
		
			break;
		
		}
		
		
		

	}
	
	public static void stampa() {
		System.out.println("Testo stampato su console");
	}
	
	
	

}
