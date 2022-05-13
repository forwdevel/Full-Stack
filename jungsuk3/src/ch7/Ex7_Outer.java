package ch7;

class Outer {
	//Outer Field
	int value = 10;

	class Inner {
		//Inner Field
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(Inner.this.value);
			System.out.println(Outer.this.value);
		}
	}// Inner
}// Outer

public class Ex7_Outer {
	public static void main(String[] args) {
		//Declare a instance of outer class
		Outer outer = new Outer();

		//Declare a instance of inner class
		Outer.Inner inner = outer.new Inner();
		
		//Call a method of inner class
		inner.method1();
	}//main()
}// Main
