package java1_06;

import java.util.Scanner;

public class IfEx02_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int com = 8;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		num = scan.nextInt();
		
		if(num<com){
			System.out.println("Up");
		}else if(num==com){
			System.out.println("Bingo");
		}else{
			System.out.println("Down");
		}
	}

}
