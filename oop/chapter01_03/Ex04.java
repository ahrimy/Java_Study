package chapter01_03;

class Test {
	static int x;
		   int y;
	
	void instanceMethod() {
		x = 10;
		y = 20;
		System.out.println("�ν��Ͻ� �޼��� ȣ��");
	}
	
	static void staticMethod() {
		x = 5;
		// static �޼��� �ȿ�����
		// static ������ ����� �����ϴ�.
		// y = 6;
		System.out.println("Ŭ���� �޼��� ȣ��");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		
		Test.staticMethod();
		
		Test t = new Test();
		t.instanceMethod();
		
	}
}








