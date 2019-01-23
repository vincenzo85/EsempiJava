package it.esempijava.crm.handler;

import java.util.Scanner;

public class GestorePartecipante {
	
	public static final String PARTECIPANTE_STUDENTE="0";
	public static final String PARTECIPANTE_DOCENTE="1";
	
	public static void inserisciPartecipante(int type) {
		/* da programmare */
		
	}
	
	
	
	public void stabilisciTIpologiaDiRicerca(String input) {
			
		RicercaPartecipante rp = new RicercaPartecipante();
		
		
		switch (input) {
		case PARTECIPANTE_STUDENTE:
			
			rp.RicercaStudente();
			
			break;

		case PARTECIPANTE_DOCENTE:
			
			rp.RicercaDocente();
			
			break;
		}
		
	}
	
	public String getInput (String prompt) {
		
		System.out.print(prompt);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
		
	}

}
