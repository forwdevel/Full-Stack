package daovo;

public class MemberVo {
	private int id;
	private String name;
	private String pw;
	private String roll;
	
	public MemberVo() {
		
	}
	
	public MemberVo(int id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRoll() {
		return roll;
	}

	public String getPw() {
		return pw;
	}
	
}
