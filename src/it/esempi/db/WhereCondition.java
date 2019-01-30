package it.esempi.db;

public class WhereCondition {
	
	String q0="select * from libro ";
	String titolo = "";
	boolean were = false;
	String isbn = "";
	
	public void niente() {
	
	if (titolo != null) {
		q0 += "where titolo =?";
		were = true;
	}
	if (isbn != null) {
		if (were) {
			q0 += "and isb =?";
			were = true;
		}
	}
	}
	

}
