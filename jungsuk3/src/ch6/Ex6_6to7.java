package ch6;

/*
 * 만약, 메소드 내부에, 클래스 필드가 단 하나도 존재하지 않는다면,
 * (객체마다 다른 값을 가지고 있는 아이들이)
 * 이 메소드는 static이여야함.
 * 
 * 유동성있는 값을 다루는게아니라, 그저 메인메소드 안에서 지역변수로만 이를 쓰고 반환할 것이라면,
 * 클래스틀과 하나가 되지 않을 이유가 전혀 없음.
 * static이면 메모리에서 이득이 있기 때문에!!
 * 
 * static이 아닌 메소드는 호출될때마다 새로 메모리에 올리고 반환해야 함
 * static이면, 클래스가 로딩될 때 함께 메모리를 할당받기 때문에, 이득이 있음.
 * 
 * 즉, 굳이 객체의 유동값을 다루는 것이 아니라,
 * 지역변수만을 다룰 것이라면, 객체 취급을 할 필요가 전혀 없음.
 * */

public class Ex6_6to7 {
	//Math.sqrt(); => 제곱근 반환(double)
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
	}//getDistance(int, int, int, int)

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}//main()
}//Main

class MyPoint {
	//클래스 필드
	int x;
	int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}//Constructor(int, int)

	double getDistance(int x1, int y1) { //static을 인스턴스로 변환
		return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
	}//getDistance(int, int)
}