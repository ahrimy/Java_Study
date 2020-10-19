package chapter02_03_interface;
//class, abstract, interface
//인터페이스 1)interface, 2)추상메서드만 만들수 있음
//다중상속 가능
interface A{
	public void test();
	public void test2();
}
class B implements A{
	@Override
	public void test(){
		
	}
	@Override 
	public void test2(){
		
	}
}
interface EE{
	public void test3();
}
interface CC{
	public void test1();
	public void test2();
}
class DD implements CC,EE{
	public void test1(){}
	public void test2(){}
	public void test3(){}
}
public class Test0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
