package ch4;

public class Ex4_11 {
	public static void main(String[] args) {

		/*
		 * �Ǻ���ġ ����
		 * : ���� �� ���� ���ؼ� �������� ����
		 * 
		 * Tip)
		 * num3 = num1 + num2
		 * 
		 * �� ���� �ϳ��� �ݺ����� ������ �� �ֵ��� num1�� num2�� ���� ����!
		 * 
		 * �ݺ�!)
		 * num3 = num1 + num2
		 * num1 = num2 (num1�� ���� ���� ������ num2�� ����)
		 * num2 = num3 (num2�� ���� ���� ������ num3�� ����)
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
