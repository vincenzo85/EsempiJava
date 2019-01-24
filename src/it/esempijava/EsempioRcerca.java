package it.esempijava;

import it.esempijava.crm.handler.GestorePartecipante;

public class EsempioRcerca {
	
	public static void Ricerca() {
	
	GestorePartecipante g = new GestorePartecipante();
	

	String input = g.getInput("Stabilisci il tipo di Partecipante da ricercare 0 STUDENTE 1 DOCENTE");
	
	g.stabilisciTIpologiaDiRicerca(input);
	
	
	
	
	}
	public static void Modifica() {
		
		GestorePartecipante g = new GestorePartecipante();
		

		String input = g.getInput("Stabilisci il tipo di Partecipante da modificare 0 STUDENTE 1 DOCENTE");
		
		g.stabilisciTIpologiaDiRicerca(input);
		
		
		
		
		
		}
	

}
