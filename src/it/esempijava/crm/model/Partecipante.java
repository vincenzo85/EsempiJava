package it.esempijava.crm.model;

public class Partecipante {
	
	/**
	 *  variabile di instanza, caratterizzano lo stato della classe ;
	 */
	
	private static int counter = 0;
	private int idx;
	
	private String nome;
	private String email;
	private int eta;
	private String cognome;
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	/* overriding del costruttore di default */
	public Partecipante() {
		
		this.idx = ++counter;
				
	}
	
	
	public Partecipante( String nome,  int eta, String cognome) {
		
		this();
		
		this.nome = nome;
		
		this.eta = eta;
		this.cognome = cognome;
	}
	
	/**
	 *  permette di stampare l'oggetto partecipante 
	 */
	@Override
	public String toString() {
		
		return super.toString()+ "TO STRNG METHOD " + "Nome: "+ nome + ", Cognome:" + cognome + ", email: " + email +  ", eta:" + eta ;
	}

}
