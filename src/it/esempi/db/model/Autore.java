package it.esempi.db.model;

public class Autore implements Biblioteca{
	
	private int 	id;
	private String 	nome;
	private String 	cognome;
	
	
	
	public void setAutore(int id, String nome, String cognome) {
		Autore a = new Autore();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AUTORE ID: '" + id + "' NOME: '" + nome + "' COGNOME: '" + cognome + "'"; 
	}
	
	
	
	

}
