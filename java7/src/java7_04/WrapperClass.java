package java7_04;
class MyInteger {
	int a;

	MyInteger(int a) {
		this.a = a;
	}
}

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer i = new Integer(10);
		
		float b = 10.1f;
		Float f = new Float(10.1);

		double d = 10.1;
		Double dd = new Double(10.11);
		
		MyInteger ii = new MyInteger(100);

	}

}
