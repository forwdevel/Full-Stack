package ch3;

public class Ex3_5 {
	public static void main(String[] args) {
		int num = 777;
		System.out.println((num/10)*10+1);
		
		/* Tip) 3-4와 같은 방법을 1을 없애고 1을 더해줌
		 * 1. 10으로 나눠서 1의자리를 우선 버림
		 * 		=> num = num / 10;
		 * 		=> (num == 77)
		 * 2. 10을 곱해서 세자리수로 복구
		 * 		=> num = num * 10;
		 * 		=> (num == 770)
		 * 3. 2번 값에 1을 더해서 1의자리를 1로 변경
		 * 		=> num = num + 1;
		 * 		=> (num == 771);
		 * */
	}
}
