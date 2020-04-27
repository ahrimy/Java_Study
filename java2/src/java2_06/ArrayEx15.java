package java2_06;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];

		// 셔플(shuffle)
		int i = 0;
		while (i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;

			i += 1;
		}

		for (int j = 0; j < 10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();
		boolean run = true;
		while (run) {
			System.out.print("입력1:");
			int input1 = scan.nextInt();
			System.out.print("입력2:");
			int input2 = scan.nextInt();
			
			if(front[input1]==front[input2]){
				back[input1]=1;
				back[input2]=1;
			}
			for (int j = 0; j < 10; j++) {
				System.out.print(front[j] + " ");
			}		
			System.out.println();
			int count =0;
			for (int j = 0; j < 10; j++) {
				if(back[j]==1){
					count++;
				}
				System.out.print(back[j] + " ");
			}
			System.out.println();
			if(count==10){
				run=false;
			}
		}
	}

}
