package chapter02_02_abstract;

class Base {
	String name;

	public void say() {
		System.out.println(name + "님 안녕하세요");
	}
}

class Sub extends Base {
	int age;

	@Override
	public void say() {
		System.out.println(name + "님은 " + age + "살 입니다.");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모 클래스 타입으로 부모 클래스 객체를 만들어 사용했으므로 정상적으로 처리된다.
		Base base = new Base();
		base.name = "홍길동";
		base.say();

		// 자식 클래스 타입으로 자식 클래스 객체를 만들어 사용했으므로 정상적으로 처리된다.
		Sub sub = new Sub();
		sub.name = "임꺽정";
		sub.age = 35;
		sub.say();

		// 부모가 자식을 제어할 수 있지만 자식이 부모를 제어할 수 없다.
		// 부모 클래스 타입에 자식 클래스 타입의 객체가 생성된 주소를 대입했으므로 정상적으로 처리된다.
		// Base b = new Sub();
		// 자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입했으므로 에러가 발생된다.
		// Sub s = new Base();

		// 부모 클래스 타입에 자식 클래스 타입의 객체가 생성된 주소를 대입한다. ==> upcasting
		Base b = sub;
		// 부모 클래스 타입에 자식 클래스 타입의 객체가 생성된 주소를 대입했으므로 부모 클래스의 say() 메소드가 아닌
		// 자식 클래스의 say() 메소드가 실행된다. ==> C++에서는 부모 클래스의 say() 함수가 실행되므로 자식 클래스의
		// say() 함수를 실행하기 위해서는 부모 클래스의 say() 함수를 virtual 예약어를 사용해 가상 함수로 만들어야
		// 했다.
		// 이것이 같은 메소드가 서로 다른 클래스에서 다양하게 실행되는 다형성의 기초가 된다.
		b.say();

		// 자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입한다. ==> downcasting
		// 자식 클래스 타입에 부모 클래스 타입의 객체가 생성된 주소를 대입하면 에러가 발생되는데 이 때, casting을 하면
		// 대입은 가능하다. ==> 문법적인 에러는 발생되지 않지만 실행시켰을 때 ClassCastException가 발생된다.
		// Sub s = (Sub) base;

		// instanceof 연산자를 사용하면 객체끼리 정상적으로 형변환이 가능한가 여부를 판단할 수 있다.
		if (base instanceof Sub) {
			Sub s = (Sub) base;
		} else {
			System.out.println("base 객체를 Sub 클래스 타입으로 형변환 시킬 수 없습니다.");
		}

		try {
			Sub s = (Sub) base;
		} catch (ClassCastException e) {
			System.out.println("base 객체를 Sub 클래스 타입으로 형변환 시킬 수 없습니다.");
		}

	}

}
