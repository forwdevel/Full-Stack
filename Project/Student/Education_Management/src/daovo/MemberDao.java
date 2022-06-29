package daovo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "c##green";
	String password = "green1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public int list(MemberVo p) {
		try {
			connDB();
			
			String query = "SELECT * FROM MEMBER ";
			query += "where id = '" + p.getId() + "' and pw = '" + p.getPw() + "'";
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println(rs.getRow());
			
			if(rs.getRow() == 0) {
				System.out.println(":: Not Found ::");
			} else {
				String roll = rs.getString("roll");
				if(roll.equalsIgnoreCase("staff")) {
					//staff
					// 'LogIn' to 'Staff_Main'
					return 1;
				} else if(roll.equalsIgnoreCase("student")) {
					//student
					// 'LogIn' to 'Student_Main'
					return  2;
				} else if (roll.equalsIgnoreCase("professor")) {
					//professor
					// 'LogIn' to 'Professor_Main'
					return 3;
				}
				// Not Found
				// Print error message
				return 0;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
