package java6_08;

import java.util.Scanner;

class Game {
	Scanner scan = new Scanner(System.in);
	int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
	int player = 4;

	void printplay() {
		for (int i = 0; i < 9; i++) {
			System.out.print(game[i] + " ");
		}
		System.out.println();

	}

	void showMenu() {
		System.out.println("1.좌로 이동");
		System.out.println("2.우로 이동");
		System.out.println("3.종료하기");
	}

	void moveLeft() {
		if (player - 1 >= 0) {
			if (game[player - 1] == 1) {
				System.out.println("There is a wall");
				System.out.print("Crush(Enter 3)?:");
				int input = scan.nextInt();
				if (input == 3) {
					game[player - 1] = 0;
				} else {
					return;
				}
			}
			game[player] = 0;
			player -= 1;
			game[player] = 2;
		} else {
			if (game[8] == 1) {
				System.out.println("There is a wall");
				System.out.print("Crush(Enter 3)?:");
				int input = scan.nextInt();
				if (input == 3) {
					game[8] = 0;
				} else {
					return;
				}
			}
			game[player] = 0;
			player = 8;
			game[player] = 2;
		}
	}

	void moveRight() {
		if (player < 8) {
			if (game[player + 1] == 1) {
				System.out.println("There is a wall");
				System.out.print("Crush(Enter 3)?:");
				int input = scan.nextInt();
				if (input == 3) {
					game[player + 1] = 0;
				} else {
					return;
				}
			}
			game[player] = 0;
			player += 1;
			game[player] = 2;
		} else {
			if (game[0] == 1) {
				System.out.println("There is a wall");
				System.out.print("Crush(Enter 3)?:");
				int input = scan.nextInt();
				if (input == 3) {
					game[0] = 0;
				} else {
					return;
				}
			}
			game[player] = 0;
			player = 0;
			game[player] = 2;
		}
	}

	void run() {
		while (true) {
			printplay();
			showMenu();
			int input = scan.nextInt();
			if (input == 1) {
				moveLeft();
			} else if (input == 2) {
				moveRight();
			} else {
				System.out.println("게임 종료");
				break;
			}

		}
	}
}

public class MethodEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
		g.run();

	}

}
