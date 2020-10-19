package java6_08;

import java.util.Random;
import java.util.Scanner;

class MemoryGame{
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	int[] front={1,1,2,2,3,3,4,4,5,5};
	int[] back = new int[10];
	
	int cnt = 0;
	void shuffle(){
		int i = 0;
		while (i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;

			i += 1;
		}
	}
	void printCard(){
		for (int j = 0; j < 10; j++) {
			System.out.print("["+j + "]");
		}System.out.println();
		for (int j = 0; j < 10; j++) {
			System.out.print(" "+front[j] + " ");
		}		
		System.out.println();
	}
	void choiceCard(){
		System.out.print("입력1:");
		int input1 = scan.nextInt();
		System.out.print("입력2:");
		int input2 = scan.nextInt();
		
		if(front[input1]==front[input2]){
			back[input1]=1;
			back[input2]=1;
		}
	}
	void run(){
		
		shuffle();
		while (true) {
			cnt =0;
			printCard();
			choiceCard();
			for (int j = 0; j < 10; j++) {
				System.out.print("["+j + "]");
			}
			System.out.println();
			for (int j = 0; j < 10; j++) {
				if(back[j]==1){
					cnt++;
				}
				System.out.print(" "+back[j] + " ");
			}
			System.out.println();
			if(cnt==10){
				break;
			}
		}
	}
}

public class MethodEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryGame mg = new MemoryGame();
		mg.run();
	}

}
