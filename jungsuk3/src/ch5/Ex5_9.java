package ch5;

public class Ex5_9{
	public static void main(String[] args) {
		
		/*
		 * �� ������ �����쾾��
		 * �ڼ��ϰ� ������ �����س����� �����ľ��� Git�� ������
		 * �����ؼ� Ǯ��
		 * */
		
		char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'},
		};
		
		//Switch row and column
		char[][] result = new char[star[0].length][star.length];
		
		for(int i = 0;i<star.length;i++) {
			for(int j = 0;j<star[i].length;j++) {
				System.out.print(star[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i<star.length;i++) {
			for(int j = 0; j<star[i].length;j++) {
				result[j][3-i] =(star[i][j]);
			}
		}
		
		System.out.println("Result");
		for(int i = 0; i < result.length;i++) {
			for( int j = 0;j <result[i].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
