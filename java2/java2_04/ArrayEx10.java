package java2_04;

import java.util.Scanner;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] lotto1 = { 0, 0, 7, 7, 7, 0, 0, 0 };
		int[] lotto2 = { 7, 0, 7, 7, 0, 0, 0, 0 };
		int[] lotto3 = { 7, 0, 7, 7, 7, 0, 7, 0 };

		boolean run = true;
		while (run) {

			System.out.println("[1]������ ���Ȯ��");
			System.out.println("[2]������ ���Ȯ��");
			System.out.println("[3]������ ���Ȯ��");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			int count = 0;
			if (sel == 1) {
				for (int i = 0; i < 8; i++) {
					if (lotto1[i] == 7) {
						count++;
					} else {
						if (count < 3) {
							count = 0;
						}
					}
				}
				if (count >= 3) {
					System.out.println("��÷");
				} else {
					System.out.println("��");
				}
			} else if (sel == 2) {
				for (int i = 0; i < 8; i++) {
					if (lotto2[i] == 7) {
						count++;
					} else {
						if (count < 3) {
							count = 0;
						}
					}
				}
				if (count >= 3) {
					System.out.println("��÷");
				} else {
					System.out.println("��");
				}
			} else if (sel == 3) {
				for (int i = 0; i < 8; i++) {
					if (lotto3[i] == 7) {
						count++;
					} else {
						if (count < 3) {
							count = 0;
						}
					}
				}
				if (count >= 3) {
					System.out.println("��÷");
				} else {
					System.out.println("��");
				}
			}

		}

	}

}
