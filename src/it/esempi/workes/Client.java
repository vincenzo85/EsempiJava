package it.esempi.workes;

public class Client {
	
	/* ha un metodo che sfrutta una relazione 
	 * 
	 * ha un metodo per notificare il chiamante 
	 * 
	 * */
	private OnWorkerCompleteListener wL = new OnWorkerCompleteListener() {
		/* sto creando la classe a run time (classi anonime)
		 * 
		 * mi creo ad hoc un'implementazione 
		 *  
		 *  */
		@Override
		public void onCompleteFailure() {
			// TODO Auto-generated method stub
			System.out.println("non bene");
		}
		
		@Override
		public void onClompleteSuccess() {
			// TODO Auto-generated method stub
			
			System.out.println("tutto bene");
			
		}
	};
	
	public void executeTask() {
		
		
		System.out.println("Chiamo SyncWorkerImpl");
		
		
		SyncWorkerImpl w = new SyncWorkerImpl();
		w.setupListener(wL);
		
        w.execute();
		
		/* instanzio tramite interfaccia l'esecuzione.... */
		
		/* però quando ha finito voglio la notifica */
		
		/* uso classi anonime, costruite a run time ....  */
		
		
		
	}

}
