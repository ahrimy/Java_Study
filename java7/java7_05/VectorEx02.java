package java7_05;

class MyList {
	//ArrayList 기능 구현
	int[] arr;
	int count;

	void print() {
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]);
			if (i != count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	void add(int value) {
		if (count == 0) {
			arr = new int[count + 1];
		} else if (count > 0) {
			int[] temp = arr;
			arr = new int[count + 1];

			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}

		arr[count] = value;
		count += 1;
	}

	void add(int index, int value) {
		if (count == 0) {
			arr = new int[count + 1];
		} else if (count > 0) {
			int[] temp = arr;
			arr = new int[count + 1];

			int j = 0;
			for (int i = 0; i < count + 1; i++) {
				if (i != index) {
					arr[i] = temp[j];
					j += 1;
				}
			}
			temp = null;
		}

		arr[index] = value;
		count += 1;
	}

	void remove(int index) {
		if (count == 1) {
			arr = null;
		} else if (count > 1) {
			int[] temp = arr;
			arr = new int[count - 1];

			int j = 0;
			for (int i = 0; i < count; i++) {
				if (i != index) {
					arr[j] = temp[i];
					j += 1;
				}
			}
			temp = null;
		}
		count -= 1;
	}

	int size() {
		return count;
	}

	int get(int index) {
		return arr[index];
	}

	void set(int index, int value) {
		arr[index] = value;
	}

	void clear() {
		arr = null;
		count = 0;
	}

}

public class VectorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList list = new MyList();

		// 추가하기
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		// 삽입하기
		list.add(0, 9);
		// 출력하기
		list.print();

		// (index로)삭제하기
		list.remove(3);
		list.print();

		// 길이 구하기
		int count = list.size();
		System.out.println("count = " + count);

		// (index로)값 꺼내오기
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(list.get(i));
			if (i != count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// 특정 위치의 값 수정하기
		list.set(3, 5);
		list.print();

		// 모든 데이터를 제거하기
		list.clear();
		System.out.println(list.size());

	}

}
