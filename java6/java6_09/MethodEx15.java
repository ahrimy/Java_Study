package java6_09;

import java.util.Scanner;

class BurgerShop {
	Scanner scan = new Scanner(System.in);
	String name = "�Ե�����"; // ���� �̸�

	int[] arPrice = { 2500, 3800, 1500, 1000 };
	String[] arMenu = { "ġ�����", "�Ұ�����", "����Ƣ��", "��      ��" };

	int[] arCount = new int[4];

	int total = 0;

	void showMenu() {
		System.out.println("=== " + name + " ===");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println("[" + (i + 1) + "]" + arMenu[i] + " : " + arPrice[i]);
		}
		System.out.println("[5]���ÿϷ�");
	}

	void select1() { arCount[0] += 1; }
	void select2() { arCount[1] += 1; }
	void select3() { arCount[2] += 1; }
	void select4() { arCount[3] += 1; }

	void getReceipt() {
		for(int i=0; i<arMenu.length; i++) {
			System.out.println((i + 1) + "." + arMenu[i] + " : " + arCount[i] + "��");
			total += arPrice[i] * arCount[i];
		}
		System.out.println("�� �ݾ� : " + total + "��");		


		System.out.print("���� �Է�: ");
		int cash = scan.nextInt();
		if (cash < total) {
			System.out.print("������ �����մϴ�");
		} else {
			System.out.println("=== �Ե����� ������ ===");
			for (int i = 0; i <arMenu.length; i++) {
				System.out.println("[" + (i + 1) + "]" + arMenu[i] + " : " + arCount[i]);
			}
			System.out.println("4. �� �ݾ�: " + total + "��");
			System.out.println("5. �ܵ�: " + (cash - total) + "��");
		}
	}

	void run() {
		showMenu();
		while(true) {
			// �޴� ���
			
			// �޴� ����
			System.out.print("�޴��� �����ϼ��� : ");
			int choice = scan.nextInt();
			
			// ġ�����
			if(choice == 1) { select1(); }
			// �Ұ�����
			else if(choice == 2) { select2(); }
			// ����Ƣ��
			else if(choice == 3) { select3(); }
			// �ݶ�
			else if(choice == 4) { select4(); }
			// ���� �� ������ ���
			else if(choice == 5) {
				getReceipt();
				break;
			}
		}		

	}

}

public class MethodEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BurgerShop moms = new BurgerShop();
		moms.name = "������ġ �ܹ���";

		moms.run();

	}

}
