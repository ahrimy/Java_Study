package java4_18;

import java.util.Scanner;

public class FileEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ticket = 0;
		int moneys[] = { 50000, 10000, 5000, 1000, 500, 100 };
		int[] mCounts = new int[6];
		int total = 0;
		while (true) {
			System.out.print("[1]������ [2]����� [0]���� : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("[������ ���]");
				while (true) {
					System.out.println("�ܿ� �ı� : " + ticket);
					System.out.println("�ܵ� �� �ݾ� : " + total);
					for (int i = 0; i < 6; i++) {
						System.out.println(moneys[i] + " : " + mCounts[i]);
					}
					System.out.print("[1]�ı����� [2]�ܵ����� [3]�ڷΰ��� : ");
					int input = scan.nextInt();
					if (input == 1) {
						System.out.print("���� ����: ");
						input = scan.nextInt();
						ticket += input;

					} else if (input == 2) {
						for (int i = 0; i < 6; i++) {

							System.out.print(moneys[i] + "����: ");
							input = scan.nextInt();
							mCounts[i] += input;
							total += (moneys[i] * input);
						}
					} else if (input == 3) {
						break;
					} else {

					}
				}
			} else if (sel == 2) {
				System.out.print("���� �ż�:");
				int amount = scan.nextInt();
				if (amount > ticket) {
					System.out.println("�ıǺ���");
				} else {
					amount = 3200 * amount;
					System.out.println("�Ա� �ݾ�");
					int[] inputM = new int[6];
					int input = 0;
					for (int i = 0; i < 6; i++) {
						System.out.print(moneys[i] + "��:");
						inputM[i] = scan.nextInt();
						input += inputM[i] * moneys[i];
					}
					System.out.println("�Ա� �Ѿ� :" + input+"��");
					if (input < amount) {
						System.out.println(amount - input + "�� ����");
					} else {
						total += input;
						for (int i = 0; i < 6; i++) {
							mCounts[i] += inputM[i];
						}
						int charge = input - amount;

						int[] charges = new int[6];
						int temp = charge;
						for (int i = 0; i < 6; i++) {
							int cnt = temp / moneys[i];
							if (mCounts[i] >= cnt) {
								charges[i] = cnt;
								temp -= (cnt * moneys[i]);
							}
						}
						if (temp == 0) {

							System.out.println("�ܵ� :" + charge + "��");
							for (int i = 0; i < 6; i++) {
								total -= charge;
								mCounts[i] -= charges[i];
								System.out.println(moneys[i] + "�� " + charges[i] + "��");
							}
							ticket -= amount / 3200;

						} else {
							System.out.println("�ܵ� ����, ���� �ڵ� ���");
							for (int i = 0; i < 6; i++) {
								mCounts[i] -= inputM[i];
							}
							total -= input;
						}
					}
				}

			} else if (sel == 0) {
				break;
			} else {

			}
		}
	}

}
