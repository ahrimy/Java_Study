package java1_08;
import java.util.Scanner;
public class IfEx09_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dbId = 1234;
		int dbPw = 1111;
		Scanner scan = new Scanner(System.in);
		System.out.print("ID�� �Է��ϼ���: ");
		int Id = scan.nextInt();
		if(dbId==Id){
			System.out.print("Pw�� �Է��ϼ���: ");
			int Pw = scan.nextInt();
			if(dbPw==Pw){
				System.out.println("Success");
			}else{
				System.out.println("Pw�� Ȯ�����ּ���");
			}
		}else{
			System.out.println("ID�� Ȯ�����ּ���");
		}
		scan.close();
	}

}
