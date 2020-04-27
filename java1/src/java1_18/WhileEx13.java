package java1_18;
import java.util.Scanner;
public class WhileEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Eneter a number:");
		int num = scan.nextInt();
		int count =0;
		for(int i=0;i<num;i++){
			if(num%(i+1)==0){
				count++;
			}
		}
		if(count ==2){
			System.out.println("소수입니다.");
		}else{
			System.out.println("소수가 아닙니다");
		}
	}

}
