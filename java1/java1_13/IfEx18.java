package java1_13;
import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̿��� �������� �� :");
		int stops = scan.nextInt();
		
		if(stops>=1 && stops<=5){
			System.out.println("500��");
		}else if(stops>=6 && stops<=10){
			System.out.println("600��");
		}else if(stops>10){
			int add = ((stops-9)/2)*50;
			System.out.println((600+add)+"��");
		}else{
			System.out.println("Error");
		}
		
	}

}
