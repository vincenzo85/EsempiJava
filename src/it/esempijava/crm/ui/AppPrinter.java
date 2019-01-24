package it.esempijava.crm.ui;

import it.esempi.interfacce.ConsolePrinter;
import it.esempi.interfacce.Printer;
import it.esempi.interfacce.PrinterBuilder;
import it.esempi.interfacce.TxtPrinter;
import it.esempijava.crm.model.Utente;
import it.esempijava.repo.Repository;

public class AppPrinter {

	public static void main(String[] args) {
		
		int printerType = 0;
		
		new Repository();
		Utente[] data = Repository.getUtentiTable();
		
		Printer printer = PrinterBuilder.getPrinter(printerType);
		printer.print(data);
		

	}

}
