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
		System.out.println("1.�α��� 2.����");
		int select = scan.nextInt();
		if(select==1){
			System.out.print("Enter the account number and the password:");
			int acc = scan.nextInt();
			int pw = scan.nextInt();
			if(acc==account&&password==pw){
				System.out.print("1.�Ա� 2.��� 3.��ȸ");
				select = scan.nextInt();
				if(select==1){
					System.out.print("�Ա��� �ݾ�:");
					int deposit = scan.nextInt();
					cash = cash-deposit;
					balance = balance+deposit;
					System.out.println("balance: " + balance + "��");
				}else if(select==2){
					System.out.print("����� �ݾ�:");
					int withdraw = scan.nextInt();
					cash = cash+withdraw;
					balance = balance-withdraw;
					System.out.println("balance: " + balance + "��");
				}else if(select==3){
					System.out.println("��ȸ: "+balance+"��");
				}
			}
			else{
				System.out.println("���̵�� �н����带 Ȯ���ϼ���");
			}
		}
		else if(select==2){
			System.out.println("����");
		}

	}

}
