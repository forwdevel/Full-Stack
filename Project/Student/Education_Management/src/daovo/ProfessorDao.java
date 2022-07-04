package daovo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ui.Alert;

public class ProfessorDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@112.154.60.127:1521/xe";
	String user = "c##user";
	String password = "oma0731";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public ProfessorVo pro(int id_txt, String pw_txt) {
		try {
			connDB();
			
			String query = "SELECT * FROM PROFESSOR";
			query += "where id = '" + id_txt + " and pw = '" + pw_txt + "'";
			
			rs = stmt.executeQuery(query);
			rs.last();
			
			System.out.println(rs.getRow());
			
			if(rs.getRow() == 0) {
				// Empty
				System.out.println(":: Not Found ::");
			} else {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String college = rs.getString("college");
				String major = rs.getString("major");
				int enroll = rs.getInt("enroll");
				
				ProfessorVo data = new ProfessorVo(id, name, college, major, enroll);
				return data;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ProfessorVo();
	}
	
	public boolean enroll_pro(int id, String name, String college, String major, int enroll) {
		try {
			connDB();
			
			String query = "insert into professor values("+id + ", '"+name+"', '" + college + "', '"+major+"'," + enroll +",'1234')";
			rs = stmt.executeQuery(query);
			System.out.println("Insert Into Professor SQL : "+query);
			
			query = "insert into member values(" + id + ", '" + name +"', '"+ college + "', '"+ major +"', "+ enroll+ ", '1234')";
			rs = stmt.executeQuery(query);
			System.out.println("Insert Into Member SQL : "+query);
		} catch(Exception e) {
			new Alert("해당 교번의 교수가 이미 존재합니다.");
			e.printStackTrace();
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
			stmt = con.createStatement();
			System.out.println("statement create success.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
