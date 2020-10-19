package java2_08;

import java.util.Scanner;

public class ArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int turn = 1;
		int cnt1 = 0;
		int cnt2 = 0;

		boolean run = true;

		int[] game = new int[8];
		int player1 = 0;
		int player2 = 0;
		while (run) {
			if (turn % 2 == 1) {
				System.out.print("P1입력(1~3):");
				int input = scan.nextInt();
				game[player1] = 0;
				if (player1 + input == player2) {
					game[player2] = 0;
					player2 = 0;
					game[player2] = 2;
					System.out.println("P2 원점으로 돌아감");
				}
				player1 += input;
				if (player1 < 8) {
					game[player1] = 1;

				} else {
					player1 = 0;
					cnt1++;
				}
			} else {
				System.out.print("P2입력(1~3):");
				int input = scan.nextInt();
				game[player2] = 0;
				if (player2 + input == player1) {
					game[player1] = 0;
					player1 = 0;
					game[player1] = 1;
					System.out.println("P1 원점으로 돌아감");
				}
				player2 += input;
				if (player2 < 8) {
					game[player2] = 2;

				} else {
					player2 = 0;
					cnt2++;
				}
			}
			turn++;
			for(int i=0;i<8;i++){
				System.out.print(game[i]+ " ");
			}
			System.out.println();
			System.out.println("P1:"+cnt1+" P2:"+cnt2);
			if (cnt1 == 3) {
				System.out.println("P1 win");
				run = false;
			} else if (cnt2 == 3) {
				System.out.println("P2 win");
				run = false;

			}

		}

	}

}
