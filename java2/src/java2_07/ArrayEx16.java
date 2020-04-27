package java2_07;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		int[] check = new int[4];

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			int rNum = ran.nextInt(4)+1;
			if (check[rNum-1] == 0) {
				arr[i] = rNum;
				check[rNum-1] = 1;
			} else {
				i--;
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < 4; i++) {
			int input = scan.nextInt();
			if (arr[input] == i + 1) {
				arr[input] = 9;
			} else {
				i--;
			}
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

}
