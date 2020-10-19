package java3_05;

import java.util.Scanner;

public class ArrayEx32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int MAX = 5;

		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];

		int cnt = 0;
		int log = -1;

		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";

		while (true) {

			System.out.println(menu);

			int sel = scan.nextInt();

			if (sel == 1) {
				if (cnt < MAX) {
					System.out.print("Enter a new Id: ");
					int check = 0;
					int input = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (input == arId[i]) {
							System.out.println("Already exist id");
							check = 1;
							break;
						}
					}
					if (check == 0) {
						arId[cnt] = input;
						System.out.print("Enter a password: ");
						input = scan.nextInt();
						arPw[cnt] = input;
						arMoney[cnt] = 1000;
						cnt++;
					}
				} else {
					System.out.println("Account storage is full");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {

					for (int j = log; j < cnt; j++) {
						if (j + 1 == cnt) {
							arId[j] = 0;
							arPw[j] = 0;
						} else {
							arId[j] = arId[j + 1];
							arPw[j] = arPw[j + 1];
						}
					}
					System.out.println("Have deleted Account " + arId[log]);
					cnt--;
					log = -1;

				}
			} else if (sel == 3) {
				if (log == -1) {
					int check = 0;
					System.out.print("Enter an Id:");
					int input = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (arId[i] == input) {
							check = 1;
							System.out.print("Enter a Password:");
							input = scan.nextInt();
							if (arPw[i] == input) {
								log = i;
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
					System.out.println("Account " + arId[log] + "is logging in");
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Account" + arId[log] + "Sucessfully logged out");
					log = -1;
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.print("Enter the amount of cash:");
					int input = scan.nextInt();
					arMoney[log] += input;
					System.out.println("[Result]Account" + arId[log] + "balance : " + arMoney[log]);
				}
			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					int check = 0;
					System.out.print("Enter an Id to transfer:");
					int input = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (arId[i] == input) {
							check = 1;
							if (i == log) {
								System.out.println("You can't send to the same account");
							} else {
								System.out.print("How much are you transfering?:");
								input = scan.nextInt();
								if (arMoney[log] >= input) {
									arMoney[log] -= input;
									arMoney[i] += input;
									System.out.println("[Sent]Account" + arId[log] + "balance : " + arMoney[log]);
									System.out.println("[Received]Account" + arId[i] + "balance : " + arMoney[i]);
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
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Account" + arId[log] + "balance : " + arMoney[log]);
				}
			} else if (sel == 0) {
				break;
			}
		}

	}

}
