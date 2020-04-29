package java6_05;

class Ex08 {

	int test1(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}

	int test2(int[] arr) {

		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				total += arr[i];
			}
		}
		return total;
	}

	int test3(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				count++;
			}
		}
		return count;
	}

	int test4(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;

	}

}

public class MethodEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex08 e = new Ex08();

		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) 전체 합 리턴
		// 정답 1) 362
		int total = e.test1(arr);
		System.out.println(total);
		// 문제 2) 4의 배수의 합 리턴
		// 정답 2) 264
		total = e.test2(arr);
		System.out.println(total);
		// 문제 3) 4의 배수의 개수 리턴
		// 정답 3) 3
		int count = e.test3(arr);
		System.out.println(count);
		// 문제 4) 짝수의 개수 리턴
		// 정답 4) 3
		count = e.test4(arr);
		System.out.println(count);
	}

}
