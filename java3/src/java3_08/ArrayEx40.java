package java3_08;

import java.util.Scanner;

public class ArrayEx40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		Scanner scan = new Scanner(System.in);
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		int input1 = 0;
		int input2 = 0;
		System.out.print("Enter Index:");
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		System.out.println(arr[input1][input2]);

		System.out.print("Enter value:");
		input1 = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == input1) {
					System.out.println(i + " / " + j);
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					input1 = i;
					input2 = j;
				}
			}
		}
		System.out.println(input1 + " / " + input2);
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("Enter Values:");
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == input1) {
					temp1 = i;
					temp2 = j;
					System.out.println(i + " / " + j);
				}
				if (arr[i][j] == input2) {
					temp3 = i;
					temp4 = j;
					System.out.println(i + " / " + j);
				}
				
			}
		}
		input1 = arr[temp1][temp2];
		arr[temp1][temp2] = arr[temp3][temp4];
		arr[temp3][temp4] = input1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}


	}

}
