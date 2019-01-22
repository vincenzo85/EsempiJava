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

}
