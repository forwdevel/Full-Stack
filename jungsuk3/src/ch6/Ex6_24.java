package ch6;

public class Ex6_24 {
	public static int abs(int value) {
		if (value < 0)// ����
			return -value;
		return value;// ���
	}

	public static void main(String[] args) {

		int value = 5;
		System.out.println(value + "'s abs: " + abs(value));

		value = -10;
		System.out.println(value + "'s abs: " + abs(value));
	}
}
