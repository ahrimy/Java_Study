package java1_08;
import java.util.Scanner;
public class IfEx09_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dbId = 1234;
		int dbPw = 1111;
		Scanner scan = new Scanner(System.in);
		System.out.print("ID를 입력하세요: ");
		int Id = scan.nextInt();
		if(dbId==Id){
			System.out.print("Pw를 입력하세요: ");
			int Pw = scan.nextInt();
			if(dbPw==Pw){
				System.out.println("Success");
			}else{
				System.out.println("Pw를 확인해주세요");
			}
		}else{
			System.out.println("ID를 확인해주세요");
		}
		scan.close();
	}

}
