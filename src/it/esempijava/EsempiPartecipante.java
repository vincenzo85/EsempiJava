package it.esempijava;

import it.esempijava.crm.model.Partecipante;
import it.esempijava.crm.model.Studente;

public abstract class EsempiPartecipante {
	
	public static void EsempioEquals() {
		/* creo due partecipanti*/
		/* ISTANZIO PARTECIPANTE CON E SETTO LE VARIABILI CON IL METODO SET */
		
		System.out.println("Creo e stampo i due partecipanti");
		
		Partecipante p = new Studente();
		
		p.setNome("vincenzo");
		p.setCognome("di franco");
		p.setEmail("vincenzo.difranco@gmail.com");
		p.setEta(33);
		
		
		System.out.println(p);
		
		Partecipante p2 = new Studente();
		
		p2.setNome("marco");
		p2.setCognome("lombardo");
		p2.setEmail("marco.lombardo@gmail.com");
		p2.setEta(32);
				
		
		System.out.println(p2);
		
		/* Confronto due partecipanti */
		
		
		System.out.println("Confronto i due partecipanti p1 e p2 sono uguali? in termini di variabili di instanza ");
		
		p2.setNome("vincenzo");
		p2.setCognome("di franco");
		p2.setEmail("vincenzo.difranco@gmail.com");
		p2.setEta(33);
		
		boolean eq =p.equals(p2);
		
		/* Aspetto false */
		
		System.out.println("Confronto i due partecipanti p1 e p2 sono uguali? " + eq);

		System.out.println("Copio p in p2 hanno la stessa reference?");
		
		p=p2;
		
		System.out.println("Confronto i due partecipanti p1 e p2 sono uguali? " + p.equals(p2));
		
		
		
		
		
		
		
		
		
	}
	
	public static void instanziaPartecipante() {
		
		/* ISTANZIO PARTECIPANTE CON E SETTO LE VARIABILI CON IL METODO SET */
	
		Partecipante p = new Studente();
		
		p.setNome("vincenzo");
		p.setCognome("di franco");
		p.setEmail("vincenzo.difranco@gmail.com");
		p.setEta(33);
		
		
		System.out.println(p);
		
	
	}
	
	public abstract double calcolaCompensoGiornaliero();

}
