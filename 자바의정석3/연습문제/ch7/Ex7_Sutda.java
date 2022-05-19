package ch7;

public class Ex7_Sutda {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();

		System.out.println("==Deck==");
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ((i == deck.cards.length - 1) ? "" : ", "));
		}
		System.out.println("\nPick (0): "+deck.pick(0));
		System.out.println("Pick (random): "+deck.pick());
		System.out.println("\n==Shuffle..==");
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ((i == deck.cards.length - 1) ? "" : ", "));
		}
		
		System.out.println("\nPick (0): "+deck.pick(0));
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < CARD_NUM / 2; i++) {
			cards[i] = new SutdaCard(i + 1, false);
		}
		for (int i = 10; i < CARD_NUM; i++) {
			if (i % 10 + 1 == 1 || i % 10 + 1 == 3 || i % 10 + 1 == 8) {
				cards[i] = new SutdaCard(i % 10 + 1, true);
			} else {
				cards[i] = new SutdaCard(i % 10 + 1, false);
			}
		}
	}

	public void shuffle() {
		SutdaCard temp = new SutdaCard();
		for (int i = 0; i < CARD_NUM; i++) {
			int index = (int) (Math.random() * CARD_NUM);
			temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}

	public SutdaCard pick(int index) {
		return cards[index];
	}

	public SutdaCard pick() {
		return cards[(int) (Math.random() * CARD_NUM)];
	}

}// SutdaDeck

class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
