package it.esempi.db;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import it.esempi.db.model.Autore;
import it.esempi.db.model.Libro;
import it.esempi.eccezioni.Eccezioni;

public class db {
	
	/* organizzato in tabelle */
	
	/*
	 *  INSERT INTO `corso_java`.`autore` (`nome`, `cognome`) VALUES ('Mario', 'Rossi');
	 */

	/*
	 * INSERT INTO `corso_java`.`autore` (`nome`, `cognome`) VALUES ('Francesco', 'Mauri');
	 */
	
	/*
	 * INSERT INTO `corso_java`.`libro` (`isbn`, `titolo`, `id_autore`, `costo`) VALUES ('09485304534', 'Java Core', '1', '100');
	 */
	
	public static void main(String[] args) {
		
		
		AutoreDao au = new AutoreDao();
		
		List<Autore> Lau = null;
		
		Lau = au.findAll();
		
		for (Iterator<Autore> iterator = Lau.iterator(); iterator.hasNext();) {
			Autore autore = (Autore) iterator.next();
			System.out.println(autore);
			
		}
		
//		try {
//		List<Libro> Listb = null;
//		
//		LibroDAO Lb1 = new LibroDAO();
//		
//		
//			Listb = Lb1.findAll();
//			
//			for (Iterator<Libro> iterator  = Listb.iterator(); iterator.hasNext();) {
//				Libro libro =  iterator.next();
//				System.out.println(libro);
//			}
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		Libro l = new Libro();
		LibroDAO Ldao = new LibroDAO();
		try {
			
			l=Ldao.findById(2l);
			System.out.println(l.getA()+ " ISBN : '" + l.getIsbn() + "'"+ " Costo : '" + l.getCosto() + " €'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			l.setTitolo("titolo di testo");
			System.out.println("Inserito "+Ldao.InsertLibro(l)+ " record");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		scegliAutore();
		
	}
	
	
	
	private static int scegliAutore() {
		Autore aut = null;
		Long selectedId = null;
		System.out.println("Selezionare autore tra: ");
		AutoreDao ad = new AutoreDao();
		List<Autore> authList = ad.findAll();
		for (Autore autore : authList) {
			System.out.print(autore);
			System.out.println(".............");
		}
		Long ida = null;
		Scanner scanner = new Scanner(System.in);
		do {
		try {
			System.out.println("inserisci un id dell'autore");
			String id = scanner.nextLine();
			
			ida = Long.parseLong(id);
			
			AutoreDao Ad = new AutoreDao();
			aut = Ad.findById(ida);
			if(aut == null) {
			System.out.println("Non esiste l'autore " + ida);
			throw new Exception();
		}
		} catch (Exception e) {
			System.out.println("Id non valido per autore");
		}
		}while(ida==null);
		
		scanner.close();
		
		// verifica se id c'è;
		
		
		return aut.getId();
		
		
		
	}
	

	

}
