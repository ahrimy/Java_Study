package java5_05;

import java.util.Scanner;

class Ex10{
	String name = "";		// ���� �̸�
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"ġ�����", "�Ұ�����", "����Ƣ��", "��      ��"};
	
	int[] arCount = new int[4];
	
	int total = 0;

}
public class ClassEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
Ex10 e =new Ex10();
		System.out.println("=== �Ե����� ===");
for(int i=0;i<e.arMenu.length;i++){
	System.out.println("["+(i+1)+"]"+e.arMenu[i]+" : "+e.arPrice[i]);
}
		
		int select = 0;
		for(int i=0;i<5;i++){
			System.out.print("�޴� �ֹ�: ");
			select = scan.nextInt();
			e.arCount[select-1]++;
		}
		e.total = e.arPrice[0]*e.arCount[0]+e.arPrice[1]*e.arCount[1]+e.arPrice[2]*e.arCount[2];
		System.out.println("�� �ݾ�  = "+e.total);
		System.out.print("���� �Է�: ");
		int cash = scan.nextInt();
		if(cash<e.total){
			System.out.print("������ �����մϴ�");
		}else{
			System.out.println("=== �Ե����� ������ ===");
			for(int i=0;i<e.arMenu.length;i++){
				System.out.println("["+(i+1)+"]"+e.arMenu[i]+" : "+e.arCount[i]);
			}
			System.out.println("4. �� �ݾ�: "+e.total+"��");
			System.out.println("5. �ܵ�: "+(cash-e.total)+"��");
				
		}
	}

}
