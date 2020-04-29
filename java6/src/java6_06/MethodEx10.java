package java6_06;

import java.util.Scanner;

class Ex10 {

	String name = "";

	int[] arHakbun = { 1001, 1002, 1003, 1004, 1005 };
	int[] arScore = { 92, 38, 87, 100, 11 };

	void choice1() {
		for (int i = 0; i < arHakbun.length; i++) {
			System.out.println(arHakbun[i] + " : " + arScore[i]);
		}
	}

	void choice2() {
		int max = 0;
		int idx = -1;
		for (int i = 0; i < arHakbun.length; i++) {
			if (arScore[i] > max) {
				max = arScore[i];
				idx = i;
			}
		}
		System.out.println("1��:" + arHakbun[idx] + " / " + max);
	}

	void choice3() {
		int min = 100;
		int idx = -1;
		for (int i = 0; i < arHakbun.length; i++) {
			if (arScore[i] < min) {
				min = arScore[i];
				idx = i;
			}
		}
		System.out.println("�õ�:" + arHakbun[idx] + " / " + min);
	}

	void choice4(int hakbun) {
		int idx = -1;
		for (int i = 0; i < arHakbun.length; i++) {
			if (arHakbun[i] == hakbun) {
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println(arHakbun[idx] + " : " + arScore[idx]);
		}
	}

}

public class MethodEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Ex10 mega = new Ex10();
		mega.name = "�ް�IT ����б�";

		while (true) {
			// �޴� ���
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.(�й��� �Է¹޾�)����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");

			// �޴� ����
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();

			if (choice == 1) {
				mega.choice1();
			} else if (choice == 2) {
				mega.choice2();
			} else if (choice == 3) {
				mega.choice3();
			} else if (choice == 4) {
				System.out.print("�й��� �Է��ϼ���:");
				int num = scan.nextInt();
				mega.choice4(num);
			} else if (choice == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

}
