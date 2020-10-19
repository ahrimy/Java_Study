package java3_09;

import java.util.Scanner;

public class ArrayEx43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int ladder[][] = { { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 1 }, { 0, 1, 1, 0, 0 }, { 0, 0, 1, 1, 0 },
				{ 1, 1, 0, 0, 0 }, { 0, 1, 1, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 } };

		int x = 0;
		int y = 0;
		System.out.print("Choose the number[0-4]:");
		x = scan.nextInt();

		while (y < 9) {
			System.out.println("current location:" + y + " " + x);
			int check = 0;
			if (ladder[y][x] == 1) {
				if (check == 0 && x > 0 && x <= 4) {
					if (ladder[y][x - 1] == 1) {
						x -= 1;
						System.out.println("Went left");
						check = 1;
					}
				}
				if (check == 0 && x >= 0 && x < 4) {
					if (ladder[y][x + 1] == 1) {
						x += 1;
						System.out.println("Went right");
						check = 1;
					}
				}
			}

			y += 1;

		}

	}

}
