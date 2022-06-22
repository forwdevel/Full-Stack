package ch6;

public class Ex6_22 {
	public static boolean isNumber(String str) {
		//String.isEmpty()는 해당 String이 비었는지 아닌지 확인하고 boolean값을 반환
		
		//str == null이라는 이야기는, 주소를 가지고 있지 않다는 이야기. 초기화가 필요한 상태.
		//ex) String str;
		//system.out.printLn(str); => error!
		//=> 초기화도 안했기때문에 기본적인 주소도 없음. 부동산으로 따지면, 무허가 + 무신고 주택임.
		//은근 많이하는 실수이니 주의!
		
		if(str == null || str.isEmpty()) {
			return false;
		}//값이 비었다면
		for(int i = 0;i<str.length();i++) {
			//숫자가 아니면
			if(str.charAt(i)<'0'||str.charAt(i)>'9') {
				return false;
			}
		}
		//return을 만나면 break;처럼 바로 중단하고 나머지 안돌고 나가버림
		//이거 모르고 실수하는 사람 은근 많으니 주의.
		//의도적으로 더 돌게하고싶거나, 메모리 낭비없이 짧게만 돌게하고 싶을 때 위치가 중요
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println("are "+ str + " numbers? "+isNumber(str));
		
		str = "1234o";
		System.out.println("are "+ str + " numbers? "+isNumber(str));
	}
}
