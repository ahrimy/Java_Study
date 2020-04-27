package java2_13;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		String num = scan.next();
		int length = num.length();
		
		if(length%2==0){
			System.out.println("짝수 자리이다");
		}else{
			int middle = length/2;
			System.out.println("Middle number is "+num.charAt(middle));
		}
		
		
	}

}
