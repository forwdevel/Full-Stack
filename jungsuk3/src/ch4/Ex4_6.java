package ch4;

public class Ex4_6 {
	public static void main(String[] args) {
		
		/* �� �ֻ����� ���� ���� 6�� �Ǵ� ���
		 * 
		 * (i,j) �� �ΰ����� ������ ���ٰ� ������ ���
		 * 
		 * (1,5) => i=1, j=5
		 * (2,4) => i=2, j=4
		 * (3,3) => i=3, j=3
		 * (4,2) => i=4, j=2
		 * (5,1) => i=5, j=1
		 * 
		 * j�� 6 - i�� ��ü ����
		 * */
		
		
		for(int i = 1; i<6;i++) {
			System.out.println(i+"+"+(6-i));
		}
	}
}
