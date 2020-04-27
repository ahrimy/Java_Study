package java2_02;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		
		int[] sNum = {1001,1002,1003,1004,1005};
		int[] score = {87,11,45,98,23};
		
		int num = scan.nextInt();

		for(int i=0;i<5;i++){
			if(sNum[i]==num){
				System.out.println(score[i]);
				break;
			}else if(i==4){
				System.out.println("doesn't exist");
			}
		}
	}

}
