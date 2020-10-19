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
			System.out.print("[1]관리자 [2]사용자 [0]종료 : ");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("[관리자 모드]");
				while (true) {
					System.out.println("잔여 식권 : " + ticket);
					System.out.println("잔돈 총 금액 : " + total);
					for (int i = 0; i < 6; i++) {
						System.out.println(moneys[i] + " : " + mCounts[i]);
					}
					System.out.print("[1]식권충전 [2]잔돈충전 [3]뒤로가기 : ");
					int input = scan.nextInt();
					if (input == 1) {
						System.out.print("충전 개수: ");
						input = scan.nextInt();
						ticket += input;

					} else if (input == 2) {
						for (int i = 0; i < 6; i++) {

							System.out.print(moneys[i] + "원권: ");
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
				System.out.print("구매 매수:");
				int amount = scan.nextInt();
				if (amount > ticket) {
					System.out.println("식권부족");
				} else {
					amount = 3200 * amount;
					System.out.println("입금 금액");
					int[] inputM = new int[6];
					int input = 0;
					for (int i = 0; i < 6; i++) {
						System.out.print(moneys[i] + "원:");
						inputM[i] = scan.nextInt();
						input += inputM[i] * moneys[i];
					}
					System.out.println("입금 총액 :" + input+"원");
					if (input < amount) {
						System.out.println(amount - input + "원 부족");
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

							System.out.println("잔돈 :" + charge + "원");
							for (int i = 0; i < 6; i++) {
								total -= charge;
								mCounts[i] -= charges[i];
								System.out.println(moneys[i] + "원 " + charges[i] + "개");
							}
							ticket -= amount / 3200;

						} else {
							System.out.println("잔돈 부족, 구매 자동 취소");
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
