package java4_05;
import java.util.Random;
import java.util.Scanner;
public class StringEx10 {

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
				String answer = "";
				System.out.println("문제 : "+words[i]);
				System.out.print("입력: ");
				answer = scan.next();
				if(answer.equals(words[i])){
					check=1;
				}
			}
		}


	}

}
