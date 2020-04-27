package java1_18;

import java.util.Scanner;

public class WhileEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1 = 0;
		int p2 = 0;

		int br = 0;
		int turn = 0;
		Scanner scan = new Scanner(System.in);
		int who = 1;
		while (br < 31) {
			if (who == 1) {
				turn++;
				System.out.print("p1's turn:");
				p1 = scan.nextInt();
				br += p1;
				System.out.println(turn + "ео : p1(" + p1 + ") br(" + br + ")");
				who = 2;
			} else {
				turn++;
				System.out.print("p2's turn:");
				p2 = scan.nextInt();
				br += p2;
				System.out.println(turn + "ео : p2(" + p1 + ") br(" + br + ")");
				who = 1;
			}
		}
		if(who==1){
			System.out.println("A winner is P1");
		}else{
			System.out.println("A winner is P2");
		}
	}

}
