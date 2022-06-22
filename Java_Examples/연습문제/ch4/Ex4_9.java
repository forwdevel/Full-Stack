package ch4;

public class Ex4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int    sum = 0;

		/*
		 * charAt(index)�Լ�
		 * : String�� ��ü(�ڹٿ����� �迭�� ��ü!, String�� char�� �迭�� char[]��)
		 * : String Ŭ������ �����ִ� �޼ҵ� (ex. toString(), equals())
		 * : index��°�� ���ڸ� charŸ������ ��ȯ�� �� (String�� char�迭�� �����ϸ� ���ذ� ����(index�� 0���� ����))
		 * 
		 * ex) String str = "12345";
		 * str.charAt(0) == '1';
		 * str.charAt(1) == '2';
		 * str.charAt(2) == '3';
		 * str.charAt(3) == '4';
		 * str.charAt(4) == '5';
		 */

		for (int i = 0; i < str.length(); i++) {
			//���� 48�� �ƽ�Ű�ڵ尪���� 0��, �̰��� ���� ���� integer������ ������ֱ�
			/*	ex) char '0' == int 48
			 * 		=> (char '0' - 48) == int 0
			 * 
			 * �̰� ������ �Ʒ� �ڵ带
			 * sum += (str.charAt(i) - '0');
			 * 
			 * �̷��� �ٲ㵵 ����
			 * */
			sum += (str.charAt(i) - 48);
		}

		System.out.println("sum = " + sum);
	}
}
