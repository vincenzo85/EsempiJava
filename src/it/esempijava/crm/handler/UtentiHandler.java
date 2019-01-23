package it.esempijava.crm.handler;



import it.esempijava.crm.model.Utente;
import it.esempijava.repo.Repository;

public class UtentiHandler {
	
	public boolean authorize ( String user, String password) {
		
		Utente[] utenti = Repository.getUtentiTable();
		
		for (Utente utente : utenti) {
			
			if (user.contentEquals(utente.getUsername()) 
					&& password.equals(utente.getPassword())) {
				return true;
			}
		}
		
		return false;
	}

}
