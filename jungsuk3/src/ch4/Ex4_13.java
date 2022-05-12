package ch4;

public class Ex4_13 {
	public static void main(String[] args) {
		
		/*
		 * 주석만 보고 풀어보고 안되면 아래 코딩을 보고 점검
		 * 안되는거 백날 붙들어봐야 안늘고 하기만 싫어지니까 아래 코딩보고도
		 * 이해 안가면 다른 문제로 넘어가고 나중에 다시 풀어보기
		 * 
		 * 해당 프로그램은 나중에 비밀번호 프로그램같은거 만들 때 쓸수있으므로,
		 * 점검하고 넘어가는게 좋음.
		 * 
		 * charAt(index)로 value.length만큼 돌려서 하나하나 다 검사해보고,
		 * char값이 숫자면, isNumber가 true를 반환,
		 * char값이 숫자의 범위내에 없다면 isNumber는 false를 반환
		 * 
		 */
		
		
		
		String value = "123t5";
		char ch = ' ';
		boolean isNumber = true;

		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			if ('1' <= ch && ch <= '9') {
				isNumber = true;
			} else {
				isNumber = false;
				break;//안해주면 마지막 charAt(5)가 숫자라 true반환, 하나라도 숫자가 아닌게 있으면 바로 루프 끊어버리기
			}
		}

		if (isNumber) {
			System.out.println(value + " are numbers");
		} else {
			System.out.println(value + " are not numbers");
		}
	}
}
