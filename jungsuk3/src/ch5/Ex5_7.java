package ch5;

public class Ex5_7 {
	public static void main(String[] args) {

		/*
		 * arg는 나중에 DB와 함께 사용할 일이 분명히 있지만,
		 * 지금 단계에선 중요하다고 보기 어려움,
		 * 우선순위를 낮게 두고 코딩 실력이 늘면 추후에 도전하는 것으로...
		 * 원래의 코드를 주석처리 해놓을테니 자신있으면 도전!
		 */

		//원래 코드
		//if (args.length != 1) {
		//	System.out.println("USAGE: java Exercise5_7 3120");
		//	System.exit(0);
		//}
		//
		//int money = Integer.parseInt(args[0]);

		
		// 대체 코드
		int money = 3170;

		System.out.println("money = " + money);

		int[] coinUnit = { 500, 100, 50, 10 };
		int[] coin     = { 5, 5, 5, 5 };

		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;

			coinNum = money / coinUnit[i];
			if (coin[i] - coinNum < 0) {
				coin[i] = 0;
				coinNum = 5;
			}
			else {
				coin[i] -= coinNum;
			}

			money -= coinNum * coinUnit[i];

			System.out.println(coinUnit[i] + " KRW: " + coinNum);
		}

		if (money > 0) {
			System.out.println("Not enough change.");
			System.exit(0);//프로그램 강제종료 명령어
			//반복문이 없어서 break;로 프로그램 종료가 힘들거나, 그냥 종료하고 싶을 때 사용
			//유용하고, 기본 코드이므로 숙지.
			//0은 정상 종료, 다른 숫자는 오류 메세지를 뿌림.
		}

		System.out.println("==Remaining Coins==");

		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + " KRW: " + coin[i]);
		}
	}
}
