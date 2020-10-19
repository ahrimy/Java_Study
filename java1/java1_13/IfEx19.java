package java1_13;
import java.util.Random;
import java.util.Scanner;

public class IfEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num1 = ran.nextInt(10)+1;
		int num2 = ran.nextInt(10)+1;
		int op = ran.nextInt(4)+1;
		int result = 0;
		if(op==1){
			result = num1+num2;
			System.out.println(num1+" ? "+num2+" = "+result);
		}else if(op==2){
			result = num1-num2;
			System.out.println(num1+" ? "+num2+" = "+result);
		}else if(op==3){
			result = num1*num2;
			System.out.println(num1+" ? "+num2+" = "+result);
		}else if(op==4){
			result = num1%num2;
			System.out.println(num1+" ? "+num2+" = "+result);
		}else{
			System.out.println("Error");
		}
		System.out.print("1) + 2) - 3) * 4) % :");
		int myAnswer = scan.nextInt();
		if(myAnswer==op){
			System.out.println("정답");
		}else{
			System.out.println("오답 (" + op +")");
		}
	}

}
