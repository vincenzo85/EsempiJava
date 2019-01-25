package it.esempijava.crm.model;

import it.esempi.gestoreutenti.UtenteR;
import it.esempi.gestoreutenti.UtenteW;

public class Utente implements UtenteR, UtenteW {
	
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
	@Override
	public void setID(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
