package java1_19;
import java.util.Scanner;
public class WhileEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int max = 0;
		for(int i=0;i<3;i++){
			System.out.print("���ڸ� �Է��ϼ���: ");
			num = scan.nextInt();
			if(num>max){
				max = num;
			}
		}
		System.out.println("���� ū ���� "+ max+"�Դϴ�.");
	}

}
