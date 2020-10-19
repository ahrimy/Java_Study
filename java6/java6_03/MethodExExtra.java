package java6_03;

class Return {
	int result;
	int arr[];

	void plus(int a, int b) {
		result = a + b;
	}

	void copyArr(int arr[]) {
		this.arr = arr;
		this.arr[0] = 100;
	}

	int rePlus(int a, int b) {
		return a + b;
	}

	int[] reArr() {
		arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 100;
		}

		return arr;
	}
}

public class MethodExExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return r = new Return();
		r.plus(10, 3);
		System.out.println(r.result);

		int result = r.rePlus(10, 3);
		System.out.println(result);

		System.out.println("=======================");
		int arr[] = { 10, 20, 30, 40 };
		r.copyArr(arr);
		for (int i = 0; i < r.arr.length; i++) {
			System.out.print(r.arr[i] + " ");
		}
		System.out.println();

		int arr2[] = r.reArr();
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
