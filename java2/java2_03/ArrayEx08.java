package java2_03;
import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] answer = {1,3,4,2,5};
		int[] hgd = new int[5];
		boolean[] yesno = new boolean[5];
		int score = 0;
		for(int i=0;i<5;i++){
			hgd[i] = scan.nextInt();
			if(hgd[i]==answer[i]){
				yesno[i]=true;
				score +=20;
			}else{
				yesno[i]=false;
			}
		}
		for(int i=0;i<5;i++){
			if(yesno[i]==true){
				System.out.print("o ");
			}else{
				System.out.print("x ");
			}
		}
		System.out.println();
		System.out.println(score);
	}

}
