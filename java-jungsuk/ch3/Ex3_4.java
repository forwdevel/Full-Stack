package ch3;

public class Ex3_4 {
	public static void main(String[] args) {
		int num = 456;
		System.out.println((num/100)*100);
		
		/* Tip) ���� �ڸ� ���ϴ� ���� ���̹Ƿ�,
		 * 
		 * 1. 100���� ������ ���� �ڸ��� ����
		 * 		=> num = num / 100;
		 * 		=> (num == 4)
		 * 
		 * �� �Ŀ� 100�� ����
		 * 		=> num = num * 100;
		 * 		=> (num == 400)
		 * */
	}
}
