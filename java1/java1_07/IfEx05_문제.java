package java1_07;

import java.util.Scanner;

public class IfEx05_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<회원가입>>");
		Scanner scan = new Scanner(System.in);
		System.out.print("회원가입 ID를 입력하세요: ");
		int dbId = scan.nextInt();
		System.out.print("회원가입 Pw를 입력하세요: ");
		int dbPw = scan.nextInt();
		System.out.println("가입을 축하합니다.");
		System.out.println("<<로그인>>");
		System.out.print("ID를 입력하세요: ");
		int Id = scan.nextInt();
		System.out.print("Pw를 입력하세요: ");
		int Pw = scan.nextInt();
		if(dbId==Id &&dbPw==Pw){
			System.out.println("Success");
		}else{
			System.out.println("Fail");
		}
		
		scan.close();
	}

}
