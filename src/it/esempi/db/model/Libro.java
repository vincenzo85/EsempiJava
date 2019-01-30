package it.esempi.db.model;

public class Libro implements Biblioteca{
	
	private long id;
	private String isbn;
	private String titolo;
	private Autore a;
	private float costo;
	private int version;
	
	public Libro() {
		this.a = new Autore();
	}
	
	

	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Autore getA() {
		return a;
	}
	public void setA(Autore a) {
		this.a = a;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "LIBRO ID:" + id + "NOME: " + isbn + "COGNOME: " + titolo 
				+ a.toString() ; 
	}
	
	
	


}
