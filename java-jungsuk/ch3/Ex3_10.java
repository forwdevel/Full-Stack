package ch3;

public class Ex3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (65<=ch&&ch<=90) ? (char)(ch+32): ch;
		
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase: "+lowerCase);
	}
}
