package java1_07;
import java.util.Scanner;

public class IfEx06_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int answer = num1*num2;
		System.out.print(num1 +" x "+num2+" = ");
		int myanswer = scan.nextInt();
		if(answer==myanswer){
			System.out.println("정답");
		}else{
			System.out.println("떙");
		}
		
		
		scan.close();
	}

}
