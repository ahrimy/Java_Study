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

		// ���� 1) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		e.test1(x, y);

		// ���� 2) arr�迭�� ���޹޾� �ִ밪�� ����ϴ� �޼���
		int[] arr = { 87, 100, 35, 12, 46 };
		e.test2(arr);

		// ���� 3) arr�迭�� ���޹޾� �ε��� 2���� �Է¹ް�, �ش� ��ġ�� ���� ��ü�ϴ� �޼���
		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);

	}

}
