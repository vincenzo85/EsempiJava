package it.esempijava.crm.model;

public class Risultati {
	
	private Partecipante p;
	
	private int Indice;
	
	

	public Risultati(Partecipante p, int indice) {
		
		this.p = p;
		Indice = indice;
		
	}

	public Partecipante getP() {
		return p;
	}

	public void setP(Partecipante p) {
		this.p = p;
	}

	public int getIndice() {
		return Indice;
	}

	public void setIndice(int indice) {
		Indice = indice;
	}
	
	
	

}

