package java7_01;

class Card {
	static int width = 120;
	static int height = 300;
	int num;
	String shape;
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Card.width);
		Card c = new Card();
		Card c1 = new Card();

		Card[] arr = new Card[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = new Card();
		}
		arr[1].width = 200;
		System.out.println(Card.width);
		arr[2].width = 300;
		System.out.println(Card.width);
	}

}
