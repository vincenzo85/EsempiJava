package it.esempi.eccezioni.classi;

public class Classe1 {
	
	public void f1() {
		Classe2 c2 = new Classe2();
		try {
			c2.f2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Classe1 c1 = new Classe1();
		c1.f1();
	}
	

}
