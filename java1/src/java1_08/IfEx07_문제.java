package java1_08;
import java.util.Scanner;
public class IfEx07_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score = scan.nextInt();
		if(score<0||score>100){
			System.out.println("������ �߸� �Է��߽��ϴ�.");
		}
		else if(score>=60){
			System.out.println("�հ�");
		}else{
			System.out.println("���հ�");
		}
	}

}
