package ch3;

public class Ex3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;//ȭ�� 100��

		//float�� ĳ�����ؼ� 5/9�� int�� ���Ǿ� 0�� �Ǵ� ���� ����
		float temp = (float) 5 / 9 * (fahrenheit - 32);

		float celcius = (temp >= 5) ? (float) (int) (temp * 100 + 1) / 100
		        : (float) (int) (temp * 100) / 100;
		
		/*
		 * ���׿����� ������� ���� �ڵ� + ��Ƽ ĳ���� Ǯ����� �ڵ�
		 * 
		 * if(temp >=5) {//�ݿø�
		 * //1. �Ҽ� ����¥�� ���ϱ� ���� 100���ϰ� int�� ĳ�����ؼ� ������ ������ 1�� ���ؼ� '�ݿø�'
		 * float celcius = (int) (temp * 100 + 1);
		 * 
		 * //2. �Ҽ� ��°�ڸ��� �ٽ� ����� ���� 100���� ����
		 * // (float ĳ���þ��ϸ� int�� ���Ǽ� �Ҽ��� ���� �� ���ư�)
		 * celcius = (float) celcius / 100;
		 * 
		 * } else {//�ݳ���
		 * 
		 * //1. �Ҽ� ����¥�� ���ϱ� ���� 100���ϰ� int�� ĳ�����ؼ� ������ ����
		 * float celcius = (int) (temp * 100);
		 * 
		 * //2. �Ҽ� ��°�ڸ��� �ٽ� ����� ���� 100���� ����
		 * // (float ĳ���þ��ϸ� int�� ���Ǽ� �Ҽ��� ���� �� ���ư�)
		 * celcius = (float) celcius / 100;
		 * float celcius = (float) (int) (temp * 100) / 100;
		 * }
		 */

		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}
