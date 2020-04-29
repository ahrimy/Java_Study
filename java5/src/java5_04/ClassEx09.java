package java5_04;

import java.util.Random;
import java.util.Scanner;

class Ex09{
	int[] front={1,1,2,2,3,3,4,4,5,5};
	int[] back = new int[10];
	
	int cnt = 0;
}
public class ClassEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		Ex09 e = new Ex09();

		// 셔플(shuffle)
		int i = 0;
		while (i < 1000) {
			int r = ran.nextInt(10);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;

			i += 1;
		}
		for (int j = 0; j < 10; j++) {
			System.out.print("["+j + "]");
		}System.out.println();
		for (int j = 0; j < 10; j++) {
			System.out.print(" "+e.front[j] + " ");
		}		
		System.out.println();
		boolean run = true;
		while (run) {
			System.out.print("입력1:");
			int input1 = scan.nextInt();
			System.out.print("입력2:");
			int input2 = scan.nextInt();
			
			if(e.front[input1]==e.front[input2]){
				e.back[input1]=1;
				e.back[input2]=1;
			}
			for (int j = 0; j < 10; j++) {
				System.out.print("["+j + "]");
			}
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print(" "+e.front[j] + " ");
			}		
			System.out.println();
			int count =0;
			for (int j = 0; j < 10; j++) {
				if(e.back[j]==1){
					count++;
				}
				System.out.print(e.back[j] + " ");
			}
			System.out.println();
			if(count==10){
				run=false;
			}
		}
	}

}
