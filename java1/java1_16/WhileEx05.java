package java1_16;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] price = {8700,6200,1500};
		int[] order = {0,0,0};
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price[0] + "��");
		System.out.println("2.����    ���� : " + price[1] + "��");
		System.out.println("3.��         �� : " + price[2] + "��");
		int total=0;
		int select = 0;
		for(int i=0;i<5;i++){
			System.out.print("�޴� �ֹ�: ");
			select = scan.nextInt();
			order[select-1]++;
		}
		total = price[0]*order[0]+price[1]*order[1]+price[2]*order[2];
		System.out.println("�� �ݾ�  = "+total);
		System.out.print("���� �Է�: ");
		int cash = scan.nextInt();
		if(cash<total){
			System.out.print("������ �����մϴ�");
		}else{
			System.out.println("=== �Ե����� ������ ===");
			System.out.println("1. �Ұ�� ����: "+order[0]+"��");
			System.out.println("2. ���� ����: "+order[1]+"��");
			System.out.println("3. �ݶ�: "+order[2]+"��");
			System.out.println("4. �� �ݾ�: "+total+"��");
			System.out.println("5. �ܵ�: "+(cash-total)+"��");
				
		}
	}

}
