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
		
		
		
		
		
		switch(printerType) {
		
		case 0:
		//	ConsolePrinter cp = new ConsolePrinter();
			Printer cp = new ConsolePrinter();
			/* Reference di tipo printer con un costruttore ConsolePrinter   */
			cp.print(data);
			
			break;
			
		case 1:
			
			Printer tp = new TxtPrinter();
			tp.print(data);
			break;
			
		default: 
			System.out.println("Formato di stampa non supportato");
			
		}
		
		
		

	}

}
