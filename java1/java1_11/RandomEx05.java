package java1_11;

import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;
public class RandomEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan =  new Scanner(System.in);
		int num1 = ran.nextInt(9)+1;
		int num2 = ran.nextInt(9)+1;
		int answer = num1*num2;
		System.out.print(num1 +" x "+num2+" = ");
		int myanswer = scan.nextInt();
		if(answer==myanswer){
			System.out.println("Á¤´ä");
		}else{
			System.out.println("‹¯");
		}
		
		
		scan.close();
	}

}
