package ch5;

public class Ex5_8 {
	public static void main(String[] args) {
		
		/*
		 * 주석만보고 풀기
		 * 
		 * idea)
		 * 
		 * 1. answer배열을 반복문으로 하나하나 확인
		 * 
		 * 2. answer가 가진 값을 switch나 if문으로 각각 count[]에 저장
		 * 
		 * 3. counter의 모든 값을 반복문으로 출력
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
