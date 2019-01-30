package it.esempi.db;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import it.esempi.db.model.Autore;
import it.esempi.db.model.Libro;

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
		
		LibroDAO Ldao = new LibroDAO();
		try {
			Libro l = new Libro();
			l=Ldao.findById(2l);
			System.out.println(l.getA()+ " ISBN : '" + l.getIsbn() + "'"+ " Costo : '" + l.getCosto() + " €'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
