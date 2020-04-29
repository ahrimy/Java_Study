package java6_11;

import java.util.Random;
import java.util.Scanner;

class SpeedGame{
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
	int num = 1;
	void setNumber(){
		for(int i=0;i<SIZE;i++){
			front[i] = i+1;
			back[i] = i+10;
		}
	}
	void suffleCard(){
		for(int i=0;i<1000;i++){
			int r = ran.nextInt(SIZE);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			/*
			r = ran.nextInt(SIZE);
			temp = back[0];
			back[0] = back[r];
			back[r] = temp;
			*/
		}
	}
	void showCard(){
		int answer = 0;
		for(int i=0; i<SIZE; i++) {
			if(front[i] == num) {
				answer = i;
			}
		}
		System.out.println(num + "[" + answer + "]");
		System.out.println();
		
		for(int i=0; i<SIZE; i++) {
			if(front[i] == 0) {
				System.out.print("\t");
			}else {
				System.out.print(front[i] + "\t");
			}
			if(i % 3 == 2) {
				System.out.println("\n");
			}
		}
	}
	void selectCard(){
		System.out.print("[" + num + "]의 인덱스 입력 : ");
		int idx = scan.nextInt();
		
		if(front[idx] == num) {
			if(1 <= num && num <= SIZE) {
				front[idx] = back[num-1];
			}else {
				front[idx] = 0;
			}
			
			num += 1;
		}
	}
	void run(){
		setNumber();
		suffleCard();
while(num<19) {
			
showCard();
selectCard();
			
		}
	}
}
public class Method19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeedGame sg = new SpeedGame();
		sg.run();

	}

}
