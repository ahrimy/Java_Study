package java1_08;
import java.util.Scanner;
public class IfEx08_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ���: ");
		int height = scan.nextInt();
		if(height>=120){
			System.out.println("�̿밡��");
		}else{
			System.out.print("�θ�԰� �Բ� ���̳���?(yes:1,no:0)");
			int withpar = scan.nextInt();

			if(withpar == 1){
				System.out.println("�̿밡��");
			}else{
				System.out.println("�̿�Ұ�");
			}
		}
	}

}
