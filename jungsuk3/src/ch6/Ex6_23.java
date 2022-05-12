package ch6;

public class Ex6_23 {
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		
		//java.util.Arrays.toString();
		//java.util 패키지에 기본적으로 포함되어있음.
		//배열의 정보를 출력
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("MAX: " + max(data));
		System.out.println("MAX: " + max(null));
		System.out.println("MAX: " + max(new int[] {}));
	}

	private static int max(int[] data) {
		if (data == null || data.length == 0)
			return -999999;//에러라고 알리기 위한 값, 특별한 의미는 없음, 내가 에러값이라고 알수만 있으면 됨
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
		}
		return max;
	}
}
