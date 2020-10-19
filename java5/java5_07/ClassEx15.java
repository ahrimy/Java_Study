package java5_07;

import java.util.Random;
import java.util.Scanner;

class Ex15 {
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];

	int total = 0;
}

public class ClassEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex15 e = new Ex15();
		int check[] = new int[11];
		System.out.println("[[Game]]");
		for (int i = 0; i < e.game.length; i++) {
			e.game[i] = ran.nextInt(9) + 1;
			if (check[e.game[i]] == 1) {
				i--;
			} else {
				check[e.game[i]] = 1;
				System.out.print(" "+e.game[i]);
			}
		}
		System.out.println();
		int myTotal = 0;
		check = new int[6];		
		System.out.print("(");
		for (int i = 0; i < e.idx.length; i++) {
			e.idx[i] = ran.nextInt(6);
			if (check[e.idx[i]] == 1) {
				i--;
			} else {
				check[e.idx[i]] = 1;
				e.total += e.game[e.idx[i]];
				System.out.print(e.idx[i] + " ");
			}
		}
		System.out.print(")\n");
		System.out.println("Total:"+e.total);
		for (int i = 0; i < e.myIdx.length; i++) {
			e.myIdx[i] = scan.nextInt();

			myTotal += e.game[e.myIdx[i]];

		}
		if(e.total==myTotal){
			System.out.println("정답");
		}else{
			System.out.println("오답");
		}
	}

}
