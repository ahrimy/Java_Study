package java7_05;

import java.util.ArrayList;

class MyVector {
	int arr[];
	int count = 0;

	//배열 추가
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
	
	//배열 삭제
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
		//배열
		int[] arr = new int[5];
		//벡터
		ArrayList<Integer> list = new ArrayList<>();

		// add(value) : ArrayList의 맨 뒤에 value를 추가한다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		// add(index, value) : ArrayList의 index번째 위치에 value를 삽입한다.
		list.add(0, 9);
		System.out.println(list);

		// remove(index) : ArrayList의 index번째 데이터를 제거한다.
		list.remove(3);
		System.out.println(list);

		// size() : ArrayList에 저장된 데이터의 개수를 얻어온다.
		int count = list.size();
		System.out.println("count = " + count);

		// get() : ArrayList의 index번째의 value를 얻어온다.
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(list.get(i));
			if (i != count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// set(index, value) : ArrayList의 index번째 위치에 value를 수정한다.
		list.set(3, 5);
		System.out.println(list);

		/*
		 * # 향상된 for문 
		 * 1) 배열이나 ArrayList 전체 데이터를 대상으로 작업할 경우 사용한다. 
		 * 2) 구조 for(자료형 변수명 : 배열 or ArrayList){ 반복할 문장; }
		 */

		// list의 0번째 값을 num에 저장한 후 반복을 시작하며
		// list의 마지막 값을 num에 저장한 후 반복한 다음 종료된다.
		for (int num : list) {
			System.out.print(num+" ");
		}
		System.out.println();
		// clear() : ArrayList의 모든 데이터를 제거한다.
		list.clear();
		System.out.println(list.size());

	}

}
