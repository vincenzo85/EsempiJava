package it.esempi.eccezioni.classi;

public class Classe2 {
	
	public void f2() throws Exception {
		f3();
	}
	
	public void f3() throws Exception{
		
		/* creo un errore apposta */
		
		try {
		
		/* non mettere la chiusura della risorsa qua */
		
			for(int m=0; m<10;m++) {
				try {/* leggi la prima riga del documento */
					Integer i = null;
					int k = i.intValue();
				}catch (Exception e) {
					/* erorre di tipo dato sul file dell'export*/
					throw new Exception("Erroreeeee!");
				}
			}
		
		
		
		}catch (Exception e) {
			System.out.println("ok l'errore è stato catturato");
		      throw new Exception("errre durante l'import dei dati di Mario", e);
		//	throw e;
			/* creata classe excepition generica messaggio e causa dell'errore */
			
		}finally {
			
			/* mettere la chiusura qua */
			
			
		}
		
		
	}

}
