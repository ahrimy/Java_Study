package java3_11;

import java.util.Scanner;

public class ArrayEx45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };

		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		int count = 0;

		String[] items = { "���", "�ٳ���", "����" };

		int log = -1;

		while (true) {

			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					int check = 0;
					System.out.print("Enter an Id:");
					String input = scan.next();
					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(input)) {
							check = 1;
							System.out.print("Enter a Password:");
							input = scan.next();
							if (pws[i].equals(input)) {
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
					System.out.println("Account " + ids[log] + " is logging in");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					System.out.println("Account " + ids[log] + " Sucessfully logged out");
					log = -1;
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					while (true) {
						System.out.println("[1]���� ����");
						System.out.println("[2]�ڷΰ���");
						int choice = scan.nextInt();
						if (choice == 1) {
							if (count < MAX_SIZE) {
								for (int i = 0; i < items.length; i++) {
									System.out.println("(" + (i + 1) + ") " + items[i]);
								}
								System.out.print("Select item number:");
								int iNum = scan.nextInt();
								jang[count][0] = log;
								jang[count][1] = iNum;
								count++;
							} else {
								System.out.println("Cart is full");
							}
						} else {
							break;
						}
					}
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("Haven't logged in");
				} else {
					int apple = 0;
					int banana = 0;
					int strawberry = 0;
					
					for(int i=0;i<count;i++){
						if(jang[i][0]==log){
							if(jang[i][1]==1){apple++;}
							else if (jang[i][1]==2){banana++;}
							else if(jang[i][1]==3){strawberry++;}
						}
					}
					System.out.println("Apple:"+apple);
					System.out.println("Banana:"+banana);
					System.out.println("Strawberry:"+strawberry);
				}
			} else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

}
