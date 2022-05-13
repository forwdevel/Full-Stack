package ch7;

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}// Constructor

	Shape(Point p) {
		this.p = p;
	}// Constructor

	abstract double calcArea();

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}// Shape

class Point {
	int x, y;

	Point() {
		this(0, 0);
	}// Constructor

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}// Constructor

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}// Point

class Circle extends Shape {
	double r;

	public Circle(double r) {
		super();
		this.r = r;
	}// Constructor

	public Circle(int i, int j) {
		p.x = i;
		p.y = j;
		r = 1;
	}// Constructor

	@Override // Implement
	double calcArea() {
		return r * r * 3.141592;
	}

}// Circle

class Rectangle extends Shape {
	// Fields
	double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}// Constructor

	@Override // Implement
	double calcArea() {
		return width * height;
	}

	public boolean isSquare() {
		if (width > 0 && height > 0) {
			return true;
		}
		return false;
	}
}

public class Ex7_Shape {
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}// sumArea()

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5, 0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("Sum of Area: " + sumArea(arr));
	}// main()
}// Main
