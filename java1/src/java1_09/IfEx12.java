package java1_09;
import java.util.Scanner;
public class IfEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int max = 0;
		if(num1>num2){
			max = num1;
			if(num3>num1){
				max = num3;
			}
		}else{
			max = num2;
			if(num3>num2){
				max = num3;
			}
		}
		
		System.out.println("���� ū ���� "+ max+"�Դϴ�.");
	}

}
