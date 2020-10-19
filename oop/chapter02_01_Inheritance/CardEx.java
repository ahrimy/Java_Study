package chapter02_01_Inheritance;

public class CardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game game = new Game();
		while (game.d.CARD_NUM > 0) {
			game.pickCard();
			game.compare();
			game.result();

		}
		game.gameResult();
	}

}

class Player {
	Card[] my = new Card[2];

	int score = 0;
	int cnt = 0;

	void caculate() {
		if (my[0].number == my[1].number) {
			score = 26;
		} else {
			score = my[0].number + my[1].number;
		}

	}
}

class Game {
	Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다.

	Player p1 = new Player();
	Player p2 = new Player();
	int win = 0;

	void pickCard() {
		d.shuffle();
		p1.my[0] = d.pick(0);
		p2.my[0] = d.pick(0);
		p1.my[1] = d.pick(0);
		p2.my[1] = d.pick(0);
	}

	void compare() {
		p1.caculate();
		p2.caculate();
		if (p1.score == 26 && p2.score == 26) {
			if (p1.my[0].number > p2.my[0].number) {
				win = 1;
				p1.cnt++;
			} else if (p1.my[0].number < p2.my[0].number) {
				win = 2;
				p2.cnt++;
			} else {
				win = 0;
			}
		} else {
			if (p1.score > p2.score) {
				win = 1;
				p1.cnt++;
			} else if (p1.score < p2.score) {
				win = 2;
				p2.cnt++;
			} else {
				win = 0;
			}
		}
	}

	void result() {
		System.out.println("[P1] "+p1.my[0]+" / "+p1.my[1]);
		System.out.println("[P2] "+p2.my[0]+" / "+p2.my[1]);
		if (win == 0) {
			System.out.println("Draw");
		} else {
			System.out.println("Player" + win + " is win");
		}
	}

	void gameResult() {
		System.out.println("[[RESULT]]");
		System.out.println(p1.cnt + " , " + p2.cnt);
		if (p1.cnt > p2.cnt) {
			System.out.println("Player1 is win");
		} else if (p1.cnt < p2.cnt) {
			System.out.println("Player2 is win");
		} else {

			System.out.println("Draw");
		}
	}
}

class Deck {
	int CARD_NUM = 52;
	Card c[] = new Card[CARD_NUM];

	Deck() {
		int i = 0;

		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 1; n < Card.NUM_MAX + 1; n++) {
				c[i++] = new Card(k, n);
			}
		}
	}

	Card pick(int index) { // 지정된 위치(index)에 있는 카드 하나를 선택한다.
		if (0 <= index && index < CARD_NUM) {
			CARD_NUM--;
			Card t = c[0];
			Card temp[] = new Card[CARD_NUM];
			for (int i = 0; i < CARD_NUM; i++) {
				temp[i] = c[i + 1];
			}
			c = temp;
			return t;
		} else

		{
			return

			pick();
		}

	}

	Card pick() { // Deck에서 카드 하나를 선택한다.
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() { // 카드의 순서를 섞는다.
		for (int n = 0; n < 1000; n++) {
			int i = (int) (Math.random() * CARD_NUM);
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
	}

}

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String kind = "";
		String number = "";

		switch (this.kind) {
		case 4:
			kind = "SPADE";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		case 2:
			kind = "HEART";
			break;
		case 1:
			kind = "CLOVER";
			break;
		default:
		}

		switch (this.number) {
		case 13:
			number = "K";
			break;
		case 12:
			number = "Q";
			break;
		case 11:
			number = "J";
			break;
		default:
			number = this.number + "";
		}
		return "kind : " + kind + ", number : " + number;
	}

}