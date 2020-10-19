package chapter02_03_interface;
class Point {
	int x, y;
	public void move() { }
}

class Shape {
//	final을 멤버 변수 선언시 앞에 붙여주면 그 변수는 프로그램에서 값을 변경시킬 수 없다. ==> 상수
//	final을 메소드 선언시 앞에 붙여주면 그 메소드는 override 시킬 수 없다.
//	final을 클래스 선언시 앞에 붙여주면 그 클래스는 상속시킬 수 없다.
	public static final double PI = 3.141592;	// 정적 멤버, 상수
	public void draw() { }
	public void erase() { }
}

//	자바는 다중 상속을 지원하지 않기 때문에 에러가 발생된다.
//	class Line extends Point, Shape { }			// 에러 발생

//	인터페이스는 무조건 정적(static) 멤버 변수(상수)와 추상 메소드로만 구성된 클래스의 특별한 형태이다.
interface Draw {
	public static final double PI = 3.141592;	// 정적 멤버, 상수
//	인터페이스는 변수 선언시 앞의 내용을 생략하면 public static final을 컴파일러가 자동으로 붙여준다.
	int LIMIT = 1000;
	public abstract void move1();	// 추상 메소드
//	인터페이스는 메소드 선언시 앞의 내용을 생략하면 public abstract을 컴파일러가 자동으로 붙여준다.
	void erase();
//	인터페이스에 {} 블록을 가지는 일반 메소드를 선언하면 에러가 발생된다.	
//	void erase() { }				// 일반 메소드
}

interface Graphic {
	void resize();
	void rotate();
}

//	클래스는 인터페이스를 상속받을 수 없기 때문에 에러가 발생된다.
//	class Line extends Graphic { }			// 에러 발생

//	인터페이스는 클래스를 상속받을 수 없기 때문에 에러가 발생된다.
//	interface Graphics extends Shape { }	// 에러 발생

//	클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속시킬 수 있다.
//	클래스는 다중 상속을 허용하지 않지만 인터페이스는 다중 상속을 허용한다.
interface Graphics extends Draw, Graphic {
//	아무런 내용을 가지지 않는 인터페이스를 표시(marker) 인터페이스라 부른다.
}

//	Line 클래스는 Point 클래스를 상속받고 Draw, Graphic 인터페이스를 구현받아 만든다.
//	클래스에서 인터페이스를 상속받는 효과를 내려면 extends 예약어를 사용하지 않고 implements 예약어를 사용하며
//	상속이라 부르지 않고 구현이라 부른다.
class Line extends Point implements Draw, Graphic {

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move1() {
		// TODO Auto-generated method stub
//		static 멤버 변수는 객체를 선언하지 않고 클래스 이름에 "."을 찍어서 바로 접근할 수 있다.
		System.out.println(Shape.PI);
//		final 변수(상수)의 값을 프로그램에서 변경하려 했으므로 에러가 발생된다.
//		Shape.PI = 1.23456;			// 에러 발생
		System.out.println(Math.PI);
		
		System.out.println(Draw.PI);
		System.out.println(Draw.LIMIT);

	}
	
}

public class Test0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l = new Line();
		l.move1();
	}

}
