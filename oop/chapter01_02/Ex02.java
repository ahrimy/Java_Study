package chapter01_02;

import java.util.Scanner;

class Cafe{
	static void read(){
		System.out.println("���� �д´�.");
	}
	static void write(){
		System.out.println("���� �ۼ��Ѵ�.");
	}
	static void delete(){
		System.out.println("���� �����Ѵ�.");
	}
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.println("ȸ���� ����� �Է��ϼ���");
		int level = scan.nextInt();
		
		switch(level){
		case 1:
			Cafe.delete();
		case 2:
			Cafe.write();
		case 3:
			Cafe.read();
		}
	}

}
