package java1_05;

import java.util.Scanner;

public class InputEx02_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum = num1+num2;
		System.out.println(sum);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num3 = scan.nextInt();
		System.out.println(num3%2 ==1);
		
		System.out.print("������ �Է��ϼ���: ");
		int score = scan.nextInt();
		System.out.println(score>=60 && score<=100);
	}

}
