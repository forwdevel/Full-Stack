package ch4;

public class Ex4_6 {
	public static void main(String[] args) {
		
		/* 두 주사위의 눈의 합이 6이 되는 경우
		 * 
		 * (i,j) 이 두가지의 변수를 쓴다고 가정할 경우
		 * 
		 * (1,5) => i=1, j=5
		 * (2,4) => i=2, j=4
		 * (3,3) => i=3, j=3
		 * (4,2) => i=4, j=2
		 * (5,1) => i=5, j=1
		 * 
		 * j는 6 - i로 대체 가능
		 * */
		
		
		for(int i = 1; i<6;i++) {
			System.out.println(i+"+"+(6-i));
		}
	}
}
