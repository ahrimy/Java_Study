package java1_16;

import java.util.Scanner;
public class WhileEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(num!=-100){
			System.out.print("Enter a number:");
			num = scan.nextInt();
			System.out.println(num);
		}
		System.out.println("Program exit");
	}

}
