package java1_17;
import java.util.Scanner;
public class WhileEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		int Acc = 0;
		int Pw = 0;
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log==-1){
					System.out.print("Enter ID,Password:");
					Acc = scan.nextInt();
					Pw = scan.nextInt();
					if(Acc==dbAcc1&&Pw==dbPw1){
						log=1;
						System.out.println("logged in");
					}else if(Acc==dbAcc2&&Pw==dbPw2){
						log=2;
						System.out.println("logged in");
					}else{
						System.out.println("Invalid");
					}
				}else{
					System.out.println("Already logged in");
				}
			}else if(sel == 2) {
				if(log==1||log==2){
					log=-1;
					System.out.println("logged out");

				}else{
					System.out.println("Haven't logged in");
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
