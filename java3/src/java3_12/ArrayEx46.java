package java3_12;

import java.util.Random;

public class ArrayEx46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] lottoSet = new int[5][7];
		Random ran = new Random();

		int winSet = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				int r = ran.nextInt(2);
				if (r == 1) {
					lottoSet[i][j] = 3;
				} else {
					lottoSet[i][j] = 0;
				}
			}
			int count = 0;
			int check = 0;
			for (int j = 0; j < 7; j++) {
				if (lottoSet[i][j] == 3) {
					count++;
					
				} else {
					count = 0;
				}
				if (count == 3) {
					check = 1;

				}
			}

			if (check == 1 && winSet == 0) {
				winSet = 1;
			} else if (check == 1 && winSet == 1) {
				i--;
			}
			if (i == 4 && winSet == 0) {
				i--;
			}

		}
		for (int i = 0; i < 5; i++) {
			System.out.print("[" + i + "]");

			for (int j = 0; j < 7; j++) {
				System.out.print(lottoSet[i][j] + " ");
				;
			}
			System.out.println();
		}

	}

}
