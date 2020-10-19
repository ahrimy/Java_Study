package chapter02_01_Inheritance;

class Test2 extends Object{ //Object 는 모든 클래스가 상속받게 설계되어있다
	int a = 10;
	int b = 10;
	public String toString(){
		return "Test2";
	}
}

public class Test0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		System.out.println(t2);
	}

}
