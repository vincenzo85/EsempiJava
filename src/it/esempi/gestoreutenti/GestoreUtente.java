package it.esempi.gestoreutenti;

import it.esempijava.crm.model.Utente;

public class GestoreUtente {
	
	/*
	 * 
	 */
	public UtenteR getUtenteInSolaLettura() {
		return  new Utente(10,"admin", "admin");
	}
	public UtenteW getUtenteInSolaScrittura() {
		return  new Utente(10,"admin", "admin");
	}

}
