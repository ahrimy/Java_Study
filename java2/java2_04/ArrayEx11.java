package java2_04;

import java.util.Random;

public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] check = new int[5];
		int[] arr = new int[5];
		Random ran = new Random();

		for (int i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(5);
			if (check[arr[i]] == 1) {
				i--;
			} else {
				check[arr[i]] = 1;
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
