package java4_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int MAX = 5;

		int[] accs = new int[MAX];
		int[] pws = new int[MAX];
		int[] moneys = new int[MAX];

		int cnt = 0;
		int log = -1;

		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.출금\n8.잔액조회\n9.저장\n10.로드\n0.종료";
		String fileName = "atm.txt";
		while (true) {

			System.out.println(menu);

			int sel = scan.nextInt();

			if (sel == 1) {
				if (cnt < MAX) {
					System.out.print("Enter a new Id: ");
					int check = 0;
					int input = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (input == accs[i]) {
							System.out.println("Already exist id");
							check = 1;
							break;
						}
					}
					if (check == 0) {
						accs[cnt] = input;
						System.out.print("Enter a password: ");
						input = scan.nextInt();
						pws[cnt] = input;
						moneys[cnt] = 1000;
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
							accs[j] = 0;
							pws[j] = 0;
						} else {
							accs[j] = accs[j + 1];
							pws[j] = pws[j + 1];
						}
					}
					System.out.println("Have deleted Account " + accs[log]);
					cnt--;
					log = -1;

				}
			} else if (sel == 3) {
				if (log == -1) {
					int check = 0;
					System.out.print("Enter an Id:");
					int input = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (accs[i] == input) {
							check = 1;
							System.out.print("Enter a Password:");
							input = scan.nextInt();
							if (pws[i] == input) {
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
					System.out.println("Account " + accs[log] + "is logging in");
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Account" + accs[log] + "Sucessfully logged out");
					log = -1;
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.print("Enter the amount of cash:");
					int input = scan.nextInt();
					moneys[log] += input;
					System.out.println("[Result]Account" + accs[log] + "balance : " + moneys[log]);
				}
			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					int check = 0;
					System.out.print("Enter an Id to transfer:");
					int input = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (accs[i] == input) {
							check = 1;
							if (i == log) {
								System.out.println("You can't send to the same account");
							} else {
								System.out.print("How much are you transfering?:");
								input = scan.nextInt();
								if (moneys[log] >= input) {
									moneys[log] -= input;
									moneys[i] += input;
									System.out.println("[Sent]Account" + accs[log] + "balance : " + moneys[log]);
									System.out.println("[Received]Account" + accs[i] + "balance : " + moneys[i]);
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
					System.out.print("Enter the withdrawal amount:");
					int input = scan.nextInt();
					if (moneys[log] >= input) {
						moneys[log] -= input;
						System.out.println("[Result]Account" + accs[log] + "balance : " + moneys[log]);

					} else {
						System.out.println("Not enough balance");
					}
				}
			} else if (sel == 8) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Account" + accs[log] + "balance : " + moneys[log]);
				}
			} else if (sel == 9) {
				if (cnt == 0) {
					System.out.println("Account storage is empty");
				} else {
					String data = "";
					FileWriter fw = null;
					try {
						fw = new FileWriter(fileName);
						for (int i = 0; i < cnt; i++) {
							data = accs[i] + " " + pws[i] + " " + moneys[i] + "\n";
							fw.write(data);
						}
						fw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else if (sel == 10) {
				String data = "";
				int size = 0;
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;
				if (file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);

						while (true) {
							String line = br.readLine();
							if (line == null) {
								break;
							}
							data += line;
							data += "\n";
						}
						data = data.substring(0, data.length() - 1);

						String[] temp = data.split("\n");
						size = temp.length;

						for (int i = 0; i < size; i++) {
							String[] info = temp[i].split(" ");
							accs[i] = Integer.parseInt(info[0]);
							pws[i] = Integer.parseInt(info[1]);
							moneys[i] = Integer.parseInt(info[2]);
							cnt = size;
						}
						fr.close();
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					

				}

			} else if (sel == 0) {

				break;
			}
		}
	}

}
