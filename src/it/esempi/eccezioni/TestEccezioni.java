package it.esempi.eccezioni;

import it.esempijava.crm.model.Utente;

public class TestEccezioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* questo va in eccezzione NullPointer */
		
		Utente u = null;
		
		
		try {
				int id = u.getId();
				
		} catch(NullPointerException npe) {
			
			System.err.println("Sono in null pointer");
			npe.printStackTrace();
			
			
		}
		
		System.out.println("adesso faccio altro");

		
		
		

	}

}
