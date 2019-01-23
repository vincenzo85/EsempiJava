package it.esempijava.crm.ui;

import it.esempijava.EsempiLista;
import it.esempijava.EsempiPartecipante;
import it.esempijava.EsempioDocente;
import it.esempijava.EsempioDocenteStudente;
import it.esempijava.EsempioStudente;
import it.esempijava.crm.model.Partecipante;

public class Application {

	public static void main(String[] args) {
		
		/* Cambiando il right value di Esempio lo switch case attiva il relativo metodo dell'esempio */
		
		int Esempio = EsempiLista.ESEMPIO_DOCENTE_PARTECIPANTE;
		
		
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
			
		case EsempiLista.ESEMPIO_STUDENTE:
		
			
			EsempioStudente.istanzioStudente();
		
			break;
			
		case EsempiLista.ESEMPIO_DOCENTE:
			
			EsempioDocente.istanzioDocente();
			
			break;
			
		case EsempiLista.ESEMPIO_DOCENTE_PARTECIPANTE:
			
			EsempioDocenteStudente.EsempioStudenteDocente();
			
			break;
		
		
		
		}
		
		
		

	}
	
	public static void stampa() {
		System.out.println("Testo stampato su console");
	}
	
	
	

}
