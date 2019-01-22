package it.esempijava;

public class Application {

	public static void main(String[] args) {
		
		/* Cambiando il right value di Esempio lo switch case attiva il relativo metodo dell'esempio */
		
		int Esempio = EsempiLista.ESEMPIO_STAMPA;
		
		
		switch (Esempio) {
		case EsempiLista.ESEMPIO_STAMPA:
			
			stampa();
						
			break;

		
		}
		

	}
	
	public static void stampa() {
		System.out.println("Testo stampato su console");
	}

}
