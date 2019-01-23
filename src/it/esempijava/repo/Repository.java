package it.esempijava.repo;

import it.esempijava.crm.model.Utente;

public class Repository {
	
	private static Utente[] utentiTable;
	static {
		initUtentiTable();
	}
	
	private static void initUtentiTable() {
		utentiTable = new Utente[10];
		
		for (int i = 0; i < utentiTable.length; i++) {
			Utente u = new Utente(i, "user"+i, "pwd"+i);
			
		}
	}
	
	public static Utente[] getUtentiTable() {
		return utentiTable;
	}
}
