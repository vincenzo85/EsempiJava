package it.esempijava.crm.model;


public class Studente extends Partecipante {
	
	private String matricola;

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Studente(String nome, String email, int eta, String cognome, String matricola) {
		
		
		super(nome, eta, cognome);
		
		System.out.println("Richiamo il costruttore della classe padre");
	
		this.matricola = matricola;
		
		System.out.println("Aggiungo matrica alla variabile di instanza");
		
		
	}
	public String  toString() {
		return super.toString() + ", Matricola:" + matricola;
	}

}
