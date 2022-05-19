package ch4;

public class Ex4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int    sum = 0;

		/*
		 * charAt(index)함수
		 * : String은 객체(자바에서는 배열에 객체!, String은 char의 배열인 char[]임)
		 * : String 클래스에 속해있는 메소드 (ex. toString(), equals())
		 * : index번째의 문자를 char타입으로 변환해 줌 (String을 char배열로 생각하면 이해가 쉬움(index는 0부터 시작))
		 * 
		 * ex) String str = "12345";
		 * str.charAt(0) == '1';
		 * str.charAt(1) == '2';
		 * str.charAt(2) == '3';
		 * str.charAt(3) == '4';
		 * str.charAt(4) == '5';
		 */

		for (int i = 0; i < str.length(); i++) {
			//숫자 48은 아스키코드값으로 0임, 이것을 빼서 순수 integer값으로 만들어주기
			/*	ex) char '0' == int 48
			 * 		=> (char '0' - 48) == int 0
			 * 
			 * 이게 어려우면 아래 코드를
			 * sum += (str.charAt(i) - '0');
			 * 
			 * 이렇게 바꿔도 무관
			 * */
			sum += (str.charAt(i) - 48);
		}

		System.out.println("sum = " + sum);
	}
}
