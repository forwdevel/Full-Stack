package ch5;

public class Ex5_11 {
	public static void main(String[] args) {
		
		/*	Tip	|		i=0		|		i=1		|		i=2		|		i=3
		 * ------------------------------------------------------------------------
		 *	j=0	|		100		|		100		|		100 	| (0,0)~(2,0)의 합
		 * 	j=1	|		20		|		20		|		20		| (0,1)~(2,1)의 합
		 *	j=2	|		30		|		30		|		30		| (0,2)~(2,2)의 합
		 *	j=3	|		40		|		40		|		40		| (0,3)~(2,3)의 합
		 *	j=4	|		50		|		50		|		50		| (0,4)~(2,4)의 합
		 *-------------------------------------------------------------------------
		 *	j=5	|(0,0)~(0,4)의 합|(1,0)~(1,4)의 합|(2,0)~(2,4)의 합|(3,0)~(3,4)의 합
		 * */
		
		int[][] score  = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j]                           = score[i][j];
				result[score.length][j]               += score[i][j];
				result[i][score[i].length]            += score[i][j];
				result[score.length][score[i].length] += score[i][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
}
