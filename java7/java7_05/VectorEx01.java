package java7_05;

import java.util.ArrayList;

class MyVector {
	int arr[];
	int count = 0;

	//�迭 �߰�
	void add(int a) {
		if (count == 0) {
			arr = new int[1];
		} else {
			int[] temp = arr;
			arr = new int[count + 1];
			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
		}
		arr[count] = a;
		count += 1;
	}

	int size() {
		return count;
	}
	
	//�迭 ����
	void remove(int index) {
		int[] temp = arr;
		arr = new int[count - 1];
		for (int i = 0; i < index; i++) {
			arr[i] = temp[i];
		}
		for (int i = index; i < count - 1; i++) {
			arr[i] = temp[i + 1];
		}
		count -= 1;
	}
}

public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭
		int[] arr = new int[5];
		//����
		ArrayList<Integer> list = new ArrayList<>();

		// add(value) : ArrayList�� �� �ڿ� value�� �߰��Ѵ�.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		// add(index, value) : ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
		list.add(0, 9);
		System.out.println(list);

		// remove(index) : ArrayList�� index��° �����͸� �����Ѵ�.
		list.remove(3);
		System.out.println(list);

		// size() : ArrayList�� ����� �������� ������ ���´�.
		int count = list.size();
		System.out.println("count = " + count);

		// get() : ArrayList�� index��°�� value�� ���´�.
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(list.get(i));
			if (i != count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// set(index, value) : ArrayList�� index��° ��ġ�� value�� �����Ѵ�.
		list.set(3, 5);
		System.out.println(list);

		/*
		 * # ���� for�� 
		 * 1) �迭�̳� ArrayList ��ü �����͸� ������� �۾��� ��� ����Ѵ�. 
		 * 2) ���� for(�ڷ��� ������ : �迭 or ArrayList){ �ݺ��� ����; }
		 */

		// list�� 0��° ���� num�� ������ �� �ݺ��� �����ϸ�
		// list�� ������ ���� num�� ������ �� �ݺ��� ���� ����ȴ�.
		for (int num : list) {
			System.out.print(num+" ");
		}
		System.out.println();
		// clear() : ArrayList�� ��� �����͸� �����Ѵ�.
		list.clear();
		System.out.println(list.size());

	}

}
