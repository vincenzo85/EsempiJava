package it.esempi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.esempi.db.model.Autore;
import it.esempi.db.model.Libro;

public class LibroDAO {
	/* da sostituire con la custom */
	public List<Libro> findAll() throws Exception{
		
			List<Libro> retList = null;
			Connection conn = null;

		try {
			
			conn = DatabaseUtils.openMySqlConnection();
			
			Statement stm = conn.createStatement();
			
			String sql = "SELECT  l.id as id_libro, l.isbn,l.costo, a.id as id_autore, a.nome as nome_autore, a.cognome as cognome_autore, a.version as version FROM corso_java.libro l INNER JOIN corso_java.autore a  ON l.id_autore = a.id";

		
			
			ResultSet rs = stm.executeQuery(sql);
			
			retList = new ArrayList<>();
			
			while(rs.next()) {
				
				Libro lb = new Libro();
				Autore au = new Autore();
				
				lb.setId(rs.getLong("id_libro"));
				lb.setIsbn(rs.getString("isbn"));
				
				Autore au1 = lb.getA();
				
				au1.setAutore(rs.getInt("id_autore"), rs.getString("nome_autore"), rs.getString("cognome_autore"));
				
				
			retList.add(lb);	
						
			}
			
			
		} catch (Exception e) {
			
			throw e;
		}finally {
			if(conn != null)
			conn.close();
		}
		
		
		
		return retList;
		
		
	}
	
	
	public Libro findById(Long id) throws SQLException {
		
		Libro retLibro = null;
		Connection con = null;
		
		try {
			con = DatabaseUtils.openMySqlConnection();
			String query = "SELECT \r\n" + 
					"l.id as id_libro,\r\n" + 
					"l.isbn,\r\n" + 
					"l.costo,\r\n" + 
					"a.id as id_autore,\r\n" + 
					"a.nome as nome_autore,\r\n" + 
					"a.cognome as cognome_autore,\r\n" + 
					"a.version as version\r\n" + 
					"FROM corso_java.libro  l \r\n" + 
					"INNER JOIN corso_java.autore  a\r\n" + 
					"ON l.id_autore = a.id\r\n" + 
					"WHERE\r\n" + 
					"l.id = ?";
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			
			// while è inutile if è meglio ... c'è ne solo uno
			
			if(rs.next()) {
				retLibro = new Libro();
				retLibro.setIsbn(rs.getString("isbn"));
				retLibro.setCosto(rs.getFloat("costo"));
				Autore a = retLibro.getA();
				a.setId(rs.getInt("id_autore"));
				a.setCognome(rs.getString("cognome_autore"));
				a.setNome(rs.getString("nome_autore"));
				
				
			}else {
				/* LANCIA ECCEZIONE */
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			con.close();
		}
		
		return retLibro;
		
		
	}
	
	
	
	
	//INSERT INTO `corso_java`.`libro` (`isbn`, `titolo`, `id_autore`, `costo`) VALUES ('0923480958', 'Corso', '2', '400');
	
	public int InsertLibro(Libro l) throws SQLException {
		int U=0;
		Connection con= null;
		
		try {
			con = DatabaseUtils.openMySqlConnection();
			String query = "INSERT INTO `corso_java`.`libro` (`isbn`, `titolo`, `id_autore`, `costo`) VALUES (?, ?, ?, ?);";
			PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, l.getIsbn());
			stmt.setString(2, l.getTitolo());
			Autore au = l.getA();
			stmt.setLong(3, au.getId());
			stmt.setDouble(4, l.getCosto());
			U = stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
			System.out.println(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con != null)
				con.close();
			
		}
		
		
			
		
		
		return U;
	}
	
	
	
	
}
