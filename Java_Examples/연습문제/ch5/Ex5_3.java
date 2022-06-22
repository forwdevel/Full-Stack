package ch5;

public class Ex5_3 {
	public static void main(String[] args) {
		
		/* 배열은 객체!
		 * 
		 * 예를들어 배열 arr이 있을 때
		 * System.out.println(arr);
		 * 이렇게 하면, 배열안에 저장된 값이 출력되는게아니라, 주소가 출력됨
		 * arr@~~~~~
		 * 
		 * 때문에 값을 얻고 싶을때는
		 * arr[index]를 사용
		 * 
		 * */
		
		
		int[] arr = { 10, 20, 30, 40, 50 };
		int   sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
	}
}
