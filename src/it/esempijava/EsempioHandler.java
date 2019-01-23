package it.esempijava;

import it.esempijava.crm.handler.PartecipanteHandler;



public class EsempioHandler {
	
	public static void EsempioHandlerDocente () {
		
		/* Creo l'array di Patecipanti*/
		
		
		
		
	    PartecipanteHandler.creaPartecipantiList(5, PartecipanteHandler.TYPE_STUDENTE);
		System.out.print("Creo 5 partecipanti di tipo studenti");
		System.out.print("me li stampo");
		
		PartecipanteHandler.creaPartecipantiList(1, PartecipanteHandler.TYPE_DOCENTE);
		System.out.print("Creo 1 partecipanti di tipo docente");
		System.out.print("me lo stampo");
		
		
		
		
	
	}

}
