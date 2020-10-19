package java1_12;
import java.util.Scanner;
import java.util.Random;

public class IfEx16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(101)+150;
		
		int mNum = (rNum%100)/10;
		
		System.out.print("Enter a number:");
		int myAnswer = scan.nextInt();
		
		if(mNum==myAnswer){
			System.out.println("정답,  "+rNum);
		}else{
			System.out.println("오답,  "+rNum);
		}
	}
	
}
