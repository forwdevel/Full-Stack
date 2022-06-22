package ch4;

public class Ex4_10 {
	public static void main(String[] args) {
		/*
		 * sum은 1의 자리를 하나씩 더해나가가고
		 * num은 10씩 나눠서 1의자리를 변동을 줌
		 * 
		 * 1) 
		 * sum = sum + num % 10;
		 * 		=> sum = 0 + 5 => sum == 5
		 * 
		 * num = num / 10;
		 * 		=> num == 1234;
		 *
		 * 2)
		 * sum = sum + num % 10;
		 * 		=> sum = 5 + 4 => sum == 9
		 * 
		 * num = num / 10;
		 * 		=> num == 123;
		 *
		 * 3)
		 * sum = sum + num % 10;
		 * 		=> sum = 9 + 3 => sum == 12
		 * 
		 * num = num / 10;
		 * 		=> num == 12;		 
		 * 
		 * 4)
		 * sum = sum + num % 10;
		 * 		=> sum = 12 + 2 => sum == 14
		 * 
		 * num = num / 10;
		 * 		=> num == 1;		
		 *  
		 * 5)
		 * sum = sum + num % 10;
		 * 		=> sum = 14 + 1 => sum == 15
		 * 
		 * num = num / 10;
		 * 		=> num == 0;
		 */
		
		int num = 12345;
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			sum += num%10;
			num/=10;
		}
		System.out.println("sum = " + sum);
	}
}
