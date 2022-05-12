package ch3;

public class Ex3_4 {
	public static void main(String[] args) {
		int num = 456;
		System.out.println((num/100)*100);
		
		/* Tip) 백의 자리 이하는 버릴 것이므로,
		 * 
		 * 1. 100으로 나눠서 백의 자리만 남김
		 * 		=> num = num / 100;
		 * 		=> (num == 4)
		 * 
		 * 그 후에 100을 곱함
		 * 		=> num = num * 100;
		 * 		=> (num == 400)
		 * */
	}
}
