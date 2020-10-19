package java7_02;

import java.util.Random;
import java.util.Scanner;

class Horse {
	String name = "";
	int pos = 0;
	int rank = 0;
	boolean win = false;
}

class Racing {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	int size = 4;
	Horse[] horses = new Horse[size];
	int line = 20;
	int track[][] = new int[size][line];

	void setName() {
		for (int i = 0; i < size; i++) {
			System.out.print("Name:");
			horses[i].name = scan.next();
		}
	}

	void setTrack() {
		for (int i = 0; i < size; i++) {
			track[i][horses[i].pos] = 1;
		}
	}

	void showTrack() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < line; j++) {
				if (track[i][j] == 1) {
					System.out.print("бс ");
				} else {
					System.out.print("бр ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	int winners = 0;

	void run() {
		for (int i = 0; i < size; i++) {
			horses[i] = new Horse();
		}
		setName();
		setTrack();
		while (winners < size) {
			showTrack();
			for (int i = 0; i < size; i++) {
				if (horses[i].win == false) {
					int temp = ran.nextInt(3);
					if (horses[i].pos + temp >= line) {
						track[i][horses[i].pos] = 0;
						horses[i].pos = line;
						horses[i].win = true;
						horses[i].rank = ++winners;
					} else {
						track[i][horses[i].pos] = 0;
						horses[i].pos += temp;
						track[i][horses[i].pos] = 1;
					}
				}
			}
		}
		result();

	}

	void result() {
		for (int i = 0; i < size; i++) {
			System.out.println(horses[i].name + " : " + horses[i].rank + "╡ю");
		}

	}
}

public class ClassArray10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racing race = new Racing();
		race.run();
	}

}
