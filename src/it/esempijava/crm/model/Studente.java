package it.esempijava.crm.model;


public class Studente extends Partecipante {
	
	
	
	
	private String matricola;
	


	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Studente() {
		
		
	
		
		System.out.println("Sono dentro la classe Studente, Richiamo il costruttore della classe padre Partecipante");
	
		
		
		System.out.println("Aggiungo matricola alla variabile di instanza");
		
		
	}
	
	public Studente(String nome, String cognome, String email, int eta, String matricola) {
		
		
		
		super(nome, email, eta, cognome);
		
		
		
		this.matricola = matricola;
		
		
		
	}
	
	public String  toString() {
		return super.toString() + ", Matricola:" + matricola;
	}

	@Override
	public double calcolaCompensoGiornaliero() {
		// TODO Auto-generated method stub
		return 0;
	}

}
