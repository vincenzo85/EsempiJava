package it.esempi.db;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import it.esempi.db.model.Autore;

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
	
}
