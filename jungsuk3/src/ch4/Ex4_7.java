package ch4;

public class Ex4_7 {
	public static void main(String[] args) {
		
		/* MathŬ������ random()�޼ҵ��� ���� (double�� => �Ҽ��� �� ���� ���� => (int)ĳ���� �ϴ� ����)
		 * 		: (0.0 <= Math.randon() < 1.0)
		 * 
		 * Tip) n���� m���� ������ ��������(int) �����
		 * 
		 * 1. (0.0 <= Math.random() * (m - n) < (m - n))
		 * 2. (n <= (Math.random() * (m - n)) + n + 1< m + 1)
		 * 		=> (int)((Math.random * (m - n)) + n + 1)
		 * 
		 * */
		
		int value = (int) (Math.random() * 6) + 1; // 1-6

		System.out.println("value: " + value);
	}
}
