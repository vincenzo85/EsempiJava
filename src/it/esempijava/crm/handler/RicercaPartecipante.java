package it.esempijava.crm.handler;

import java.util.Scanner;

import it.esempijava.crm.db.Repository;

public class RicercaPartecipante extends GestorePartecipante {
	
	Repository rep = new Repository();
	
	


	public  void  RicercaDocente() {
		
		String ricerca=super.getInput("Ricerca un docente");
		
		if(rep.ricercaDocente(ricerca)) {
			rep.p.stampaPartecipante();
		}else { 
			System.out.println("Nessun docente trovato");
		}
		
		
		
	}
	
	public  void RicercaStudente() {
		
		String ricerca=super.getInput("Ricerca uno studente");
		
		if(rep.ricercaStudente(ricerca)) {
		
		rep.p.stampaPartecipante();
		
		}else { 
			System.out.println("Nessun studente trovato");
		}
		
	}
	
	public String getInput (String prompt) {
		
		System.out.print(prompt);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
		
	}


}
