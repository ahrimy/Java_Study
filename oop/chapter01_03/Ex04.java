package chapter01_03;

class Test {
	static int x;
		   int y;
	
	void instanceMethod() {
		x = 10;
		y = 20;
		System.out.println("인스턴스 메서드 호출");
	}
	
	static void staticMethod() {
		x = 5;
		// static 메서드 안에서는
		// static 변수만 사용이 가능하다.
		// y = 6;
		System.out.println("클래스 메서드 호출");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		Test.staticMethod();
		
		Test t = new Test();
		t.instanceMethod();
		
	}
}








