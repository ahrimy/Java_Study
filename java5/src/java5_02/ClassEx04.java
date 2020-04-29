package java5_02;
import java.util.Scanner;
class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class ClassEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Ex04 e = new Ex04();
		int total=0;
		int passC=0;
		for(int i=0;i<e.scores.length;i++){
			e.scores[i] = scan.nextInt();
			total+=e.scores[i];
			if(e.scores[i]>=60){
				passC++;
			}
		}
		double avg = total/5.0;
		
		System.out.println(total+" "+avg+" "+passC);
		
		System.out.println("Index:");
		int input = scan.nextInt();
		System.out.println(e.scores[input]);
	
		System.out.println("Score:");
		input = scan.nextInt();
		for(int i=0;i<e.scores.length;i++){
			if(e.scores[i]==input){
				System.out.println(i);
			}
		}

		System.out.println("Number:");
		input = scan.nextInt();
		for(int i=0;i<e.hakbuns.length;i++){
			if(e.hakbuns[i]==input){
				System.out.println(e.scores[i]);
			}
		}
		
		System.out.println("Number:");
		input = scan.nextInt();
		int check = 0;
		for(int i=0;i<e.hakbuns.length;i++){
			if(e.hakbuns[i]==input){
				System.out.println(e.scores[i]);
				check = 1;
			}
		}
		if(check==0){
			System.out.println("Not exist number");
		}
		
		int max = 0;
		int maxNum = 0;
		for(int i=0;i<e.scores.length;i++){
			if(max<e.scores[i]){
				max = e.scores[i];
				maxNum = e.hakbuns[i];
			}
		}
		System.out.println(maxNum +" "+max);
		
	}

}
