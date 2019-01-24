package it.esempi.workes;

public class SyncWorkerImpl implements Worker {
	
	private OnWorkerCompleteListener wListener;

	@Override
	public void execute() {
		boolean isOk=true;
		if(isOk) {
			this.wListener.onClompleteSuccess();
		} else {
			this.wListener.onCompleteFailure();
		}

	}
	
	/* è un setter classico */
	
	public void setupListener (OnWorkerCompleteListener wL) {
		this.wListener = wL;
	}

}
