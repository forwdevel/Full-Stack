package ch7;

public class Ex7_Buyer {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	}// main
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {// Lack of money
			System.out.println("You cannot buy a \"" + p + "\"(Leck of money)");
			return;// Exit
		} else {// Enough money
			money -= p.price;// Subtract money
			add(p);// Add product
		}
	}// buy(Product p)

	void add(Product p) {
		if (i >= cart.length) {
			Product[] cart2 = new Product[cart.length * 2];
			// Array copy
			cart2[0] = cart[0];
			cart2[1] = cart[1];
			cart2[2] = cart[2];
			cart = cart2; // Array swap
		}
		cart[i++] = p;
	}// add(Product p)

	void summary() {
		int total = 0;
		// Print the Cart List
		System.out.println("==Purchase==");
		for (int j = 0; j < cart.length; j++) {
			System.out.println(cart[j].toString());
			total += cart[j].price;
		}
		System.out.println("\nTotal: " + total);
		System.out.println("Balance: " + money);
	}// summary()
}

class Product {
	int price;

	public Product(int price) {// Constructor
		this.price = price;
	}
}

class Tv extends Product {
	public Tv() {// Constructor
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	public Computer() {// Constructor
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	public Audio() {// Constructor
		super(50);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}