package ch5;

public class Ex5_5 {
	public static void main(String[] args) {
		
		/*	shuffle�� �߿��ϹǷ� �� �����صΰ� �ͼ������°� �߿�
		 * 	
		 * 	shuffle�� �ٽ��� tmp(���)�� ����.
		 * 	�迭�̴� ���̴� �ش� Ÿ���� ����!!�� ��.
		 * 	Ŭ������ �⺻ �����ڷ� ����!!!!(���ؾȰ��� �ؿ� ���� ����)
		 * 	�� Ÿ���� �ٸ��� �� ū Ÿ��!�� ��(���� ������ ����).
		 * 	
		 * 	��ü�� ���۷������� ����, ���̸� ���� ����
		 * 
		 * ex)
		 * int[]�� int[]�� shuffle
		 * 		=> int tmp;
		 * 
		 * double[]�� int[]�� shuffle
		 * 		=> �� ū Ÿ���� double tmp;	
		 * 
		 * int�� int[]�� shuffle
		 * 		=> int tmp;
		 * 
		 * Student int[]�� Student int�� shuffle
		 * 		=> Student tmp = new Student();(�⺻ ������!!! ����)
		 * 
		 * */
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i = 0; i<ballArr.length;i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0; //shuffle�� tmp����
			
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
