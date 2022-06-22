package ch4;

public class Ex4_8 {
	public static void main(String[] args) {
		for (int x = 0; x <= 10; x++) {// x가 범위내에 존재하는 동안
			for (int y = 0; y <= 10; y++) {// y가 범위내에 존재하는 동안
				if (2 * x + 4 * y == 10) { //해를 만족할 때
					System.out.println("x="+x+", y="+y);
				}
			}
		}
	}
}
