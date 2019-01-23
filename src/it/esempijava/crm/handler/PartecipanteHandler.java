package it.esempijava.crm.handler;

import it.esempijava.crm.model.Docente;
import it.esempijava.crm.model.Partecipante;
import it.esempijava.crm.model.Studente;

public class PartecipanteHandler {
	
	public static final int TYPE_STUDENTE=0;
	public static final int TYPE_DOCENTE=1;
	
	
	public static Partecipante[] creaPartecipantiList(int maxNum, int type) {
		
		Partecipante[] pList = new Partecipante[maxNum];
		
		for (int i = 0; i < pList.length; i++) {
			
			Partecipante partecipante = null;
			
			switch (type) {
			case TYPE_STUDENTE:
				partecipante = new Studente("nome_"+i, "cognome_"+i, "email_"+i, i*10, "matricola_"+i);
				
	
				
				break;

			case TYPE_DOCENTE:
				partecipante = new Docente("nome_"+i, "cognome_"+i, i*10, "email_"+i, "9823343_"+i);
				
				
				break;
			}
			
			pList[i] =partecipante;
			
			
		}
		
		printPartecipanti (pList);
		
		return pList;
	}
	
	private static void printPartecipanti (Partecipante[] pList) {
		
		for (int i = 0; i < pList.length; i++) {
			String out = "Nome:" + pList[i].getNome() + " Cognome:"+ pList[i].getCognome();
			System.out.println(pList[i]);
		}
		
	}

}

