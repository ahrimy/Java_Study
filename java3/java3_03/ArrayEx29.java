package java3_03;

import java.util.Scanner;

public class ArrayEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com = {1,7,3};
		int[] me = new int[3];
		Scanner scan = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;
		
		while(strike<3){
			strike = 0;
			ball = 0;
			System.out.print("Enter the number:");
			for(int i=0;i<3;i++){
				me[i] = scan.nextInt();
			}
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(com[i]==me[j]){
						if(i==j){
							strike++;
						}else{
						ball++;
						}
					}
				}
			}
			System.out.println(strike+"s / "+ball+"b");
		}
		
	}

}
