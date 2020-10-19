package java1_05;

import java.util.Scanner;

public class InputEx02_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum = num1+num2;
		System.out.println(sum);
		
		System.out.print("숫자를 입력하세요: ");
		int num3 = scan.nextInt();
		System.out.println(num3%2 ==1);
		
		System.out.print("성적을 입력하세요: ");
		int score = scan.nextInt();
		System.out.println(score>=60 && score<=100);
	}

}
