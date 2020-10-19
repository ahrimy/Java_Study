package java6_11;

import java.util.Scanner;

class LadderGame{
	Scanner scan = new Scanner(System.in);
	String menu = "";
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{1,1,0,0,0},
			{0,1,1,0,0},
			{1,1,0,0,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};
	
	int x = 0; int y = 0;
	void showLadder(){
		System.out.println("------------------");		

		for (int i = 0; i < ladder[0].length; i++) {
			System.out.print(" " + (i + 1) + " ");
		}
		System.out.println();
		for (int j = 0; j < ladder.length; j++) {
			for (int k = 0; k < ladder[j].length; k++) {
				if (ladder[j][k] == 0) {
					System.out.print(" ¦¢ ");
				} else if (k != 0 && ladder[j][k] == 1 && ladder[j][k - 1] == 1) {
					System.out.print("¦¡¦© ");
				} else if (k != ladder[j].length - 1 && ladder[j][k] == 1 && ladder[j][k + 1] == 1) {
					System.out.print(" ¦§¦¡");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	void moveLadder(){
		System.out.print("Choose the number[1-5]:");
		x = scan.nextInt()-1;

		while (y < 9) {
			System.out.println("current location:" + y + " " + x);
			int check = 0;
			if (ladder[y][x] == 1) {
				if (check == 0 &&x > 0 && x <= 4) {
					if (ladder[y][x - 1] == 1) {
						x -= 1;
						System.out.println("Went left");
						check = 1;
					}
				}
				if (check == 0 && x >= 0 && x < 4) {
					if (ladder[y][x + 1] == 1) {
						x += 1;
						System.out.println("Went right");
						check = 1;
					}
				}
			}

			y += 1;
		}
	}
	void setMenu(){
		if (x == 0) {
			menu = "±è¹ä";
		} else if (x == 1) {
			menu = "¿ìÀ¯";
		} else if (x == 2) {
			menu = "Ä¡Å²";
		} else if (x == 3) {
			menu = "µû¾Æ";
		} else if (x == 4) {
			menu = "ÇÇÀÚ";
		}

	}
	void run(){
		showLadder();
		moveLadder();
		setMenu();
		System.out.println("Menu:"+menu);
	}
}
public class Method20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LadderGame lg = new LadderGame();
		lg.run();

	}

}
