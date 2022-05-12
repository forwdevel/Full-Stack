package ch4;

public class Ex4_12 {
	public static void main(String[] args) {
		//단순노가다라 해설 패스.
		//구구단 for문으로 돌릴 줄 알면 넘어가는게 좋음
		//나중에 시간남으면 하셈
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j <= 4; j++) {
				System.out.printf("%d*%d=%d\t", j, i + 1, j * (i + 1));
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 5; j <= 7; j++) {
				System.out.printf("%d*%d=%d\t", j, i + 1, j * (i + 1));
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 8; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t", j, i + 1, j * (i + 1));
			}
			System.out.println();
		}
	}
}
