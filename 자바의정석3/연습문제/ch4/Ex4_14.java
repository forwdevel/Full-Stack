package ch4;

import java.util.Scanner;

public class Ex4_14 {
	public static void main(String[] args) {
		/* Math.random()모르면 Ex4_7로
		 * while문과 for문 차이 모르면 Ex4_5로
		 * 
		 * 1. answer에 Math.random()써서 범위 설정 (1~100)
		 * 
		 * 2. do-while문 쓸거기때문에 input(입력받을 값)과 count(게임 시도 횟수)는 바깥에 선언
		 * (do-while문 몰라도 되니 어려우면 while문 써서 해도 됨, 둘의 차이는 거의 없음)
		 * 
		 * 3. 입력받을거니까 스캐너선언
		 * 
		 * 4. do-while문 시작
		 * count가 0으로 시작했으니 시작하자마자 count 1증가해주기
		 * (안그러면 중간에 맞춰서 break되면 count가 안 올라감)
		 * (count를 break문 뒤에 쓰고 싶으면 1로 초기화하고 시작)
		 * 
		 * 5. if(input == answer)면,
		 * 정답이니까 바로 정답과 시도횟수 출력 후, break; =>(while(input != answer))면 break 필요없음(무한루프X)
		 * 
		 * 6. 아니면 input보다 answer가 큰지 작은지 if문으로 검사하고
		 * 힌트 출력,
		 * 
		 * 7. 다시 반복 => while(input != answer) or while(true)
		 * */
		
		
		
		
		int answer = (int)(Math.random()*100)+1; //1-100
		int input = 0;
		int count = 0;	
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("Enter the value(1-100): ");
			input = scanner.nextInt();
			
			if(input==answer) {
				System.out.println("Correct!!");
				System.out.print("Count: "+count);
				break;
			}else if(input>answer){
				System.out.println("Down!");
			}else {
				System.out.println("Up!");
			}
		}while(true);
		
		scanner.close();
	}
}
