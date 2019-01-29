package it.esempi.db;

import java.util.Iterator;
import java.util.List;

import it.esempi.db.model.Autore;

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
		
		for (Iterator iterator = Lau.iterator(); iterator.hasNext();) {
			Autore autore = (Autore) iterator.next();
			System.out.println(autore);
			
		}
	}

	

}
