package ch4;

public class Ex4_15 {
	public static void main(String[] args) {
		
		/*	�ռ� �ߴ� �� �ڸ����� ���� ���ϴ� ������ �������
		 * 
		 * 	�ּ��� ���� Ǯ���
		 * 
		 * Tip)
		 * 1. number�� result�� ������ ���Ұű� ������ tmp�� number���� ����
		 * 
		 * 2. result���� ��� tmp�� 1�� �ڸ��� ���� �� 10�� ���ϰ� �� 1�� �ڸ��� ���Ұ���
		 * 		=> ex) num= 12345 => result = 54321
		 * 
		 * 3. number == result�� ���ٸ�, number�� ȸ������� �� �� �ִ�.
		 * 
		 * 
		 * Ǯ��)
		 * 
		 * 1)
		 * result = result * 10; (���ϱ����� �ϴ� ���ؼ� ���� �ڸ��� �������� �ʰ� �ϱ�)
		 * 
		 * result = result + tmp % 10;
		 * 		result == 1;
		 * 
		 * tmp = tmp / 10;
		 * 		tmp = 1232;
		 * 
		 * 2)
		 * result = result * 10;
		 * 		result == 10;
		 * 
		 * result = result + tmp % 10;
		 * 		result == 12;
		 * 
		 * tmp = tmp / 10;
		 * 		tmp = 123;
		 * 		  
		 * 3)
		 * result = result * 10;
		 * 		result == 120;
		 * 
		 * result = result + tmp % 10;
		 * 		result == 123;
		 * 
		 * tmp = tmp / 10;
		 * 		tmp = 12;
		 * 
		 * 		  
		 * 4)
		 * result = result * 10;
		 * 		result == 1230;
		 * 
		 * result = result + tmp % 10;
		 * 		result == 1232;
		 * 
		 * tmp = tmp / 10;
		 * 		tmp = 1;
		 * 
		 * 		  
		 * 5)
		 * result = result * 10;
		 * 		result == 12320;
		 * 
		 * result = result + tmp % 10;
		 * 		result == 12321;
		 * 
		 * tmp = tmp / 10;
		 * 		tmp = 0;
		 * 
		 * 4) �ݺ��� ����
		 * */
		
		
		
		int number = 12321;
		int tmp = number;

		int result = 0;

		while (tmp != 0) {
			result *= 10;
			result += tmp % 10;
			System.out.println(result);
			tmp /= 10;
		}
		if (number == result) {
			System.out.println(number + " is a palindromic number.");
		} else {
			System.out.println(number + " is not a palindromic number");
		}
	}
}
