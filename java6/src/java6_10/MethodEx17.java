package java6_10;

import java.util.Scanner;

class TicTacToe{
	Scanner scan = new Scanner(System.in);
	int[][] game = null;
	
	int turn = 1;
	int win = 0;	
	void setGame(){
		game = new int[3][3];
	}
	void showGame(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();
		}
	}
	void choiceIdx(){
		if (turn % 2 == 1) {
			System.out.print("P1 좌표 입력:");
			int inputY = scan.nextInt();
			int inputX = scan.nextInt();
			if (game[inputY][inputX] == 0) {
				game[inputY][inputX] = 1;
				turn++;
			} else {
				System.out.println("선택불가");

			}
		} else {
			System.out.print("P2 좌표 입력:");

			int inputY = scan.nextInt();
			int inputX = scan.nextInt();
			if (game[inputY][inputX] == 0) {
				game[inputY][inputX] = 2;
				turn++;
			} else {

				System.out.println("선택불가");
			}
		}
	}
	void exitWidth(){
		for (int i = 0; i < 3; i++) {
			if (game[i][0] == 1 && game[i][1] == 1 && game[i][2] == 1) {
				win = 1;
			} else if (game[i][0] == 2 && game[i][1] == 2 && game[i][2] == 2) {
				win = 2;
			} 
		}
	}
	void exitHeight(){
		for (int i = 0; i < 3; i++) {
		 if (game[0][i] == 1 && game[1][i] == 1 && game[2][i] == 1) {
				win = 1;
			} else if (game[0][i] == 2 && game[1][i] == 2 && game[2][i] == 2) {
				win = 2;
			}
		}
	}
	void exitCross(){
		if (game[0][0] == 1 && game[1][1] == 1 && game[2][2] == 1) {
			win = 1;
		} else if (game[0][0] == 2 && game[1][1] == 2 && game[2][2] == 2) {
			win = 2;
		} else if (game[0][2] == 1 && game[1][1] == 1 && game[2][0] == 1) {
			win = 1;
		} else if (game[0][2] == 2 && game[1][1] == 2 && game[2][0] == 2) {
			win = 2;
		}
	}
	void run(){
		setGame();
		while(true){
			showGame();
			choiceIdx();
			exitWidth();
			exitHeight();
			exitCross();
			if(win!=0){
				System.out.println("Player"+win+" win");
				break;
			}
			
		}
	}
}
public class MethodEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe tic = new TicTacToe();
		tic.run();


	}

}
