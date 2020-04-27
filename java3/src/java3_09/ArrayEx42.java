package java3_09;

import java.util.Scanner;

public class ArrayEx42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] apt = { { 101, 102, 103 }, { 201, 202, 203 }, { 301, 302, 303 } };

		int[][] pay = { { 1000, 2100, 1300 }, { 4100, 2000, 1000 }, { 3000, 1600, 800 } };

		int[] floor = new int[3];
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				floor[i] += pay[i][j];
			}
		}
		for(int i=0;i<floor.length;i++){
			System.out.print(floor[i]+" ");
		}
		System.out.println();
		
		System.out.print("Enter the apartment number:");

		int number = scan.nextInt();
		int maxpay = 0;
		int minpay = -1;
		int maxapt = 0;
		int minapt = 0;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (apt[i][j] == number) {

					System.out.println("Payment is " + pay[i][j]);

				}
				if(pay[i][j]>maxpay){
					maxpay = pay[i][j];
					maxapt = apt[i][j];
				}
				if(pay[i][j]<minpay||minpay==-1){
					minpay = pay[i][j];
					minapt = apt[i][j];
				}

			}
		}
		System.out.println("Highest : "+maxapt+" / Lowest : "+minapt);
		
		
		int num1=0;
		int num2=0;
		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		int idx4 = 0;
		
		System.out.print("Enter number of apartment:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		
		for(int i=0;i<apt.length;i++){
			for(int j=0;j<apt[i].length;j++){
				if(apt[i][j]==num1){
					idx1 = i;
					idx2 = j;
				}
				if(apt[i][j]==num2){
					idx3 = i;
					idx4 = j;
				}
			}
		}
		
		num1 = pay[idx1][idx2];
		pay[idx1][idx2] = pay[idx3][idx4];
		pay[idx3][idx4] = num1;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
	}
}