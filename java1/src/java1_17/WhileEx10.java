package java1_17;

import java.util.Scanner;

public class WhileEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		int Acc = 0;
		int Pw = 0;
		boolean run = true;
		while (run) {

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int money = 0;
			int acc = 0;
			if (sel == 1) {
				if (log == -1) {
					System.out.print("Enter ID,Password:");
					Acc = scan.nextInt();
					Pw = scan.nextInt();
					if (Acc == dbAcc1 && Pw == dbPw1) {
						log = 1;
						System.out.println("logged in");
					} else if (Acc == dbAcc2 && Pw == dbPw2) {
						log = 2;
						System.out.println("logged in");
					} else {
						System.out.println("Invalid");
					}
				} else if (log == 1) {
					System.out.println("Acc1 is logging in");
				} else {
					System.out.println("Acc2 is logging in");
				}
			} else if (sel == 2) {
				if (log == 1 || log == 2) {
					log = -1;
					System.out.println("logged out");

				} else {
					System.out.println("Haven't logged in");
				}
			} else if (sel == 3) {
				if (log == 1) {
					System.out.print("Amount:");
					money = scan.nextInt();
					dbMoney1 += money;
					System.out.println("Deposit Success, " + dbMoney1);
				} else if (log == 2) {
					System.out.print("Amount:");
					money = scan.nextInt();
					dbMoney2 += money;
					System.out.println("Deposit Success, " + dbMoney2);
				} else {
					System.out.println("Haven't logged in");
				}
			} else if (sel == 4) {
				if (log == 1) {
					System.out.print("Amount:");
					money = scan.nextInt();
					if (dbMoney1 >= money) {
						dbMoney1 -= money;
						System.out.println("Withdraw Success, " + dbMoney1);
					} else {
						System.out.println("Balance is not enough");
					}
				} else if (log == 2) {
					System.out.print("Amount:");
					money = scan.nextInt();
					if (dbMoney2 >= money) {
						dbMoney2 -= money;
						System.out.println("Withdraw Success, " + dbMoney2);
					} else {
						System.out.println("Balance is not enough");
					}
				} else {
					System.out.println("Haven't logged in");
				}
			} else if (sel == 5) {
				if (log == 1) {
					System.out.print("Enter the account number:");
					acc = scan.nextInt();
					if (acc == dbAcc2) {
						System.out.print("Enter the amount:");
						money = scan.nextInt();
						if (dbMoney1 >= money) {
							dbMoney1 -= money;
							dbMoney2 += money;
							System.out
									.println("Transfer Success, my balance:" + dbMoney1 + " your balance:" + dbMoney2);
						} else {
							System.out.println("Balance is not enough");
						}
					} else {
						System.out.println("Account number is invalid");
					}
				} else if (log == 2) {
					System.out.print("Enter the account number:");
					acc = scan.nextInt();
					if (acc == dbAcc1) {
						System.out.print("Enter the amount:");
						money = scan.nextInt();
						if (dbMoney2 >= money) {
							dbMoney2 -= money;
							dbMoney1 += money;
							System.out
									.println("Transfer Success, my balance:" + dbMoney2 + " your balance:" + dbMoney1);
						} else {
							System.out.println("Balance is not enough");
						}
					} else {
						System.out.println("Account number is invalid");
					}
				} else {
					System.out.println("Haven't logged in");
				}
			} else if (sel == 6) {
				if (log == 1) {
					System.out.println("myMoney:" + dbMoney1);
					System.out.println("yourMoney:" + dbMoney2);

				} else if (log == 2) {
					System.out.println("myMoney:" + dbMoney2);
					System.out.println("yourMoney:" + dbMoney1);

				} else {
					System.out.println("Haven't logged in");
				}
			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
