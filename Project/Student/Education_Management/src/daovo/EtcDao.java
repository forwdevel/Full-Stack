package daovo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ui.Alert;

public class EtcDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@112.154.60.127:1521/xe";
	String user = "c##user";
	String password = "oma0731";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	// Inquiry college & major
	public int inquiry(String college, String major) {
		try {
			connDB();
			
			String query = "select college from major where college = '" + college + "'";
		
			rs = stmt.executeQuery(query);
			System.out.println("college : " + query);
			rs.last();
			
			if(rs.getRow() == 0) {
				new Alert("존재하지 않는 단과입니다.");
				return -1;
			} else {
				query = "select * from major where college = '" + college + "' and major = '"+major+"'";
				
				rs = stmt.executeQuery(query);
				System.out.println("major : " + query);
				rs.last();
				
				if(rs.getRow() == 0) {
					new Alert("존재하지 않는 전공입니다.");
					return -2;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return -3;
		}
		
		return 0;
	}
	
	// Return major
	public String returnMajor(String major) {
		String result = "";
		try {
			connDB();
			
			String query = "select * from major where major = '" + major + "'";
			System.out.println("returnMajor SQL : " +query);
			rs = stmt.executeQuery(query);
			rs.last();
			
			System.out.println("getRow() : " + rs.getRow());
			
			if(rs.getRow() != 0) {
				result = rs.getString("id");
				System.out.println("result : " + result);
			}
		}catch (Exception e) {
			
		}
		return result;
	}
	
	public Object[][] interestInquery(String query) {
		try {
			connDB();
			rs = stmt.executeQuery(query);
			rs.last();
			int n = rs.getRow();
			System.out.println("row : " + n);
			int i = 0;
			
			Object[][] object = new Object[n][8];
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				object[i][0] = rs.getString("id");
				object[i][1] = rs.getString("com");
				object[i][2] = rs.getString("name");
				object[i][3] = rs.getString("professor");
				object[i][4] = rs.getInt("credit");
				object[i][5] = rs.getString("room");
				object[i][6] = rs.getString("limit");
				object[i][7] = rs.getString("current");
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}