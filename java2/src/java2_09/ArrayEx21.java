package java2_09;

import java.util.Scanner;

public class ArrayEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0 };
		int cnt = 2;

		boolean run = true;

		while (run) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("[3]����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 3) {
				if (cnt >= 5) {
					System.out.println("���̻� �߰� �� �� ����.");
					run = false;
				} else {
					System.out.print("������ ��ġ �Է� : ");
					int idx = scan.nextInt();
					if (idx <= cnt && idx >= 0) {
						System.out.print("������ �� �Է� : ");
						int data = scan.nextInt();
						for (int i = cnt; i > idx; i--) {
							arr[i] = arr[i - 1];
						}
						arr[idx] = data;
						cnt++;
					}else{
						System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
						continue;


					}
				}

			}

		}

	}

}
