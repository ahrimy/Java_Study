package java1_07;
import java.util.Scanner;
public class IfEx04_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dbId = 1234;
		int dbPw = 1111;
		Scanner scan = new Scanner(System.in);
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
