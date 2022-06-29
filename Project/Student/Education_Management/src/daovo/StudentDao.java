package daovo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:orcale:thin:@localhost:1521/xe";
	String user = "c##green";
	String password = "green1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public StudentVo stu(int id_txt, String pw_txt) {
		try {
			connDB();
			
			String query = "SELECT * FROM STUDENT ";
			query += "where id = '" + id_txt + "' and pw = '" + pw_txt +"'";
			
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println(rs.getRow());
			
			if(rs.getRow() == 0) {
				System.out.println("0 row selected.....");
			} else {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String college = rs.getString("college");
				String major= rs.getString("major");
				int grade = rs.getInt("grade");
				int enroll = rs.getInt("enroll");
				int credit = rs.getInt("credit");
				
				StudentVo data = new StudentVo(id, name, college, major, grade, enroll, credit);
				return data;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement();
			System.out.println("statement create success.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
