package ch6;

public class Ex6_3to5 {
	public static void main(String[] args) {
		Student s = new Student("Hong gil-dong", 1, 1, 100, 60, 76);

		System.out.println(s.info());
	}//main()
}//Main

class Student {
	//클래스 필드(=클래스 변수)
	String name;	//이름
	int    ban;		//반
	int    no;			//학번
	int    kor;		//국어점수
	int    eng;		//영어점수
	int    math;		//수학점수

	//내가 생성한 생성자(디플트 생성자 사용불가)
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban  = ban;
		this.no   = no;
		this.kor  = kor;
		this.eng  = eng;
		this.math = math;
	}//Constructor(String, int, int, int, int, int)

	//객체 정보 출력
	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}//info()

	public int getTotal() {
		return kor + eng + math;
	}//getTotal()

	public float getAverage() {
		return (float) (int) (getTotal() * 10 / 3 + 1) / 10;
	}//getAverage()
}//Student
