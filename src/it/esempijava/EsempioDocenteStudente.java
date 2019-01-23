package it.esempijava;

import it.esempijava.crm.model.Docente;
import it.esempijava.crm.model.Partecipante;
import it.esempijava.crm.model.Studente;

public class EsempioDocenteStudente {
	
	
	
		public static void EsempioStudenteDocente() {
			/* creo due partecipanti*/
			/* ISTANZIO PARTECIPANTE CON E SETTO LE VARIABILI CON IL METODO SET */
			
			System.out.println("Creo e stampo i due partecipanti");
			
			int et = 32;
			String n="vincenzo";
			String c="di franco";
			String e="vincenzo.difranco@gmail.com";
			String m="00034";
			
			Studente p = new Studente(n, c, e, et, m);
			
		  
			
			
			
			

			String nome = "Francesco";
			String email = "Francesco.bono@libero.it";
			int eta = 52;
			String cognome = "Bono";
			String piva ="09345";
			
			Docente s = new Docente(nome, cognome, eta, email, piva);
			
			
			System.out.println("Sto stampando docente e studente utilizzando il metodo toString di cui ho fatto l'override");
			
			
			
			Partecipante[] partecipanti = new Partecipante[2];
			partecipanti[0]= p;
			
			partecipanti[1]= s;
			
			for (int i = 0; i < partecipanti.length; i++) {
				Partecipante partecipante = partecipanti[i];
				
				printPartecipante(partecipante);
			}
			
			System.out.println("mi accorgo che il metodo toString chiamato è diverso se docente o studente grazie al polimorfismo");
			
		
	}
		
		private static void printPartecipante(Partecipante p) {
			System.out.println(p);
		}
		
		

}
