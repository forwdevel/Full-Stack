package ch6;

/*
 * ����, �޼ҵ� ���ο�, Ŭ���� �ʵ尡 �� �ϳ��� �������� �ʴ´ٸ�,
 * (��ü���� �ٸ� ���� ������ �ִ� ���̵���)
 * �� �޼ҵ�� static�̿�����.
 * 
 * �������ִ� ���� �ٷ�°Ծƴ϶�, ���� ���θ޼ҵ� �ȿ��� ���������θ� �̸� ���� ��ȯ�� ���̶��,
 * Ŭ����Ʋ�� �ϳ��� ���� ���� ������ ���� ����.
 * static�̸� �޸𸮿��� �̵��� �ֱ� ������!!
 * 
 * static�� �ƴ� �޼ҵ�� ȣ��ɶ����� ���� �޸𸮿� �ø��� ��ȯ�ؾ� ��
 * static�̸�, Ŭ������ �ε��� �� �Բ� �޸𸮸� �Ҵ�ޱ� ������, �̵��� ����.
 * 
 * ��, ���� ��ü�� �������� �ٷ�� ���� �ƴ϶�,
 * ������������ �ٷ� ���̶��, ��ü ����� �� �ʿ䰡 ���� ����.
 * */

public class Ex6_6to7 {
	//Math.sqrt(); => ������ ��ȯ(double)
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
	}//getDistance(int, int, int, int)

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}//main()
}//Main

class MyPoint {
	//Ŭ���� �ʵ�
	int x;
	int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}//Constructor(int, int)

	double getDistance(int x1, int y1) { //static�� �ν��Ͻ��� ��ȯ
		return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
	}//getDistance(int, int)
}