package ch3;

public class Ex3_10 {
	public static void main(String[] args) {
		
		/*
		 * Character 타입 이해하기
		 * char은 유니코드의 값을 저장하고 있다.
		 * 
		 * => 우리가 흔히 아는 문자를 저장하고 있는게 아닌 숫자를 저장하고 있고,
		 *	  출력시에 이를 변환해서 보여준다. 'String또한 char의 배열'이기 때문에
		 * 	  문자를 저장하고 있는게 아니라 '한 글자씩' 잘라서 '유니코드에 해당하는 숫자를 저장'한다.
		 * 
		 * ex) String str = "12345";		//우리가 흔히 생각하는 String은 문자열로 보이지만,
		 * 		=> char[] str = {'1','2','3','4','5'};  //char의 배열로 한글자씩 저장되며,
		 * 		=> char[] str = {49, 50, 51, 52, 53};	//유니코드값으로 치환되어 저장된다.
		 * 
		 * Tip)아스키코드를 검색해 직접 보면서 이해해보기
		 * */
		
		char ch = 'A';
		
		char lowerCase = (65 <= ch && ch <= 90) ? (char) (ch + 32) : ch;
		
		/* 대체 코드
		 * 삼항연산자는 패스하기
		 * 
		 * if(65 <= ch && ch <= 90){ //대문자라면 소문자로 변환
		 * 		char lowerCase = (char)(ch + 32);
		 * } else {	//소문자라면 그대로
		 * 		char lowerCase = ch;
		 * }
		 * */

		System.out.println("ch: " + ch);
		System.out.println("ch to lowerCase: " + lowerCase);
	}
}
