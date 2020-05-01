package java7_05;

import java.util.ArrayList;

class Tv {
	String name;
	String brand;
	int price;

	Tv(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}

class MyList_2 {
	Tv[] arr;
	int count;

	void add(Tv e) {
		if (count == 0) {
			arr = new Tv[count + 1];
		} else if (count > 0) {
			Tv[] temp = arr;

			arr = new Tv[count + 1];
			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
		}
		arr[count] = e;
		count += 1;
	}

	int size() {
		return count;
	}

	void remove(int index) {
		if (count == 1) {
			arr = null;
			count = 0;
		} else if (count > 1) {
			Tv[] temp = arr;

			arr = new Tv[count - 1];
			int j = 0;
			for (int i = 0; i < count; i++) {
				if (i != index) {
					arr[j] = temp[i];
					j += 1;
				}
			}
		}
		count -= 1;
	}

	Tv get(int index) {
		return arr[index];
	}

}

public class VectorEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tv> list = new ArrayList<>();

		Tv temp = new Tv("TV", "삼성", 1000);
		list.add(temp);

		temp = new Tv("시그니처TV", "엘지", 2000);
		list.add(temp);

		temp = new Tv("스마트TV", "애플", 3000);
		list.add(temp);

		temp = list.get(1);
		System.out.println(temp.name);

		// --------------------------------------------

		MyList_2 myList = new MyList_2();
		temp = new Tv("TV", "삼성", 1000);
		myList.add(temp);

		temp = new Tv("시그니처TV", "엘지", 2000);
		myList.add(temp);

		temp = new Tv("스마트TV", "애플", 3000);
		myList.add(temp);

		temp = myList.get(1);
		System.out.println(temp.name);

	}

}
