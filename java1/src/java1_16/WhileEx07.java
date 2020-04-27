package java1_16;

import java.util.Scanner;
import java.util.Random;
public class WhileEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int com = ran.nextInt(100)+1;
		int run = 1;
		int score = 100;
		while(run==1){
			System.out.print("숫자를 입력하세요: ");
			num = scan.nextInt();
			
			if(num<com){
				System.out.println("Up");
				score -= 5;
			}else if(num==com){
				System.out.println("Bingo");
				run =0;
			}else{
				System.out.println("Down");
				score -= 5;
			}
		}
		System.out.println("게임 종료 // 점수:"+score);
	}

}
