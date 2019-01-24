package it.esempijava.crm.ui;

import it.esempi.workes.Client;
import it.esempi.workes.Client2;

public class EsempioInversione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Client c = new Client();
		
		System.out.println("Chiamo CLIENT");
		c.executeTask();
		
		Client2 c2 = new Client2();
		c2.executeTask();

	}

}
