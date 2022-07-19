import java.util.*;

public class Main {
	
	public static void printResult(Student a, Student b) {
		System.out.println(a.getName() + " " + a.getKor() + " " + a.getEng());
		System.out.println(b.getName() + " " + b.getKor() + " " + b.getEng());
		System.out.println("avg " + a.getAvg() + " " + b.getAvg());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student[] student = new Student[2];
		
		for(int i = 0; i <2; i ++) {
			String name = scanner.next();
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			student[i] = new Student(name, kor, eng);
		}
		
		scanner.close();
		
		printResult(student[0],student[1]);
	}
}

class Student {
	private String name;
	private int kor;
	private int eng;
	private int avg;
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (int)(kor + eng) / 2;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setAvg() {
		avg = (int)(kor + eng) / 2;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getAvg() {
		return avg;
	}
}
