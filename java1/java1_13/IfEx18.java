package java1_13;
import java.util.Scanner;

public class IfEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이용할 정거장의 수 :");
		int stops = scan.nextInt();
		
		if(stops>=1 && stops<=5){
			System.out.println("500원");
		}else if(stops>=6 && stops<=10){
			System.out.println("600원");
		}else if(stops>10){
			int add = ((stops-9)/2)*50;
			System.out.println((600+add)+"원");
		}else{
			System.out.println("Error");
		}
		
	}

}
