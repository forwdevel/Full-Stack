package ch3;

public class Ex3_3 {
	public static void main(String[] args) {
		int num = 10;
		System.out.println((num == 0) ? "0" : ((num > 0) ? "Positive" : "negative"));
		
		/*
		 * 삼항 연산자
		 * (조건문) ? (if: 조건문이 참일 경우 수행 될 문장) : (else: 조건문이 거짓일 경우 수행 될 문장)
		 */
		
//		위의 삼항연산자와 동일 코드
//		if(num == 0) {
//			System.out.println("0");
//		} else {
//			if(num > 0) {
//				System.out.println("양수입니다.");
//			}else {
//				System.out.println("음수입니다.");
//			}
//		}
	}
}
