package it.esempijava.crm.model;

public class Utente {
	
	private String username;
	private String password;
	
	
	
	
	public Utente(int i, String string, String string2) {
		this.username = string;
		this.password = string2;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
