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
						System.out.print("¡á ");
					} else if (map[i][j] == player) {
						System.out.print("¿Ê ");
					} else {
						System.out.print("¡à ");
					}
				}
				System.out.println();
			}
			System.out.println();

			System.out.print("[1~3]ÀÔ·Â:");
			int input = scan.nextInt();
			player+=input;
			cnt += player/16;
			player%=16;

		}
		System.out.println();
		System.out.println("°ÔÀÓÁ¾·á");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (map[i][j] == road) {
					System.out.print("¡á ");
				} else if (map[i][j] == player) {
					System.out.print("¿Ê ");
				} else {
					System.out.print("¡à ");
				}
			}
			System.out.println();
		}
	}

}
