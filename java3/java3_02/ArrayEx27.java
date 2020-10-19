package java3_02;

import java.util.Scanner;

public class ArrayEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int exit = 10;
		int[] game = {11,15,10,14,12,13};
		
		while(exit<16){
			System.out.println("Exit:"+exit);
			for(int i=0;i<6;i++){
				System.out.print(game[i]+" ");
			}
			System.out.println();
			System.out.print("Enter the number:");
			int input = scan.nextInt();
			if(game[input]==exit){
				exit++;
			}
			
		}
		
	}

}
