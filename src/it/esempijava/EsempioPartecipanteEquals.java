package it.esempijava;

import it.esempijava.crm.model.Partecipante;
import it.esempijava.crm.model.Studente;

public class EsempioPartecipanteEquals {
	
	
	public static void instanziaPartecipante(String nome, String cognome, String email, int eta) {
		
		/* ISTANZIO PARTECIPANTE CON E SETTO LE VARIABILI CON IL METODO SET */
	
		Partecipante p = new Studente();
		
		p.setNome(nome);
		p.setCognome(cognome);
		p.setEmail(email);
		p.setEta(eta);
		
		
		System.out.println(p);
		
	
	}

}
