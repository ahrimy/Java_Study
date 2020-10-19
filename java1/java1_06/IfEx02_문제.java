package java1_06;

import java.util.Scanner;

public class IfEx02_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int com = 8;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		num = scan.nextInt();
		
		if(num<com){
			System.out.println("Up");
		}else if(num==com){
			System.out.println("Bingo");
		}else{
			System.out.println("Down");
		}
	}

}
