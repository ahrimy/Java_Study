package java4_23;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int size = 5;
		int road = 20;
		int cnt=0;

		int[][] map = { { 0, 1, 2, 3, 4 }, { 15, 20, 20, 20, 5 }, { 14, 20, 20, 20, 6 }, { 13, 20, 20, 20, 7 },
				{ 12, 11, 10, 9, 8 } };

		int player = 0;

		while (cnt<3) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (map[i][j] == road) {
						System.out.print("�� ");
					} else if (map[i][j] == player) {
						System.out.print("�� ");
					} else {
						System.out.print("�� ");
					}
				}
				System.out.println();
			}
			System.out.println();

			System.out.print("[1~3]�Է�:");
			int input = scan.nextInt();
			player+=input;
			cnt += player/16;
			player%=16;

		}
		System.out.println();
		System.out.println("��������");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (map[i][j] == road) {
					System.out.print("�� ");
				} else if (map[i][j] == player) {
					System.out.print("�� ");
				} else {
					System.out.print("�� ");
				}
			}
			System.out.println();
		}
	}

}
