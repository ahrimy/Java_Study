package java5_06;

import java.util.Scanner;
class Ex12{
	int[][] game = new int[3][3];
	
	int turn = 1;
	int win = 0;		
}

public class ClassEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Ex12 e = new Ex12();


		boolean run = true;
		while (run) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(e.game[i][j] + " ");
				}
				System.out.println();
			}
			if (e.turn % 2 == 1) {
				System.out.print("P1 좌표 입력:");
				int inputY = scan.nextInt();
				int inputX = scan.nextInt();
				if (e.game[inputY][inputX] == 0) {
					e.game[inputY][inputX] = 1;
					e.turn++;
				} else {
					System.out.println("선택불가");

				}
			} else {
				System.out.print("P2 좌표 입력:");

				int inputY = scan.nextInt();
				int inputX = scan.nextInt();
				if (e.game[inputY][inputX] == 0) {
					e.game[inputY][inputX] = 2;
					e.turn++;
				} else {

					System.out.println("선택불가");
				}
			}
			for (int i = 0; i < 3; i++) {
				if (e.game[i][0] == 1 && e.game[i][1] == 1 && e.game[i][2] == 1) {
					e.win = 1;
				} else if (e.game[i][0] == 2 && e.game[i][1] == 2 && e.game[i][2] == 2) {
					e.win = 2;
				} else if (e.game[0][i] == 1 && e.game[1][i] == 1 && e.game[2][i] == 1) {
					e.win = 1;
				} else if (e.game[0][i] == 2 && e.game[1][i] == 2 && e.game[2][i] == 2) {
					e.win = 2;
				}
			}
			if (e.game[0][0] == 1 && e.game[1][1] == 1 && e.game[2][2] == 1) {
				e.win = 1;
			} else if (e.game[0][0] == 2 && e.game[1][1] == 2 && e.game[2][2] == 2) {
				e.win = 2;
			} else if (e.game[0][2] == 1 && e.game[1][1] == 1 && e.game[2][0] == 1) {
				e.win = 1;
			} else if (e.game[0][2] == 2 && e.game[1][1] == 2 && e.game[2][0] == 2) {
				e.win = 2;
			}
			if(e.win!=0){
				System.out.println("Player"+e.win+" win");
				run = false;
			}

		}

	}

}
