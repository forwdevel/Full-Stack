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
	
	public StudentVo stu(String id_txt) {
		try {
			connDB();
			
			String query = "SELECT * FROM student ";
			query += "where id = '" + id_txt + "'";
			
			rs = stmt.executeQuery(query);
			System.out.println(query);
			rs.last();
			System.out.println(rs.getRow());
			
			if(rs.getRow() == 0) {
				System.out.println("0 row selected.....");
			} else {
				String id = rs.getString("id");
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
		
		return new StudentVo();
	}
	
	public boolean enroll_stu(int enroll, String name, String college, String major) {
		try {
			connDB();
			String id = "" + enroll;
			
			String query = "select * from student where major = '" +major + "' and enroll = " + enroll;
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("inqury SQL : " + query);
			System.out.println("row : " + rs.getRow());
			
			id += new EtcDao().returnMajor(major);
			
			if((rs.getRow() + 1) < 10) {
				id += "00" + (rs.getRow()+1);
			} else if((rs.getRow() + 1) < 100) {
				id += "0" + (rs.getRow()+1);
			} else if ((rs.getRow() + 1) < 1000) {
				id += (rs.getRow() + 1);
			} else {
				new Alert("�쟾怨듬떦 999紐낃퉴吏� �엯�젰�씠 媛��뒫�빀�땲�떎.");
				return false;
			}
			
			query = "insert into student values ("
					+ id + ", '" + name +"', '" + college + "', '" + major + "', " + 1 + ", " + enroll + ", " + 0 + ")";
			
			System.out.println("Query : " + query);
			rs = stmt.executeQuery(query);
			
			query = "insert into member values ("
					+ id + ", '" + name + "', '�븰�깮', '1234')";

			System.out.println("Query : " + query);
			rs = stmt.executeQuery(query);
			
		} catch (Exception e) {
			e.printStackTrace();
			new Alert("�빐�떦 �븰踰덉쓽 �븰�깮�씠 �씠誘� 議댁옱�빀�땲�떎.");
			return false;
		}
		
		return true;
	}
	
	public Object[][] allStudent() {
		try {
			connDB();
			
			String query = "select * from student order by id";
			rs = stmt.executeQuery(query);
			rs.last();
			
			int n = rs.getRow();
			int i = 0;
			
			Object[][] object = new Object[n][6];

			rs = stmt.executeQuery(query);
			while(rs.next()) {
				object[i][0] = rs.getString("id");
				object[i][1] = rs.getString("name");
				object[i][2] = rs.getString("college");
				object[i][3] = rs.getString("major");
				object[i][4] = rs.getInt("grade");
				object[i][5] = rs.getInt("enroll");
				i++;
			}
			
			return object;
		} catch (Exception e) {
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
