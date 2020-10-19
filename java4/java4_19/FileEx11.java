package java4_19;

import java.util.Random;

public class FileEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horse[][] = new int[5][20];
		Random ran = new Random();
		int max = 20;
		int rank[] = new int[5];
		int num = 1;
		int total[] = new int[5];
		int current[] = new int[5];
		while (num <= 5) {
			for (int i = 0; i < 5; i++) {

				System.out.print("Horse" + (i + 1));
				for (int j = 0; j < 20; j++) {
					if (j == total[i]) {
						System.out.print(" X");
					} else {
						System.out.print(" O");
					}
				}
				System.out.println();
			}
			System.out.println();
			int check = 0;
			for (int i = 0; i < 5; i++) {
				int r = ran.nextInt(3);

				if (rank[i] == 0) {
					if (total[i] + r < max) {
						horse[i][total[i]] = 0;
						total[i] += r;
						horse[i][total[i]] = 1;
					} else {
						if (check == 0) {
							horse[i][total[i]] = 0;
							total[i] += r;
							rank[i] = num++;
							check = 1;
						} else {
							i--;
						}
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Horse" + (i + 1) + " " + (rank[i]) + "µî");
		}
	}

}
