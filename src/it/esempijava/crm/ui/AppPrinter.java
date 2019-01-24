package it.esempijava.crm.ui;

import it.esempi.interfacce.ConsolePrinter;
import it.esempi.interfacce.Printer;
import it.esempi.interfacce.TxtPrinter;
import it.esempijava.crm.model.Utente;
import it.esempijava.repo.Repository;

public class AppPrinter {

	public static void main(String[] args) {
		
		int printerType = 0;
		
		new Repository();
		Utente[] data = Repository.getUtentiTable();
		
		Printer printer = null;
		
		
		
		switch(printerType) {
		
		case 0:
		//	ConsolePrinter cp = new ConsolePrinter();
			printer = new ConsolePrinter();
			/* Reference di tipo printer con un costruttore ConsolePrinter   */
		
			
			break;
			
		case 1:
			
			printer = new TxtPrinter();
			
			break;
			
		default: 
			System.out.println("Formato di stampa non supportato");
			
		}
		// non mi interessa sapere su quale printer lo sto chiamando, gli interessa selezionare il printer giusto in base al tipo 
		printer.print(data);
		
		

	}

}
