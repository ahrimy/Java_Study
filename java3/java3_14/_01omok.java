package java3_14;

import java.util.Scanner;

public class _01omok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 1, 0, 0, 1, 0 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };
		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;
		int turn = 1;
		int win = 0;
		while (win == 0) {
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					System.out.print(omok[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 6; j++) {
					if (omok[i][j] == 1 && omok[i][j + 1] == 1 && omok[i][j + 2] == 1 && omok[i][j + 3] == 1
							&& omok[i][j + 4] == 1) {
						win = 1;
					} else if (omok[i][j] == 2 && omok[i][j + 1] == 2 && omok[i][j + 2] == 2 && omok[i][j + 3] == 2
							&& omok[i][j + 4] == 2) {
						win = 2;
					}
				}
			}

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 6; j++) {
					if (omok[j][i] == 1 && omok[j + 1][i] == 1 && omok[j + 2][i] == 1 && omok[j + 3][i] == 1
							&& omok[j + 4][i] == 1) {
						win = 1;
					} else if (omok[j][i] == 2 && omok[j + 1][i] == 2 && omok[j + 2][i] == 2 && omok[j + 3][i] == 2
							&& omok[j + 4][i] == 2) {
						win = 2;
					}
				}
			}
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (omok[i][j] == 1 && omok[i + 1][j + 1] == 1 && omok[i + 2][j + 2] == 1 && omok[i + 3][j + 3] == 1
							&& omok[i + 4][j + 4] == 1) {
						win = 1;
					} else if (omok[i][j] == 2 && omok[i + 1][j + 1] == 2 && omok[i + 2][j + 2] == 2
							&& omok[i + 3][j + 3] == 2 && omok[i + 4][j + 4] == 2) {
						win = 2;
					}
				}
			}
			for (int i = 9; i > 3; i--) {
				for (int j = 0; j < 6; j++) {
					if (omok[i][j] == 1 && omok[i - 1][j + 1] == 1 && omok[i - 2][j + 2] == 1 && omok[i - 3][j + 3] == 1
							&& omok[i - 4][j + 4] == 1) {
						win = 1;
					} else if (omok[i][j] == 2 && omok[i - 1][j + 1] == 2 && omok[i - 2][j + 2] == 2
							&& omok[i - 3][j + 3] == 2 && omok[i - 4][j + 4] == 2) {
						win = 2;
					}
				}
			}
			if(win!=0){
				if(win==1){
					System.out.println("P1win");
				}else if(win==2){
					System.out.println("P2win");
				}
				break;
			}
			if (turn % 2 == 1) {
				System.out.print("P1{Y,X} 입력: ");
				p1Y = scan.nextInt();
				p1X = scan.nextInt();
				while (omok[p1Y][p1X] != 0) {
					System.out.println("선택불가");
					System.out.print("P1{Y,X} 입력: ");
					p1Y = scan.nextInt();
					p1X = scan.nextInt();
				}
				omok[p1Y][p1X] = 1;
				turn++;
			} else {
				System.out.print("P2{Y,X} 입력: ");
				p2Y = scan.nextInt();
				p2X = scan.nextInt();
				while (omok[p2Y][p2X] != 0) {
					System.out.println("선택불가");
					System.out.print("P2{Y,X} 입력: ");
					p2Y = scan.nextInt();
					p2X = scan.nextInt();
				}
				omok[p2Y][p2X] = 2;
				turn++;
			}
			
		}

	}

}
