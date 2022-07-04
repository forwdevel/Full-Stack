package daovo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StaffDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "c##green";
	String password = "green1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public StaffVo stf(int id_txt, String pw_txt) {
		try {
			connDB();
			
			String query = "SELECT * FROM STAFF ";
			query += "where id = '" + id_txt + "' and pw = '" + pw_txt  + "'";
			
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println(rs.getRow());
			
			if(rs.getRow() == 0) {
				System.out.println("0 row selected......");
			} else {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int enroll = rs.getInt("enroll");
				
				StaffVo vo = new StaffVo(id, name, enroll);
				return vo;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new StaffVo();
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement();
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
