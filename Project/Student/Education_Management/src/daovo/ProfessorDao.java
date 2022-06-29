package daovo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProfessorDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "c##green";
	String password = "green1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public ProfessorVo pro(int id_txt, String pw_txt) {
		try {
			connDB();
			
			String query = "SELECT * FROM PROFESSOR";
			query += "where id = '" + id_txt + " and pw = '" + pw_txt + "'";
			
			
		} catch (Exception e) {
			
		}
	}
}
