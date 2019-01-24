package it.esempi.workes;

public class Listener implements OnWorkerCompleteListener {

	

	@Override
	public void onClompleteSuccess() {
		// TODO Auto-generated method stub
		System.out.println("Successo scritto dalla classe listener");
	}

	@Override
	public void onCompleteFailure() {
		// TODO Auto-generated method stub
		System.out.println("Failure scritto dalla classe listener");
	}

}
