package java6_10;

import java.util.Random;
import java.util.Scanner;

class PlusGame {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	

	int total = 0;
	int myTotal = 0;
	void setNumber() {
		int check[] = new int[11];
		for (int i = 0; i < game.length; i++) {
			game[i] = ran.nextInt(9) + 1;
			if (check[game[i]] == 1) {
				i--;
			} else {
				check[game[i]] = 1;
			}
		}
	}

	void setIdx() {
		int[] check = new int[6];
		for (int i = 0; i < idx.length; i++) {
			idx[i] = ran.nextInt(6);
			if (check[idx[i]] == 1) {
				i--;
			} else {
				check[idx[i]] = 1;
				
			}
		}
	}

	void setTotal() {
		for (int i = 0; i < idx.length; i++) {

			total += game[idx[i]];

		}
	}

	void printNumber() {
		for (int i = 0; i < game.length; i++) {
				System.out.print(" " + game[i]);
		}
		System.out.println();
		System.out.println(total);
		
	}

	int choiceIdx() {
		int temp = 0;
		for (int i = 0; i < myIdx.length; i++) {
			myIdx[i] = scan.nextInt();

			temp += game[myIdx[i]];

		}
		return temp;
	}

	void run(){
		System.out.println("[[Game]]");
		setNumber();
		setIdx();
		setTotal();
		printNumber();
		
		while(true){
			myTotal = choiceIdx();
			if(total==myTotal){
				System.out.println("정답");
				break;
			}else{
				System.out.println("오답");
			}
		}
	}
}

public class MethodEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusGame pg = new PlusGame();
		pg.run();

	}

}
