package java1_07;
import java.util.Scanner;
public class IfEx04_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dbId = 1234;
		int dbPw = 1111;
		Scanner scan = new Scanner(System.in);
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
