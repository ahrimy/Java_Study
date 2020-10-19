package chapter02_02_abstract;

abstract class Product {
	public abstract void kindOf();
}

class Camera extends Product {
	@Override
	public void kindOf() {

	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스는 객체를 만들어 사용할 수 없으므로 에러가 발생된다.
		// Product product = new Product();

	}

}
