package java6_12;
class Card{
	static int width  = 150;
	static int height = 300;
	
	int number;
	String shape;
}

public class ClassEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		c1.number = 4;
		c1.shape = "heart";
		
		Card c2 = new Card();
		c2.number = 7;
		c2.shape = "spade";
		
		c1.width = 300;
		c1.height = 150;
		
		System.out.println(Card.width);		// 300
		System.out.println(Card.height);	// 150
	

        System.out.println(c1.width);		// 300
		System.out.println(c1.height);	// 150

        System.out.println(c2.width);		// 300
		System.out.println(c2.height);	// 150
		
		System.out.println(c1.number);
		System.out.println(c2.number);

	}

}
