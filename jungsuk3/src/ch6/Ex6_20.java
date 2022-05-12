package ch6;

public class Ex6_20 {
	
	//앞서 언급했듯이 이 클래스에는 클래스 변수가 없고,
	//때문에 유동적 값을 다루지 않고, 지역변수만을 다루는 메소드는
	//static이어야만 한다.
	public static int[] shuffle(int[] arr) {
		int temp;
		int[] result = new int[arr.length];
		int index = (int)(Math.random()*9);
		
		//Copy => static이라 이곳에서 변환된 arr은 바깥에서도 변환된 값을 공유한다.
		//main메소드에서 값을 바꾸는 거랑 같은거임
		//C언어에서의 함수같은 존재
		for(int i = 0; i< arr.length;i++) {
			result[i] = arr[i];
		}
		
		//Shuffle
		for(int i = 0; i< result.length;i++) {
			temp = result[i];
			result[i] = result[index];
			result[index] = temp;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}//main()
}//Main
