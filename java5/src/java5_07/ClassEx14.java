package java5_07;

import java.util.Scanner;
class Ex14{
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
	
	String[] menu = {"¡“Ω∫∂±∫∫¿Ã", "CU∆Ì¿«¡°", "∏∂∂Û≈¡", "±Ëπ‰√µ±π", "∏Ì¿Œ∏∏µŒ"};
}

public class ClassEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Ex14 e = new Ex14();
	
		
		System.out.println("------------------");		

		for (int i = 0; i < e.ladder[0].length; i++) {
			System.out.print(" " + (i + 1) + " ");
		}
		System.out.println();
		for (int j = 0; j < e.ladder.length; j++) {
			for (int k = 0; k < e.ladder[j].length; k++) {
				if (e.ladder[j][k] == 0) {
					System.out.print(" ¶¢ ");
				} else if (k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) {
					System.out.print("¶°¶© ");
				} else if (k != e.ladder[j].length - 1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) {
					System.out.print(" ¶ß¶°");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.print("Choose the number[1-5]:");
		e.x = scan.nextInt()-1;

		while (e.y < 9) {
			System.out.println("current location:" + e.y + " " + e.x);
			int check = 0;
			if (e.ladder[e.y][e.x] == 1) {
				if (check == 0 && e.x > 0 && e.x <= 4) {
					if (e.ladder[e.y][e.x - 1] == 1) {
						e.x -= 1;
						System.out.println("Went left");
						check = 1;
					}
				}
				if (check == 0 && e.x >= 0 && e.x < 4) {
					if (e.ladder[e.y][e.x + 1] == 1) {
						e.x += 1;
						System.out.println("Went right");
						check = 1;
					}
				}
			}

			e.y += 1;

		}
		System.out.println("Menu:"+e.menu[e.x]);
	}

}
