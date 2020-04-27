package java1_12;

import java.util.Random;
import java.util.Scanner;

public class IfEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(2);
		System.out.print("가위(0)바위(1)보(2):");
		int me = scan.nextInt();
		if(com==me){
			System.out.println("Draw");
		}else if(com==0 &&me==1){
			System.out.println("Win");
		}else if(com==1&&me==2){
			System.out.println("Win");
		}else if(com==2&&me==0){
			System.out.println("Win");
		}else{
			System.out.println("Lose");
		}
		System.out.println(com);
	}

}
