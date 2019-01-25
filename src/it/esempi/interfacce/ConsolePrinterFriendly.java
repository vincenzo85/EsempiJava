package it.esempi.interfacce;

import it.esempijava.crm.model.Utente;

class ConsolePrinterFriendly implements Printer{
	public void metodopub () {
		
	}
	void metodononpub() {
		
	}

	@Override
	public void print(Utente[] data) {
		// TODO Auto-generated method stub
		System.out.println("Ciao sono printer Friendly un giorno stamperò Qualcosa in maniera ConslePrinterFriendly Utente[] data");
	}
	
	

}
