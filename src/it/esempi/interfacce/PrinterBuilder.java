package it.esempi.interfacce;

public class PrinterBuilder {
	

	
	/* Questa classe deve fare lo switch del bottone per restituirgli l'instanza corretta*/
	
	/* che tipo restituisce il tipo printer */
	
	public static Printer getPrinter (int printerType) {
		Printer printer = null;
		
	switch(printerType) {
		
		case 0:
		//	ConsolePrinter cp = new ConsolePrinter();
			printer = new ConsolePrinterFriendly();
			/* Reference di tipo printer con un costruttore ConsolePrinter   */
		
			
			break;
			
		case 1:
			
			printer = new ConsolePrinterNonFreindly();
			
			break;
			
		case 2:
			
			printer = new XlsPrinter();
			
			break;
			
			
		}
	
		return printer;
		
		
		
	}
	

}
