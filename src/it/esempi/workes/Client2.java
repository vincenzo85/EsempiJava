package it.esempi.workes;

public class Client2 {
	
	/* ha un metodo che sfrutta una relazione 
	 * 
	 * ha un metodo per notificare il chiamante 
	 * 
	 * */
	private Listener wListener = new Listener();
	
	public void executeTask() {
		
		
		System.out.println("Chiamo SyncWorkerImpl da Client2");
		
		
		SyncWorkerImpl w = new SyncWorkerImpl();
		w.setupListener(wListener);
		
        w.execute();
		
		/* instanzio tramite interfaccia l'esecuzione.... */
		
		/* però quando ha finito voglio la notifica */
		
		/* uso classi anonime, costruite a run time ....  */
		
		
		
	}

}
