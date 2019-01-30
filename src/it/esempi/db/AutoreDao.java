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

public class AutoreDao {
	
	
	public List<Autore> findAll( ){
		
	List<Autore> retList = null;
	
		Connection connection = null;
		
		// 2 apro la connessione;
		
		try {
			connection = DatabaseUtils.openMySqlConnection();
			Statement stmt = connection.createStatement();	
			String sql = "select id, nome, cognome, version from autore";
			ResultSet rs = stmt.executeQuery(sql);
			retList = new ArrayList<>();
		
		while(rs.next()) {
			System.out.println(rs);
			Autore au = new Autore();
			au.setId(rs.getInt("id"));
			au.setNome(rs.getString("nome"));
			au.setCognome(rs.getString("cognome"));
			retList.add(au);
					
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return retList;
	}
	
	
	// SELECT * FROM corso_java.autore where id=1
	
public Autore findById(Long id) throws SQLException {
		
		Autore retAutore = null;
		Connection con = null;
		
		try {
			con = DatabaseUtils.openMySqlConnection();
			String query = "SELECT id, nome, cognome FROM corso_java.autore where id=?";
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			
			// while è inutile if è meglio ... c'è ne solo uno
			
			if(rs.next()) {
				retAutore = new Autore();
				
				
				retAutore.setId(rs.getInt("id"));
				retAutore.setCognome(rs.getString("cognome"));
				retAutore.setNome(rs.getString("nome"));
				
				
			}else {
				/* LANCIA ECCEZIONE */
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			con.close();
		}
		
		return retAutore;
		
		
	}
	
}
