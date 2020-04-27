package java1_12;

import java.util.Scanner;
public class IfEx15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cash = 20000;
		int balance = 30000;
		int account = 11111;
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int select = scan.nextInt();
		if(select==1){
			System.out.print("Enter the account number and the password:");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			if(acc==account&&password==pw){
				System.out.print("1.입금 2.출금 3.조회");
				select = scan.nextInt();
				if(select==1){
					System.out.print("입금할 금액:");
					int deposit = scan.nextInt();
					cash = cash-deposit;
					balance = balance+deposit;
					System.out.println("balance: " + balance + "원");
				}else if(select==2){
					System.out.print("출금할 금액:");
					int withdraw = scan.nextInt();
					cash = cash+withdraw;
					balance = balance-withdraw;
					System.out.println("balance: " + balance + "원");
				}else if(select==3){
					System.out.println("조회: "+balance+"원");
				}
			}
			else{
				System.out.println("아이디와 패스워드를 확인하세요");
			}
		}
		else if(select==2){
			System.out.println("종료");
		}

	}

}
