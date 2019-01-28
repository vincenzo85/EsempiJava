package it.esempi.eccezioni;

import it.esempijava.crm.model.Utente;

public class TestEccezioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* questo va in eccezzione NullPointer */
		
		Utente u = null;
		
		
		try {
				int id = u.getId();
				
				/* ipotesi di lavoro */
				
				/* apro connessione */
				/* usa la connessione */
				/* chiudo la connessione */
				
		} catch(NullPointerException npe) {
			
			System.err.println("Sono in null pointer");
			npe.printStackTrace();
					
		}
		
		System.out.println("adesso faccio altro");
		
		
		try {
			int id = u.getId();
			
	    } catch(Exception e) {
		
		System.err.println("invia la pagina di errore ");
		e.printStackTrace();
				
	    } finally {
	    	
	    	
	    System.out.println("ADESSO HO IL CONTROLLO DELLA SITUAZIONE IO E TI RESETTO TUTTO");
	    
	    /* chiudi la connessione */
	    	
	    }
	
	System.out.println("adesso faccio altro");

		
		
		

	}

}
