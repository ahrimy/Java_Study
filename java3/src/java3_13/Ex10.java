package java3_13;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Eneter a number: ");
		int input = scan.nextInt();

		int num = input;
		while (true) {
			int count = 0;
			num++;
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(num + " ");
				break;
			}

		}
	}

}
