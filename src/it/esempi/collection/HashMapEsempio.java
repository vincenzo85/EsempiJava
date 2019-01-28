package it.esempi.collection;

import java.util.HashMap;
import java.util.Map;

import it.esempijava.crm.model.Utente;

public class HashMapEsempio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	getUtente();
		
		
	}
	
	public static Map<Integer, Utente> getUtente(){
		
		Map<Integer, Utente> userMap = new HashMap<Integer, Utente>() ;
		Utente u = new Utente(12, "Mario", "Balotelli");
		userMap.put(u.getId(), u);
		
		if(userMap.containsKey(1000)) {
			Utente un = userMap.get(1000);
			un.getUsername();
			
		}
		
		
		
		return userMap;
		
	}
	

}
