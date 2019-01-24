package it.esempijava.crm.db;

import it.esempijava.crm.model.Docente;
import it.esempijava.crm.model.Partecipante;
import it.esempijava.crm.model.Risultati;
import it.esempijava.crm.model.Studente;

public class Repository {
	
	public static Docente[] d = new Docente[3];
	public static Studente[] s = new Studente[3];
	public static Partecipante p;
	public static Risultati risultati;
	
	static {
		
			
			
			
			Docente d3 = new Docente("porto", "bello", 23, "porto.belloi@libero.it", "3453453636");
			Docente d2 = new Docente("marco", "milin", 23, "marco.milin@libero.it", "34534ertte");
			Docente d1 = new Docente("paolo", "rossi", 23, "paolo.rossi@libero.it", "3453453636");
			
			d[0]=d1;
			d[1]=d2;
			d[2]=d3;
				
			
			
			
			Studente s1 = new Studente("marco", "millin", "cist.pablo@lib.com", 32, "colger");
			Studente s2 = new Studente("micel", "milin", "marco.milin@libero.it", 23, "34534eeretrtte");
			Studente s3 = new Studente("porto", "bello", "porto.belloi@libero.it", 23, "345errt3453636");
			
			s[0]=s1;
			s[1]=s2;
			s[2]=s3;
		
	}
	
	
	public boolean ricercaDocente(String str) {
		
	  	for (int i = 0; i < Repository.d.length; i++) {
			if(d[i].getNome().contains(str)) {
				
				p=d[i];
				risultati.setIndice(i);
				risultati.setP(d[i]);
				return true;
			}
			
		}
	  	return false;
	}
	
	public boolean ricercaStudente(String str) {
		
	  	for (int i = 0; i < Repository.s.length; i++) {
			if(s[i].getNome().contains(str)) {
				
				p=s[i];
				risultati.setIndice(i);
				risultati.setP(s[i]);
				return true;
			}
			
		}
	  	return false;
	}
	
	public boolean  modicaDocente (String str) {
		boolean rc =ricercaDocente(str);
		
		if (rc) {
			
			d[risultati.getIndice()].setNome(str);
		}
		
		return rc;
		
	}
	
	
	
	
	
}