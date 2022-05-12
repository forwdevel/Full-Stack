package ch5;

public class Ex5_7 {
	public static void main(String[] args) {

		/*
		 * arg�� ���߿� DB�� �Բ� ����� ���� �и��� ������,
		 * ���� �ܰ迡�� �߿��ϴٰ� ���� �����,
		 * �켱������ ���� �ΰ� �ڵ� �Ƿ��� �ø� ���Ŀ� �����ϴ� ������...
		 * ������ �ڵ带 �ּ�ó�� �س����״� �ڽ������� ����!
		 */

		//���� �ڵ�
		//if (args.length != 1) {
		//	System.out.println("USAGE: java Exercise5_7 3120");
		//	System.exit(0);
		//}
		//
		//int money = Integer.parseInt(args[0]);

		
		// ��ü �ڵ�
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
			System.exit(0);//���α׷� �������� ��ɾ�
			//�ݺ����� ��� break;�� ���α׷� ���ᰡ ����ų�, �׳� �����ϰ� ���� �� ���
			//�����ϰ�, �⺻ �ڵ��̹Ƿ� ����.
			//0�� ���� ����, �ٸ� ���ڴ� ���� �޼����� �Ѹ�.
		}

		System.out.println("==Remaining Coins==");

		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + " KRW: " + coin[i]);
		}
	}
}
