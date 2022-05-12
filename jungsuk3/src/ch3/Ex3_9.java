package ch3;

public class Ex3_9 {
	public static void main(String[] args) {
		//ch가 대,소문자 및 숫자인 경우에만 true
		
		char ch = '8';
		
		//유니코드상
		//65-90 : 대문자, 97-122 : 소문자, 48-57 : 숫자
		boolean b = (65 <= ch && ch <= 90) ? true
				: ((97 <= ch && ch <= 122) ? true : ((48 <= ch && ch <= 57) ? true : false));
		
		/* 유니코드의 10진수값이 아닌 character를 그대로 써서 하는 방법
		 * + 삼항연산자 푼 코드
		 * (어렵게 유니코드 굳이 쓸 필요 없음. 삼항 연산자도 마찬가지.
		 *  초반에는 익숙한 것을 사용하는게 오류가 덜 생김)
		 * 
		 * if('A' <= ch && ch <= 'Z'){ //대문자인가?
		 * 		boolean b = true;
		 * }else{
		 * 		if('a' <= ch && ch <= 'z'){ //소문자인가?
		 * 			boolean b = true;
		 * 		}else{
		 * 			if('0' <= ch && ch <= '9'){//숫자인가?
		 * 				boolean b = true;
		 * 			}else{//모든 것을 만족시키지 않을 경우
		 * 				boolean b = false;
		 * 			}
		 * 		}
		 * }
		 * 	
		 * */
		
		

		System.out.println(b);

	}
}
