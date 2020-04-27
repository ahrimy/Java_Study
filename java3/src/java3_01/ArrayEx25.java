package java3_01;
import java.util.Scanner;
import java.util.Random;
public class ArrayEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[9];
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for(int i=1;i<=9;i++){
			arr[i-1] = i;
		}
		for(int i=0;i<9;i++){
			int r = ran.nextInt(9);
			int temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
		}
		int cnt = 0;
		while(cnt<9){
			for (int i = 0; i < 9; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("Enter the number:");
			int input = scan.nextInt();
			if(arr[input]==cnt+1){
				arr[input] = 0;
				cnt++;
			}
		}
		
		
	}

}
