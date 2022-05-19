package ch3;

public class Ex3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;//화씨 100도

		//float로 캐스팅해서 5/9가 int로 계산되어 0이 되는 것을 방지
		float temp = (float) 5 / 9 * (fahrenheit - 32);

		float celcius = (temp >= 5) ? (float) (int) (temp * 100 + 1) / 100
		        : (float) (int) (temp * 100) / 100;
		
		/*
		 * 삼항연산자 사용하지 않은 코드 + 멀티 캐스팅 풀어놓은 코드
		 * 
		 * if(temp >=5) {//반올림
		 * //1. 소수 둘재짜리 구하기 위해 100곱하고 int로 캐스팅해서 나머지 날리고 1을 더해서 '반올림'
		 * float celcius = (int) (temp * 100 + 1);
		 * 
		 * //2. 소수 둘째자리로 다시 만들기 위해 100으로 나눔
		 * // (float 캐스팅안하면 int로 계산되서 소수점 이하 다 날아감)
		 * celcius = (float) celcius / 100;
		 * 
		 * } else {//반내림
		 * 
		 * //1. 소수 둘재짜리 구하기 위해 100곱하고 int로 캐스팅해서 나머지 날림
		 * float celcius = (int) (temp * 100);
		 * 
		 * //2. 소수 둘째자리로 다시 만들기 위해 100으로 나눔
		 * // (float 캐스팅안하면 int로 계산되서 소수점 이하 다 날아감)
		 * celcius = (float) celcius / 100;
		 * float celcius = (float) (int) (temp * 100) / 100;
		 * }
		 */

		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}
