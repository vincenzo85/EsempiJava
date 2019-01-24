package it.esempijava.crm.ui;

import it.esempi.interfacce.ConsolePrinter;
import it.esempijava.crm.model.Utente;
import it.esempijava.repo.Repository;

public class AppPrinter {

	public static void main(String[] args) {
		
		int printerType = 0;
		
		new Repository();
		Utente[] data = Repository.getUtentiTable();
		
		
		
		
		
		switch(printerType) {
		
		case 0:
			ConsolePrinter cp = new ConsolePrinter();
			cp.print(data);
			
			break;
		case 1:
			break;
			
		default: 
			System.out.println("Formato di stampa non supportato");
			
		}
		
		
		

	}

}
