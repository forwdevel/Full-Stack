package ch3;

public class Ex3_6 {
	public static void main(String[] args) {
		int num = 34;
		System.out.println((num/10+1)*10 - num);
		
		/* Tip)
		 * 1. num보다 큰 10의 배수를 찾기위해 1의자리 버림
		 * 		=> int ten = num / 10;
		 * 2. ten에 1을 더해서 원래의 num보다 큰 10의 배수의 10의 자리 만들기
		 * 		=> ten = ten + 1;
		 * 3. ten에 10을 곱해서 10의 배수 만들기
		 * 		=> ten = ten * 10;
		 * 4. 10의 배수(ten)에서 num값을 빼고 ten출력
		 * 		=> ten = ten - num
		 * */
	}
}
