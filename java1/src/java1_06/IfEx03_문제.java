package java1_06;

import java.util.Scanner;

public class IfEx03_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = 1;
		int me = -1;
		System.out.print("가위(0)바위(1)보(2) 입력: ");
		Scanner scan = new Scanner(System.in);
		
		me = scan.nextInt();
		
		if(me<com){
			System.out.println("Lose");
		}else if(me==com){
			System.out.println("Draw");
		}else{
			System.out.println("Win");
		}
	}

}
