package java4_05;

import java.util.Random;
import java.util.Scanner;

public class StringEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"java", "mysql", "jsp", "spring"};
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<1000;i++){
			int r = ran.nextInt(4);
			String temp = words[r];
			words[r] = words[0];
			words[0] = temp;
		}
		for(int i=0;i<4;i++){
			int check = 0;
			while(check==0){
				int r = ran.nextInt(words[i].length());
				
				String answer = "";
				System.out.print("문제 : ");
				for(int j=0;j<words[i].length();j++){
					if(j==r){
						System.out.print("*");
					}else{
						System.out.print(words[i].charAt(j));
					}
				}
				System.out.println();
				System.out.print("입력: ");
				answer = scan.next();
				if(answer.equals(words[i])){
					check=1;
				}
			}
		}
	}

}
