package java6_03;

class Ex05 {
	int count = 0;

	int test1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				this.count++;
			}
		}
		return this.count;
	}

	int[] test2(int[] arr) {
		int[] temp = new int[this.count];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[idx] = arr[i];
				idx++;
			}

		}
		return temp;
	}
}

public class MethodEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex05 e = new Ex05();

		int[] arr = { 87, 12, 21, 56, 100 };

		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
		int count = e.test1(arr);
		System.out.println(count);
		// 문제 2) 4의 배수만 배열 타입으로 리턴해주는 메서드
		int[] temp = e.test2(arr);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(" " + temp[i]);
		}
		System.out.println();

	}

}
