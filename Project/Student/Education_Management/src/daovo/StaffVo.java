package daovo;

public class StaffVo {
	private int id;
	private String name;
	private int enroll;
	
	public StaffVo() {
		
	}
	
	public StaffVo(int id, String name, int enroll) {
		this.id = id;
		this.name = name;
		this.enroll = enroll;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getEnroll() {
		return enroll;
	}
}
