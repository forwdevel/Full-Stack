package ch5;

public class Ex5_5 {
	public static void main(String[] args) {
		
		/*	shuffle은 중요하므로 꼭 숙지해두고 익숙해지는게 중요
		 * 	
		 * 	shuffle의 핵심은 tmp(빈방)에 있음.
		 * 	배열이던 값이던 해당 타입의 원형!!을 씀.
		 * 	클래스면 기본 생성자로 선언!!!!(이해안가면 밑에 예시 보기)
		 * 	두 타입이 다르면 더 큰 타입!을 씀(값의 보존을 위해).
		 * 	
		 * 	객체면 레퍼런스값을 저장, 값이면 값을 저장
		 * 
		 * ex)
		 * int[]와 int[]의 shuffle
		 * 		=> int tmp;
		 * 
		 * double[]와 int[]의 shuffle
		 * 		=> 더 큰 타입인 double tmp;	
		 * 
		 * int와 int[]의 shuffle
		 * 		=> int tmp;
		 * 
		 * Student int[]와 Student int의 shuffle
		 * 		=> Student tmp = new Student();(기본 생성자!!! 주의)
		 * 
		 * */
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i = 0; i<ballArr.length;i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0; //shuffle용 tmp선언
			
			//Shuffle
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		for(int i=0;i<ball3.length;i++) {
			ball3[i] = ballArr[i];
		}
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]+" ");
		}
	}
}
