package java07_02;

import java.util.Random;

class Lotto {
	int[] data = new int[8];
	boolean win = false;

	void print() {
		for (int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}
}

public class ClassArray08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();

		Lotto[] lotto = new Lotto[5];

		int win = -1;
		for (int i = 0; i < 5; i++) {
			lotto[i] = new Lotto();
			int cnt = 0;
			for (int j = 0; j < 8; j++) {
				lotto[i].data[j] = ran.nextInt(2);
			}
			for (int j = 0; j < 8; j++) {
				if (lotto[i].data[j] == 1) {
					cnt++;
				} else {
					if (cnt < 5) {
						cnt = 0;
					}
				}
			}
			if (cnt >= 5 && win == -1) {
				win = i;
				lotto[i].win = true;
			} else if (cnt >= 5 && win > -1) {
				i--;
			}
			if(i==4&&win==-1){
				i--;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(lotto[i].win);
			lotto[i].print();
		}
	}

}
