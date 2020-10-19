package java2_07;

import java.util.Scanner;

public class ArrayEx17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = new int[9];

		int turn = 1;
		boolean run = true;
		while (run) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(game[i * 3 + j] + " ");
				}
				System.out.println();
			}
			if (turn % 2 == 1) {
				System.out.print("P1 인덱스 입력:");
				int input = scan.nextInt();
				if (game[input] == 0) {
					game[input] = 1;
					turn++;
				} else {
					System.out.println("선택불가");

				}
			} else {
				System.out.print("P2 인덱스 입력:");
				int input = scan.nextInt();
				if (game[input] == 0) {
					game[input] = 2;
					turn++;
				} else {

					System.out.println("선택불가");
				}
			}
			for (int i = 0; i < 3; i++) {
				if (game[i * 3] == 1 && game[i * 3 + 1] == 1 && game[i * 3 + 2] == 1) {
					System.out.println("P1 win");
					run = false;
					break;
				} else if (game[i * 3] == 2 && game[i * 3 + 1] == 2 && game[i * 3 + 2] == 2) {
					System.out.println("P2 win");
					run = false;
					break;
				} else if (game[i] == 1 && game[i + 3] == 1 && game[i + 6] == 1) {
					System.out.println("P1 win");
					run = false;
					break;
				} else if (game[i] == 2 && game[i + 3] == 2 && game[i + 6] == 2) {
					System.out.println("P2 win");
					run = false;
					break;
				}
			}
			if (game[0] == 1 && game[4] == 1 && game[8] == 1) {
				System.out.println("P1 win");
				run = false;
			} else if (game[0] == 2 && game[4] == 2 && game[8] == 2) {
				System.out.println("P2 win");
				run = false;
			} else if (game[2] == 1 && game[4] == 1 && game[6] == 1) {
				System.out.println("P1 win");
				run = false;
			} else if (game[2] == 2 && game[4] == 2 && game[6] == 2) {
				System.out.println("P2 win");
				run = false;
			}
		

		}

	}
}
