package ch5;

public class Ex5_8 {
	public static void main(String[] args) {
		
		/*
		 * �ּ������� Ǯ��
		 * 
		 * idea)
		 * 
		 * 1. answer�迭�� �ݺ������� �ϳ��ϳ� Ȯ��
		 * 
		 * 2. answer�� ���� ���� switch�� if������ ���� count[]�� ����
		 * 
		 * 3. counter�� ��� ���� �ݺ������� ���
		 * */
		
		
		
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];

		for (int i = 0; i < answer.length; i++) {
			if(answer[i]==1) {
				counter[0]++;
			}
			if(answer[i]==2) {
				counter[1]++;
			}
			if(answer[i]==3) {
				counter[2]++;
			}
			if(answer[i]==4) {
				counter[3]++;
			}
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.print((i+1)+": "+counter[i]);
			for(int j = 0; j <counter[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
