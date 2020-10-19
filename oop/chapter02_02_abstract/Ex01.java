package chapter02_02_abstract;
class A{
	int a;
	void test(){
		
	}
}
class B extends A{
	int b;
}
abstract class C{
	int c;
	abstract void test();
}
class D extends C{
	int d;
	void test(){ //강제로 만들어야 하는 메서드
		
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
