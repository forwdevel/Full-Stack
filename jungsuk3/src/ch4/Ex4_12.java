package ch4;

public class Ex4_12 {
	public static void main(String[] args) {
		//�ܼ��밡�ٶ� �ؼ� �н�.
		//������ for������ ���� �� �˸� �Ѿ�°� ����
		//���߿� �ð������� �ϼ�
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
