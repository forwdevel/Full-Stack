package ch3;

public class Ex3_10 {
	public static void main(String[] args) {
		
		/*
		 * Character Ÿ�� �����ϱ�
		 * char�� �����ڵ��� ���� �����ϰ� �ִ�.
		 * 
		 * => �츮�� ���� �ƴ� ���ڸ� �����ϰ� �ִ°� �ƴ� ���ڸ� �����ϰ� �ְ�,
		 *	  ��½ÿ� �̸� ��ȯ�ؼ� �����ش�. 'String���� char�� �迭'�̱� ������
		 * 	  ���ڸ� �����ϰ� �ִ°� �ƴ϶� '�� ���ھ�' �߶� '�����ڵ忡 �ش��ϴ� ���ڸ� ����'�Ѵ�.
		 * 
		 * ex) String str = "12345";		//�츮�� ���� �����ϴ� String�� ���ڿ��� ��������,
		 * 		=> char[] str = {'1','2','3','4','5'};  //char�� �迭�� �ѱ��ھ� ����Ǹ�,
		 * 		=> char[] str = {49, 50, 51, 52, 53};	//�����ڵ尪���� ġȯ�Ǿ� ����ȴ�.
		 * 
		 * Tip)�ƽ�Ű�ڵ带 �˻��� ���� ���鼭 �����غ���
		 * */
		
		char ch = 'A';
		
		char lowerCase = (65 <= ch && ch <= 90) ? (char) (ch + 32) : ch;
		
		/* ��ü �ڵ�
		 * ���׿����ڴ� �н��ϱ�
		 * 
		 * if(65 <= ch && ch <= 90){ //�빮�ڶ�� �ҹ��ڷ� ��ȯ
		 * 		char lowerCase = (char)(ch + 32);
		 * } else {	//�ҹ��ڶ�� �״��
		 * 		char lowerCase = ch;
		 * }
		 * */

		System.out.println("ch: " + ch);
		System.out.println("ch to lowerCase: " + lowerCase);
	}
}
