package java2_12;
import java.util.Scanner;
public class WhileEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Eneter a number: ");
		int input = scan.nextInt();
		
		for(int i=2;i<=input;i++){
			int count =0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+ " ");
			}
			
		}
		System.out.println();
	}

}
