package java1_05;

import java.util.Scanner;

public class InputEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		int num = scan.nextInt();
		System.out.println("입력하신 숫자는 "+num+"입니다.");
		
		System.out.println("나이를 입력하세요:");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 "+age+"세 입니다.");
		
		
	}

}
