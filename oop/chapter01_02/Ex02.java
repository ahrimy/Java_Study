package chapter01_02;

import java.util.Scanner;

class Cafe{
	static void read(){
		System.out.println("글을 읽는다.");
	}
	static void write(){
		System.out.println("글을 작성한다.");
	}
	static void delete(){
		System.out.println("글을 삭제한다.");
	}
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.println("회원의 등급을 입력하세요");
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
