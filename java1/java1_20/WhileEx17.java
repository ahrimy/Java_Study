package java1_20;

import java.util.Scanner;

public class WhileEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {

			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				boolean exit = true;
				while (exit) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("3)뒤로가기");
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if (choice == 1) {
					} else if (choice == 2) {
					} else if (choice == 3) {
						exit = false;
					}
				}
			} else if (sel == 2) {
			} else if (sel == 3) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
