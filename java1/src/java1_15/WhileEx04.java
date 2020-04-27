package java1_15;

import java.util.Random;
import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan =  new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int answer = 0;
		int myanswer = 0;
		int score = 0;
		int i = 1;
		while(i<=5){
			num1 = ran.nextInt(9)+1;
			num2 = ran.nextInt(9)+1;
		    answer = num1*num2;
			System.out.print(num1 +" x "+num2+" = ");
			myanswer = scan.nextInt();
			if(answer==myanswer){
				System.out.println("정답");
				score = score + 20;
			}else{
				System.out.println("떙");
			}
			i=i+1;
		}
		System.out.println("성적: "+score);
		
		scan.close();
	}

}
