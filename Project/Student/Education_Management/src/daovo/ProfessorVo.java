package daovo;

public class ProfessorVo {
	private int id;
	private String name;
	private String college;
	private String major;
	private int enroll;
	
	public ProfessorVo() {
		
	}

	public ProfessorVo(int id, String name, String college, String major, int enroll) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.major = major;
		this.enroll = enroll;
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

	public int getEnroll() {
		return enroll;
	}
	
	
}
