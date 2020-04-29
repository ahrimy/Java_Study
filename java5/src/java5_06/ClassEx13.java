package java5_06;

import java.util.Random;
import java.util.Scanner;

class Ex13{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}

public class ClassEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex13 e = new Ex13();
		

		for(int i=0;i<e.SIZE;i++){
			e.front[i] = i+1;
			e.back[i] = i+10;
		}
		for(int i=0;i<1000;i++){
			int r = ran.nextInt(e.SIZE);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
			/*
			r = ran.nextInt(SIZE);
			temp = back[0];
			back[0] = back[r];
			back[r] = temp;
			*/
		}
		
		int num = 1;
		while(num<19) {
			
			int answer = 0;
			for(int i=0; i<e.SIZE; i++) {
				if(e.front[i] == num) {
					answer = i;
				}
			}
			System.out.println(num + "[" + answer + "]");
			System.out.println();
			
			for(int i=0; i<e.SIZE; i++) {
				if(e.front[i] == 0) {
					System.out.print("\t");
				}else {
					System.out.print(e.front[i] + "\t");
				}
				if(i % 3 == 2) {
					System.out.println("\n");
				}
			}
			
			System.out.print("[" + num + "]의 인덱스 입력 : ");
			int idx = scan.nextInt();
			
			if(e.front[idx] == num) {
				if(1 <= num && num <= e.SIZE) {
					e.front[idx] = e.back[num-1];
				}else {
					e.front[idx] = 0;
				}
				
				num += 1;
			}
			
		}
	}

}
