package ch3;

public class Ex3_5 {
	public static void main(String[] args) {
		int num = 777;
		System.out.println((num/10)*10+1);
		
		/* Tip) 3-4�� ���� ����� 1�� ���ְ� 1�� ������
		 * 1. 10���� ������ 1���ڸ��� �켱 ����
		 * 		=> num = num / 10;
		 * 		=> (num == 77)
		 * 2. 10�� ���ؼ� ���ڸ����� ����
		 * 		=> num = num * 10;
		 * 		=> (num == 770)
		 * 3. 2�� ���� 1�� ���ؼ� 1���ڸ��� 1�� ����
		 * 		=> num = num + 1;
		 * 		=> (num == 771);
		 * */
	}
}
