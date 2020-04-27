package java2_09;

import java.util.Scanner;

public class ArrayEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };
		int cnt = 5;

		boolean run = true;
		while (run) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("[2]삭제");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 2) {
				if (cnt == 0) {
					System.out.println("삭제할 값 없음");
					run = false;
				} else {
					System.out.print("삭제할 값 입력 : ");
					int data = scan.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (data == arr[i]) {
							for (int j = i; j < cnt; j++) {
								if (j + 1 == cnt) {
									arr[j] = 0;
								} else {
									arr[j] = arr[j + 1];
								}
							}
							cnt--;
						}
					}

				}
			}

		}

	}

}
