package it.esempijava.crm.model;

public class Docente extends Partecipante {
	
	private String piva;
	
	
	/* Creo il costruttore della classe (modificandolo) */
	
	public Docente(String nome, String cognome, int eta, String email, String piva) {
		
		super(nome, email, eta, cognome);
	
		System.out.println("Sono dentro la classe Docente, Richiamo il costruttore della classe padre Partecipante");
		
		this.piva = piva;
		
	}
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}

	public String getPiva() {
		return piva;
	}

	

	public void setPiva(String piva) {
		this.piva = piva;
	}
	
	public String  toString() {
		return super.toString() + ", Partita iva: " + piva;
	}

	@Override
	public double calcolaCompensoGiornaliero() {
		// TODO Auto-generated method stub
		return 1000*8;
	}
	
	

}
