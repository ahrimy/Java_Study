package java1_09;

import java.util.Scanner;

public class IfEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		int[] price = {8700,6200,1500};
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price[0] + "��");
		System.out.println("2.����    ���� : " + price[1] + "��");
		System.out.println("3.��         �� : " + price[2] + "��");
		
		System.out.print("�޴� �ֹ�: ");
		int order = scan.nextInt();
		System.out.print("����: ");
		int cash = scan.nextInt();
		if(cash<price[order-1]){
			System.out.print("������ �����մϴ�");
		}else{
			System.out.println("=== ������ ===");
			System.out.println("�ֹ� �ݾ�: "+price[order-1]+ "��");
			System.out.println("���� ����: " + cash + "��");
			System.out.println("�Ž�����: " + (cash-price[order-1]) + "��");
				
		}
		
	}

}
