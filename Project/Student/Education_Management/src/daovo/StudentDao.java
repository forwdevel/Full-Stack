package daovo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ui.Alert;

public class StudentDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@112.154.60.127:1521/xe";
	String user = "c##user";
	String password = "oma0731";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public StudentVo stu(int id_txt, String pw_txt) {
		try {
			connDB();
			
			String query = "SELECT * FROM student ";
			query += "where id = " + id_txt + " and pw = '" + pw_txt + "'";
			
			rs = stmt.executeQuery(query);
			System.out.println(query);
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
				String pw = rs.getString("pw");
				
				StudentVo data = new StudentVo(id, pw, name, college, major, grade, enroll, credit);
				return data;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return new StudentVo();
	}
	
	public boolean enroll_stu(int enroll, int id, String name, String college, String major) {
		// 정상작동
		try {
			connDB();
			
			String query = "insert into student values ("
					+ id + ", '" + name +"', '" + college + "', '" + major + "', " + 1 + ", " + enroll + ", " + 0 + ", '1234')";
			
			System.out.println("Query : " + query);
			rs = stmt.executeQuery(query);
			
			query = "insert into member values ("
					+ id + ", '" + name + "', '학생', '1234')";

			System.out.println("Query : " + query);
			rs = stmt.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
			new Alert("해당 학번의 학생이 이미 존재합니다.");
			return false;
		}
		
		return true;
	}
	
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
