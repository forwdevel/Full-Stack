package ch5;

public class Ex5_10 {
	public static void main(String[] args) {
		
		/*
		 * char의 기본적인 이해를 위한 문제.
		 * => 'char의 모든 값은 2 byte(16-bit)의 10진수, 2진수, 8신수, 16진수값으로 대체가 가능하다' 
		 * => 즉!!!! 숫자를 통한 연산이 가능하다!
		 * 
		 * 이해를 위해 10진수값이 아닌, char값을 적어놓음
		 * (인간의 상식으로 접근하면 영원히 이해못함 => 인간에게 0은 0이지 48이아님)
		 * 아스키 코드표를 인터넷에서 찾아보고 이해해보기
		 * */
		
		
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };

		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123";
		String result = "";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if ('0' <= ch && ch <= '9') {// Number
				result += numCode[ch % '0'];
			} else {
				result += abcCode[ch % 'a'];
			}

		}

		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}
}
