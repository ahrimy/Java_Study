package java6_03;

class Ex04 {
	void test1(int x) {
		x = 100;
	}

	int test2() {
		int x = 100;
		return x;
	}

	void test3(int[] arr) {
		arr[1] = 77;
	}
}

public class MethodEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 e = new Ex04();

		int x = 7;
		// x의 값을 100으로 변경시켜주는 메서드
		System.out.println("x = " + x);
		e.test1(x);
		System.out.println("x = " + x);

		System.out.println();

		x = e.test2();
		System.out.println("x = " + x);

		// ---------------------------------------

		int[] arr = { 10, 20, 30, 40, 50 };
		e.test3(arr);

		System.out.println(arr[1]);

	}

}
