package ch5;

public class Ex5_4 {
	public static void main(String[] args) {
		
		/* 주석패스 (너무 간단)
		 * 주석 패스한 문제들은 너무 단순하고, 앞의 문제를 이해했으면 그냥 풀수있는 문제
		 * */
		
		int[][] arr     = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int     total   = 0;
		float   average = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}

		average = (float) total / (arr.length * arr[0].length);

		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}
}
