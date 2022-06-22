package ch3;

public class Ex3_8 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		int c = a + b;

		char ch = 'A';
		ch = (char) (ch + 2); // Down-Casting

		float f = 3 / 2;
		long l = 3000 * 3000 * 3000L; // Up-Casting

		float f2 = 0.1f;
		double d = 0.1;

		boolean result = (float) d == f2; // Down-Casting

		System.out.println("c = " + c);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result = " + result);
	}
}
