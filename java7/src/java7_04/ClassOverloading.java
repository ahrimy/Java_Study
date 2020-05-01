package java7_04;

class Mobile {
	String name;
	int price;
	String maker;

	void init() {
		name = "";
		price = 0;
		maker = "";
	}

	void init(String na, int pr, String ma) {
		name = na;
		price = pr;
		maker = ma;
	}

	void init(String na, int pr) {
		name = na;
		price = pr;
		maker = "";
	}

	void init(String na, String ma) {
		name = na;
		maker = ma;
		price = 0;
	}

	void init(int pr, String na) {
		price = pr;
		name = na;
		maker = "";
	}
}

public class ClassOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		m.init();
		m.init("아이폰", 1000, "애플");
		m.init("아이폰", 1000);

	}

}
