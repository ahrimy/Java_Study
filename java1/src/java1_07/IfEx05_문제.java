package java1_07;

import java.util.Scanner;

public class IfEx05_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<ȸ������>>");
		Scanner scan = new Scanner(System.in);
		System.out.print("ȸ������ ID�� �Է��ϼ���: ");
		int dbId = scan.nextInt();
		System.out.print("ȸ������ Pw�� �Է��ϼ���: ");
		int dbPw = scan.nextInt();
		System.out.println("������ �����մϴ�.");
		System.out.println("<<�α���>>");
		System.out.print("ID�� �Է��ϼ���: ");
		int Id = scan.nextInt();
		System.out.print("Pw�� �Է��ϼ���: ");
		int Pw = scan.nextInt();
		if(dbId==Id &&dbPw==Pw){
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
		
		scan.close();
	}

}
