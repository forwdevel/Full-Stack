package ch5;

public class Ex5_6 {
	public static void main(String[] args) {
		
		/*
		 * 앞의 문제 다 이해했으면 너무 간단한 문제
		 * */
		
		int[] coinUnit = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money = "+money);
		
		for(int i = 0; i< coinUnit.length;i++) {
			if(money/ coinUnit[i]>0) {
				System.out.println(coinUnit[i]+"Coin : "+money/coinUnit[i]);
				money %= coinUnit[i];
			}
		}
	}
}
