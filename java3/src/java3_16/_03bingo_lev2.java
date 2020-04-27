package java3_16;

import java.util.Random;
import java.util.Scanner;

public class _03bingo_lev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		final int SIZE = 5;
		final int MAXNUM = 25;
		int[][] bingo = new int[SIZE][SIZE];
		int[][] mark = new int[SIZE][SIZE];
		int row = 0;
		int column = 0;
		int check[] = new int[51];
		while (row < 5) {
			column = 0;
			while (column < 5) {
				bingo[row][column] = ran.nextInt(50) + 1;
				if (check[bingo[row][column]] == 0) {
					check[bingo[row][column]] = 1;
					column++;
				}
			}
			row++;
		}

		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;
		int turn = 1;
		int win = 0;
		while (win == 0) {

			System.out.println("=============== BINGO GAME ===============");
			System.out.print("\t");
			for (int i = 0; i < SIZE; i++) {
				System.out.print(i + "\t");
			}
			System.out.println("\n");
			for (int i = 0; i < SIZE; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < SIZE; j++) {
					if (mark[i][j] == 0) {
						System.out.print(bingo[i][j] + "\t");
					} else if(mark[i][j]==1){
						System.out.print("O\t");
					}else{
						System.out.print("X\t");
					}
				}
				System.out.println("\n");
			}

			for (int i = 0; i < SIZE; i++) {

				if (mark[i][0] == 1 && mark[i][1] == 1 && mark[i][2] == 1 && mark[i][3] == 1 && mark[i][4] == 1) {
					win = 1;
				} else if (mark[i][0] == 2 && mark[i][1] == 2 && mark[i][2] == 2 && mark[i][3] == 2
						&& mark[i][4] == 2) {
					win = 2;
				}

			}

			for (int i = 0; i < SIZE; i++) {

				if (mark[0][i] == 1 && mark[1][i] == 1 && mark[2][i] == 1 && mark[3][i] == 1 && mark[4][i] == 1) {
					win = 1;
				} else if (mark[0][i] == 2 && mark[1][i] == 2 && mark[2][i] == 2 && mark[3][i] == 2
						&& bingo[4][i] == 2) {
					win = 2;
				}

			}

			if (mark[0][0] == 1 && mark[1][1] == 1 && mark[2][2] == 1 && mark[3][3] == 1 && mark[4][4] == 1) {
				win = 1;
			} else if (mark[0][0] == 2 && mark[1][1] == 2 && mark[2][2] == 2 && mark[3][3] == 2
					&& mark[4][4] == 2) {
				win = 2;
			}

			if (mark[0][4] == 1 && mark[1][3] == 1 && mark[2][2] == 1 && mark[3][1] == 1
					&& mark[4][0] == 1) {
				win = 1;
			} else if (mark[0][4] == 2 && mark[1][3] == 2 && mark[2][2] == 2 && mark[3][1] == 2
					&& mark[4][0] == 2) {
				win = 2;
			}
			if (win != 0) {
				if (win == 1) {
					System.out.println("P1win");
				} else if (win == 2) {
					System.out.println("P2win");
				}
				break;
			}
			if (turn % 2 == 1) {
				System.out.print("P1{Y,X} 입력: ");
				p1Y = scan.nextInt();
				p1X = scan.nextInt();
				while (mark[p1Y][p1X] != 0) {
					System.out.println("선택불가");
					System.out.print("P1{Y,X} 입력: ");
					p1Y = scan.nextInt();
					p1X = scan.nextInt();
				}
				mark[p1Y][p1X] = 1;
				turn++;
			} else {
				System.out.print("P2{Y,X} 입력: ");
				p2Y = scan.nextInt();
				p2X = scan.nextInt();
				while (mark[p2Y][p2X] != 0) {
					System.out.println("선택불가");
					System.out.print("P2{Y,X} 입력: ");
					p2Y = scan.nextInt();
					p2X = scan.nextInt();
				}
				mark[p2Y][p2X] = 2;
				turn++;
			}

		}
	}

}
