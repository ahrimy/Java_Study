package java4_04;

import java.util.Scanner;

public class StringEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String start = "������";
		String temp = "";
		while(true){
			System.out.println("���þ� : "+start);
			System.out.print("�Է� : ");
			temp = scan.next();
			if(temp.charAt(0)!=start.charAt(start.length()-1)){
				System.out.println("����ġ.��������");
				break;
			}
			start = temp;
		}
	}

}
