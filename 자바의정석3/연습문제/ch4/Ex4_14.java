package ch4;

import java.util.Scanner;

public class Ex4_14 {
	public static void main(String[] args) {
		/* Math.random()�𸣸� Ex4_7��
		 * while���� for�� ���� �𸣸� Ex4_5��
		 * 
		 * 1. answer�� Math.random()�Ἥ ���� ���� (1~100)
		 * 
		 * 2. do-while�� ���ű⶧���� input(�Է¹��� ��)�� count(���� �õ� Ƚ��)�� �ٱ��� ����
		 * (do-while�� ���� �Ǵ� ������ while�� �Ἥ �ص� ��, ���� ���̴� ���� ����)
		 * 
		 * 3. �Է¹����Ŵϱ� ��ĳ�ʼ���
		 * 
		 * 4. do-while�� ����
		 * count�� 0���� ���������� �������ڸ��� count 1�������ֱ�
		 * (�ȱ׷��� �߰��� ���缭 break�Ǹ� count�� �� �ö�)
		 * (count�� break�� �ڿ� ���� ������ 1�� �ʱ�ȭ�ϰ� ����)
		 * 
		 * 5. if(input == answer)��,
		 * �����̴ϱ� �ٷ� ����� �õ�Ƚ�� ��� ��, break; =>(while(input != answer))�� break �ʿ����(���ѷ���X)
		 * 
		 * 6. �ƴϸ� input���� answer�� ū�� ������ if������ �˻��ϰ�
		 * ��Ʈ ���,
		 * 
		 * 7. �ٽ� �ݺ� => while(input != answer) or while(true)
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
