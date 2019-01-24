package it.esempi.workes;

public class SyncWorkerImpl implements Worker {
	
	private OnWorkerCompleteListener wListener;

	@Override
	public void execute() {
		
		boolean isOk=true;
		
		if(Math.random()<=0.5) {
			isOk=false;
		}
		
				
		
		if(isOk) {
			System.out.println("Ti richiamo per succ");
			this.wListener.onClompleteSuccess();
		} else {
			System.out.println("Ti richiamo per fail");
			this.wListener.onCompleteFailure();
		}

	}
	
	/* è un setter classico */
	
	public void setupListener (OnWorkerCompleteListener wL) {
		this.wListener = wL;
	}

}
