package java1_19;
import java.util.Random;
public class WhileEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int i=1;
		int score = 0;
		int max = 0;
		int first = 0;
		int total = 0;
		double avg = 0;
		int pass = 0;
		while(i<=10){
			score = ran.nextInt(100)+1;
			total = total+score;
			if(score>=60){
				pass++;
			}
			if(score>max){
				max = score;
				first = i;
			}
			i = i+1;
		}
		avg = total/10.0;
		System.out.println("Total:"+total+" Average:"+avg);
		System.out.println("Number of Passed students:"+pass);
		System.out.println("First student:"+first+" Score:"+max);
	}

}
