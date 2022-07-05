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
	
	public boolean enroll_pro(String name, String college, String major, int enroll) {
		try {
			String id = "";
			connDB();
			
			String query = "select * from professor where major = '" + major +"'";
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("inquiry SQL : " + query);
			System.out.println(major + "'s professor : " + rs.getRow());
			
			id = new EtcDao().returnMajor(major);
			
			if((rs.getRow() + 1) < 10) {
				id += "0" + (rs.getRow() + 1);
			} else if (rs.getRow() < 100){
				id += (rs.getRow() + 1);
			} else {
				new Alert("전공당 99명까지 입력이 가능합니다.");
				return false;
			}
			
			query = "insert into professor values("+id + ", '"+name+"', '" + college + "', '"+major+"'," + enroll +",'1234')";
			
			rs = stmt.executeQuery(query);
			System.out.println("Insert Into Professor SQL : "+query);
			
			query = "insert into member values(" + id + ", '" + name +"', '교수', '1234')";
			
			rs = stmt.executeQuery(query);
			System.out.println("Insert Into Member SQL : "+query);
		
		} catch(Exception e) {
			new Alert("해당 교번의 교수가 이미 존재합니다.");
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public Object[][] allProfessor() {
		try {
			connDB();
			
			String query = "select * from professor";
			System.out.println("\nSQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			
			int n = rs.getRow();
			int i = 0;
			
			Object[][] object = new Object[n][4];
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				object[i][0] = rs.getString("id");
				object[i][1] = rs.getString("name");
				object[i][2] = rs.getString("college");
				object[i][3] = rs.getString("major");
				i++;
			}
			
			return object;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Object[][] temp = {};
		return temp;
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
