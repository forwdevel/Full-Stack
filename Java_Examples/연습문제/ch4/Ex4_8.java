package ch4;

public class Ex4_8 {
	public static void main(String[] args) {
		for (int x = 0; x <= 10; x++) {// x�� �������� �����ϴ� ����
			for (int y = 0; y <= 10; y++) {// y�� �������� �����ϴ� ����
				if (2 * x + 4 * y == 10) { //�ظ� ������ ��
					System.out.println("x="+x+", y="+y);
				}
			}
		}
	}
}
