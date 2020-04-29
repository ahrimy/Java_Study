package java6_02;

class Ex02 {

	int x = 0;
	int y = 0;
	int[] arr = null;
	void test1(int x, int y) {
		this.x = x;
		this.y = y;
		int total = 0;
		for(int i=this.x;i<=this.y;i++){
			total+=i;
		}
		System.out.println(total);
	}

	void test2(int[] arr) {
		this.arr = arr;
		int max = 0;
		for (int i=0;i<this.arr.length;i++){
			if(this.arr[i]>max){
				max = this.arr[i];
			}
		}
		System.out.println(max);
	}

	void test3(int[] arr, int idx1, int idx2) {
		int id1 = idx1;
		int id2 = idx2;
		int temp = arr[id1];
		arr[id1] = arr[id2];
		arr[id2] = temp;
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		for(int i=0;i<this.arr.length;i++){
			System.out.print(" "+this.arr[i]);
		}
	}

}
public class MethodEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 e = new Ex02();

		// 문제 1) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.test1(x, y);

		// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
		int[] arr = { 87, 100, 35, 12, 46 };
		e.test2(arr);

		// 문제 3) arr배열을 전달받아 인덱스 2개를 입력받고, 해당 위치의 값을 교체하는 메서드
		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);

	}

}
