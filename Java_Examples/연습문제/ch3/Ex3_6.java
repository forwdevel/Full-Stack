package ch3;

public class Ex3_6 {
	public static void main(String[] args) {
		int num = 34;
		System.out.println((num/10+1)*10 - num);
		
		/* Tip)
		 * 1. num���� ū 10�� ����� ã������ 1���ڸ� ����
		 * 		=> int ten = num / 10;
		 * 2. ten�� 1�� ���ؼ� ������ num���� ū 10�� ����� 10�� �ڸ� �����
		 * 		=> ten = ten + 1;
		 * 3. ten�� 10�� ���ؼ� 10�� ��� �����
		 * 		=> ten = ten * 10;
		 * 4. 10�� ���(ten)���� num���� ���� ten���
		 * 		=> ten = ten - num
		 * */
	}
}
