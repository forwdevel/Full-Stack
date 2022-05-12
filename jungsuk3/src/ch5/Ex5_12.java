package ch5;

import java.util.Scanner;

public class Ex5_12 {
	public static void main(String[] args) {
		
		/*
		 * String의 특성 이해하기
		 * 
		 * String은 char의 배열로 이루어져있는 객체!
		 * 따라서, 글자가 아닌 레퍼런스값을 지니고있다. (직접 비교 불가능)
		 * 
		 * ex) String a = "123"; String b = "123";
		 * System.out.println(a == b); => false
		 * 
		 * 따라서, equals()라는 메소드를 써서 순수 값만을 비교할 수 있다.
		 * 
		 * 
		 * equals()메소드 사용법
		 * 
		 * => String객체이름.equals("비교하고자하는 문자열"이나 "String객체");
		 * => ex) a.equals(b); 또는 a.equas("123");
		 * 
		 * => 반환값은 boolean이다. (true or false)
		 * => ex) System.out.println(a.equals(b)); => true 출력
		 * */
		
		
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		
		System.out.print("Q1. What does 'chair' mean in korean? ");
		String answer = scanner.next();
		if(answer.equals("의자")) {
			System.out.println("Correct.");
			cnt++;
		}else {
			System.out.println("Wrong. The answer is 의자.");
		}
		
		System.out.print("\nQ2. What does 'computer' mean in korean? ");
		answer = scanner.next();
		if(answer.equals("컴퓨터")) {
			System.out.println("Correct.");
			cnt++;
		}else {
			System.out.println("Wrong. The answer is 컴퓨터.");
		}
		
		System.out.print("\nQ3. What does 'integer' mean in korean? ");
		answer = scanner.next();
		if(answer.equals("정수")) {
			System.out.println("Correct.");
			cnt++;
		}else {
			System.out.println("Wrong. The answer is 정수.");
		}
		
		System.out.println("\nYou got "+cnt+" out of 3 questions correct.");
		
		scanner.close();
	}
}
