package ch4;

public class Ex4_7 {
	public static void main(String[] args) {
		
		/* Math클래스의 random()메소드의 범위 (double형 => 소수점 개 많이 나옴 => (int)캐스팅 하는 이유)
		 * 		: (0.0 <= Math.randon() < 1.0)
		 * 
		 * Tip) n부터 m까지 범위의 랜덤숫자(int) 만들기
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
