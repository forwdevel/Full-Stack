package ch5;

import java.util.Scanner;

public class Ex5_13 {
	public static void main(String[] args) {
		
		/*
		 *	shuffle과 Math.random()에 대해 이해하고 있다면 쉽게 풀 수 있는 문제
		 *	만약 알고리즘 자체의 아이디어가 안떠오른다면, shuffle과 Math.random() 다시보고오기
		 * */
		
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			char[] question = words[i].toCharArray();
			//Set a random index
			int index = (int)(Math.random()*words.length)+1;
			//Shuffle
			char temp = question[i];
			question[i] = question[index];
			question[index] = temp;
			
			System.out.printf("Q%d. Enter the answer (%s)>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.println("Correct\n");
			}else {
				System.out.println("Wrong\n");
			}
		}
		
		scanner.close();
	}
}
