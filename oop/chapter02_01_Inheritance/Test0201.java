package chapter02_01_Inheritance;
/*
 * ��� �ϴ� �� : 1)Ű���� extends 2)Ŭ������
 */
class A {
	int aa;
}

class B extends A{
	int bb;
}

class C {
	A a = new A(); //����� �ƴ����� ���ó�� ǥ��
	int cc;
}
/*
 * �θ��� �ڿ��� �ڽ��� ����ϴ� ��
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
