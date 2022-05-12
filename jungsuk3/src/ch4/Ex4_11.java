package ch4;

public class Ex4_11 {
	public static void main(String[] args) {

		/*
		 * 피보나치 수열
		 * : 앞의 두 수를 더해서 다음수를 만듦
		 * 
		 * Tip)
		 * num3 = num1 + num2
		 * 
		 * 이 수식 하나로 반복문을 수행할 수 있도록 num1과 num2의 값을 변동!
		 * 
		 * 반복!)
		 * num3 = num1 + num2
		 * num1 = num2 (num1을 그의 다음 수였던 num2로 변동)
		 * num2 = num3 (num2를 그의 다음 수였던 num3로 변동)
		 * 
		 */

		int num1 = 1;
		int num2 = 1;

		int num3 = 0;// 3rd value

		System.out.print(num1 + ", " + num2);

		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
