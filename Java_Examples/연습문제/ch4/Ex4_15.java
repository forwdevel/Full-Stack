package ch4;

public class Ex4_15 {
	public static void main(String[] args) {
		
		/*	앞서 했던 각 자리수의 합을 구하는 문제의 응용버전
		 * 
		 * 	주석만 보고 풀어보기
		 * 
		 * Tip)
		 * 1. number와 result가 같은지 비교할거기 때문에 tmp에 number값을 복사
		 * 
		 * 2. result에는 계속 tmp의 1의 자리를 더한 후 10을 곱하고 또 1의 자리를 더할거임
		 * 		=> ex) num= 12345 => result = 54321
		 * 
		 * 3. number == result가 같다면, number는 회문수라고 할 수 있다.
		 * 
		 * 
		 * 풀이)
		 * 
		 * 1)
		 * result = result * 10; (더하기전에 일단 곱해서 일의 자리가 합쳐지지 않게 하기)
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
		 * 4) 반복문 종료
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
