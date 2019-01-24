package it.esempi.workes;

public class Client {
	
	/* ha un metodo che sfrutta una relazione 
	 * 
	 * ha un metodo per notificare il chiamante 
	 * 
	 * */
	
	public void executeTask() {
		
		Worker w = new SyncWorkerImpl();
		
		w.execute();
		
		/* instanzio tramite interfaccia l'esecuzione.... */
		
		/* però quando ha finito voglio la notifica */
		
		/* uso classi anonime, costruite a run time ....  */
		
		
		
	}

}
