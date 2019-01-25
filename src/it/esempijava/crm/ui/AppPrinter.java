package it.esempijava.crm.ui;


import it.esempi.interfacce.ConsolePrinterNonFreindly;
import it.esempi.interfacce.Printer;
import it.esempi.interfacce.PrinterBuilder;
import it.esempi.interfacce.PrinterList;
import it.esempijava.crm.model.Utente;
import it.esempijava.repo.Repository;

public class AppPrinter {

	public static void main(String[] args) {
		
		/* interfaccia mi permette di blindare i metodi di ConsolePrinter, cosi non posso instanziarne i metodi in maniera impropria */
		ConsolePrinterNonFreindly cp = new ConsolePrinterNonFreindly();
		cp.metodopub();
	//	cp.metodononpub();
		
		/* questo metodo non publico non può essere usato, cosi non faccio danni */
		
		
	//	ConsolePrinterFriendly cp2 = new ConsolePrinterNonFrindly();
		/* questo metodo non posso instanziarlo*/
		
		/* mi conviene in alcuni casi in cui non voglio instanziare direttamente .... quindi li metto frinedly */
		
		
		new Repository();
		Utente[] data = Repository.getUtentiTable();
//		pl.PRINTER_TYPE_CONSOLE_PRINTER_FRIENDLY;
		/*Facciamo due prove*/
		int listPrinterType[] = { PrinterList.PRINTER_TYPE_CONSOLE_PRINTER_FRIENDLY , PrinterList.PRINTER_TYPE_CONSOLE_PRINTER_NON_FRIENDLY };
		
		for (int printerType: listPrinterType) {
			
			Printer printer = PrinterBuilder.getPrinter(printerType);
			printer.print(data);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
