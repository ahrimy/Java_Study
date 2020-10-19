package chapter02_01_Inheritance;

class Parent {
	// private String name;
	// private boolean gender;
	protected String name;
	protected boolean gender;

	public Parent() {
		// 현재 클래스의 다른 생성자 Parent(String name, boolean gender)를 실행한다.
		this("무명씨", true);
		System.out.println("부모 클래스의 기본 생성자 실행");
	}

	public Parent(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return name + "(" + (gender ? "남" : "여") + ")";
	}

}
// 자식(하위, 서브, 파생) 클래스
// 상속의 형식 : class 자식클래스이름 extends 부모클래스이름, 자바는 다중 상속을 지원하지 않는다.
// Child 클래스는 Parent 클래스를 상속받아 만든다.

public class Child extends Parent {
	private int age;
	private String nickName;

	public Child() {
		super();
		System.out.println("자식 클래스의 기본 생성자 실행");
	}

	// 부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이 protected일 경우 부모 클래스의 상속받은 멤버 변수에 자유롭게
	// 접근할 수 있으므로 this를 사용하는 초기화가 가능하다.
	public Child(String name, boolean gender, int age, String nickName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.nickName = nickName;
	}

	@Override
	public String toString() {

		return name + "(" + (gender ? "남" : "여") + ") - " + age + ", " + nickName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		System.out.println(parent);
		Parent parent2 = new Parent("성춘향", false);
		System.out.println(parent2);
		System.out.println("=====================================");

		// 자식 클래스의 생성자가 실행되기 전에 부모 클래스의 생성자가 먼저 실행된다.
		Child child = new Child();
		System.out.println(child);
		Child child2 = new Child("임꺽정", true, 42, "도적");
		System.out.println(child2);

	}

}
