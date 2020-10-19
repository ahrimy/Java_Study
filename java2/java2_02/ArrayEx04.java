package java2_02;
import java.util.Scanner;
public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		int total = 0;
		double avg = 0;
		int pass = 0;
		for(int i=0;i<5;i++){
			arr[i] = scan.nextInt();
			total += arr[i];
			if(arr[i]>=60){
				pass++;
			}
		}
		avg = total/5.0;
		System.out.println(total);
		System.out.println(avg);
		System.out.println(pass);
		
		
	}

}
