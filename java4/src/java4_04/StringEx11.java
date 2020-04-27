package java4_04;

import java.util.Scanner;

public class StringEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String start = "자전거";
		String temp = "";
		while(true){
			System.out.println("제시어 : "+start);
			System.out.print("입력 : ");
			temp = scan.next();
			if(temp.charAt(0)!=start.charAt(start.length()-1)){
				System.out.println("불일치.게임종료");
				break;
			}
			start = temp;
		}
	}

}
