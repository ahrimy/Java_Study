package java3_11;

import java.util.Scanner;

public class ArrayEx44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String[][] items = new String[100][2];
		for (int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		int ctgryCount = 0;
		int itemCount = 0;

		while (true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");

			System.out.print(": ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("[카테고리 관리]");
				System.out.println("[1]카테고리 추가");
				System.out.println("[2]카테고리 삭제");

				System.out.print(": ");
				int choice = scan.nextInt();
				if (choice == 1) {
					if (ctgryCount < 100) {
						System.out.print("Enter the category name:");
						String cName = scan.next();
						int check = 0;
						for (int i = 0; i < ctgryCount; i++) {
							if (items[i][0].equals(cName)) {
								System.out.println("This category exists");
								check = 1;
								break;
							}
						}
						if (check == 0) {
							items[ctgryCount++][0] = cName;
						}
					} else {
						System.out.println("Category storage is full");
					}
				} else if (choice == 2) {
					if (ctgryCount > 0) {
						System.out.print("Enter the category name:");
						String cName = scan.next();
						int check = 0;
						int dNum = 0;
						for (int i = 0; i < ctgryCount; i++) {
							if (items[i][0].equals(cName)) {
								dNum = i;
								check = 1;
								break;
							}
						}
						if (check == 0) {
							System.out.println("There is no category named " + cName);
						} else {
							for (int i = dNum; i < ctgryCount; i++) {
								if (i + 1 == ctgryCount) {
									items[i][0] = " ";
									items[i][1] = " ";
								} else {
									items[i] = items[i + 1];
								}
							}
							ctgryCount--;
						}
					} else {
						System.out.println("Category is empty");
					}
				}
			} else if (sel == 2) {
				System.out.println("[아이템 관리]");
				System.out.println("[1]아이템 추가");
				System.out.println("[2]아이템 삭제");

				System.out.print(": ");
				int choice = scan.nextInt();
				if (choice == 1) {

					System.out.print("Which category do you want to put item in?:");
					String cName = scan.next();
					int check = 0;
					for (int i = 0; i < ctgryCount; i++) {
						if (items[i][0].equals(cName)) {
							System.out.print("Enter the item name:");
							String iName = scan.next();
							items[i][1] += iName;
							items[i][1] += '/';
							check = 1;
							break;
						}
					}
					if (check == 0) {
						System.out.println("There is no category named " + cName);
					}

				} else if (choice == 2) {
				}

			} else if (sel == 3) {
				for (int i = 0; i < ctgryCount; i++) {
					System.out.println("[" + i + "] " + items[i][0] + " " + items[i][1]);
				}
			}

		}

	}

}
