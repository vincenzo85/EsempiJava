package it.esempijava.crm.ui;

import it.esempi.interfacce.ConsolePrinter;
import it.esempi.interfacce.Printer;
import it.esempi.interfacce.PrinterBuilder;
import it.esempi.interfacce.TxtPrinter;
import it.esempijava.crm.model.Utente;
import it.esempijava.repo.Repository;

public class AppPrinter {

	public static void main(String[] args) {
		
		/* interfaccia mi permette di blindare i metodi di ConsolePrinter, cosi non posso instanziarne i metodi in maniera impropria */
		ConsolePrinter cp = new ConsolePrinter();
		cp.metodopub();
	//	cp.metodononpub();
		
		/* questo metodo non publico non può essere usato, cosi non faccio danni */
		int printerType = 0;
		
		new Repository();
		Utente[] data = Repository.getUtentiTable();
		
		Printer printer = PrinterBuilder.getPrinter(printerType);
		printer.print(data);
		

	}

}
