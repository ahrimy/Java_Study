package chapter02_01_Inheritance;
/*
 * 상속 하는 법 : 1)키워드 extends 2)클래스명
 */
class A {
	int aa;
}

class B extends A{
	int bb;
}

class C {
	A a = new A(); //상속이 아니지만 상속처럼 표현
	int cc;
}
/*
 * 부모의 자원을 자식이 사용하는 것
 */
public class Test0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		b.aa = 10;
	}

}
