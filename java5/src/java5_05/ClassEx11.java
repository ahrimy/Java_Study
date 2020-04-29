package java5_05;

import java.util.Scanner;

class Ex11 {
	String name = "";

	String[] arAcc = { "1111", "2222", "3333", "4444", "5555" };
	String[] arPw = { "1234", "2345", "3456", "4567", "5678" };
	int[] arMoney = { 87000, 34000, 17500, 98000, 12500 };

	int count = 5;

	// 3333 로그인 중
	int loginCheck = 2;
}

public class ClassEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Ex11 e = new Ex11();
		int MAX = 5;

		


	
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";

		while (true) {

			System.out.println(menu);

			int sel = scan.nextInt();

			if (sel == 1) {
				if (e.count < MAX) {
					System.out.print("Enter a new Id: ");
					int check = 0;
					String input = scan.next();
					for (int i = 0; i < e.count; i++) {
						if (input.equals(e.arAcc[i])) {
							System.out.println("Already exist id");
							check = 1;
							break;
						}
					}
					if (check == 0) {
						e.arAcc[e.count] = input;
						System.out.print("Enter a password: ");
						input = scan.next();
						e.arPw[e.count] = input;
						e.arMoney[e.count] = 1000;
						e.count++;
					}
				} else {
					System.out.println("Account storage is full");
				}
			} else if (sel == 2) {
				if (e.loginCheck == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Have deleted Account " + e.arAcc[e.loginCheck]);
					for (int j = e.loginCheck; j < e.count; j++) {
						if (j + 1 == e.count) {
							e.arAcc[j] = "";
							e.arPw[j] = "";
						} else {
							e.arAcc[j] = e.arAcc[j + 1];
							e.arPw[j] = e.arPw[j + 1];
						}
					}
	
					e.count--;
					e.loginCheck = -1;

				}
			} else if (sel == 3) {
				if (e.loginCheck == -1) {
					int check = 0;
					System.out.print("Enter an Id:");
					String input = scan.next();
					for (int i = 0; i < e.count; i++) {
						if (e.arAcc[i].equals(input)) {
							check = 1;
							System.out.print("Enter a Password:");
							input = scan.next();
							if (e.arPw[i].equals(input)) {
								e.loginCheck = i;
								System.out.println("Complete logging in");
							} else {
								System.out.println("Password is not correct");
							}
							break;
						}
					}
					if (check == 0) {
						System.out.println("This Id does not exist");
					}

				} else {
					System.out.println("Account " + e.arAcc[e.loginCheck] + "is logging in");
				}
			} else if (sel == 4) {
				if (e.loginCheck == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Account" + e.arAcc[e.loginCheck] + "Sucessfully logged out");
					e.loginCheck = -1;
				}
			} else if (sel == 5) {
				if (e.loginCheck == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.print("Enter the amount of cash:");
					int input = scan.nextInt();
					e.arMoney[e.loginCheck] += input;
					System.out.println("[Result]Account" + e.arAcc[e.loginCheck] + "balance : " + e.arMoney[e.loginCheck]);
				}
			} else if (sel == 6) {
				if (e.loginCheck == -1) {
					System.out.println("Haven't logged in");
				} else {
					int check = 0;
					System.out.print("Enter an Id to transfer:");
					String input = scan.next();
					for (int i = 0; i < e.count; i++) {
						if (e.arAcc[i].equals(input)) {
							check = 1;
							if (i == e.loginCheck) {
								System.out.println("You can't send to the same account");
							} else {
								System.out.print("How much are you transfering?:");
								int money = scan.nextInt();
								if (e.arMoney[e.loginCheck] >= money) {
									e.arMoney[e.loginCheck] -= money;
									e.arMoney[i] += money;
									System.out.println("[Sent]Account" + e.arAcc[e.loginCheck] + "balance : " + e.arMoney[e.loginCheck]);
									System.out.println("[Received]Account" + e.arAcc[i] + "balance : " + e.arMoney[i]);
								} else {
									System.out.println("Balance is not enough");
								}
							}
							break;
						}
					}
					if (check == 0) {
						System.out.println("This Id does not exist");
					}
				}
			} else if (sel == 7) {
				if (e.loginCheck == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Account" + e.arAcc[e.loginCheck] + "balance : " + e.arMoney[e.loginCheck]);
				}
			} else if (sel == 0) {
				break;
			}
		}
	}

}
