package ch7;

public class Ex7_Robot {
	public static void action(Robot arr) {
		if (arr instanceof DanceRobot) {
			((DanceRobot) arr).dance();
		}
		if (arr instanceof SingRobot) {
			((SingRobot) arr).sing();
		}
		if (arr instanceof DrawRobot) {
			((DrawRobot) arr).draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}// main

}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("Dancing...");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("Singing...");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("Drawing...");
	}
}