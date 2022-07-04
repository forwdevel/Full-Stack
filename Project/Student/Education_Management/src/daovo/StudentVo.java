package daovo;

public class StudentVo {
	private int id;
	private String pw;
	private String name;
	private String college;
	private String major;
	private int grade;
	private int enroll;
	private int credit;
	
	public StudentVo() {
		
	}

	public StudentVo(int id, String pw, String name, String college, String major, int grade, int enroll, int credit) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.major = major;
		this.grade = grade;
		this.enroll = enroll;
		this.credit = credit;
		this.pw = pw;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

	public String getMajor() {
		return major;
	}

	public int getGrade() {
		return grade;
	}

	public int getEnroll() {
		return enroll;
	}

	public int getCredit() {
		return credit;
	}
	
	public String getPw() {
		return pw;
	}
}