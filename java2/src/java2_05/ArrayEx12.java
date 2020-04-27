package java2_05;
import java.util.Scanner;
public class ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		Scanner scan = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		int temp = 0;
		System.out.print("Enter indexs:");
		first = scan.nextInt();
		second = scan.nextInt();
		temp = arr[first];
		arr[first] = arr[second];
		arr[second]=temp;
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter values:");
		first = scan.nextInt();
		second = scan.nextInt();
		
		for(int i=0;i<5;i++){
			if(arr[i]==first){
				first = i;
			}else if(arr[i]==second){
				second = i;
			}
		}
		temp = arr[first];
		arr[first] = arr[second];
		arr[second]=temp;
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int[] sNum = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		System.out.println();
		System.out.print("Enter numbers:");
		first = scan.nextInt();
		second = scan.nextInt();
		for(int i=0;i<5;i++){
			if(sNum[i]==first){
				first = i;
			}else if(sNum[i]==second){
				second = i;
			}
		}
		temp = scores[first];
		scores[first] = scores[second];
		scores[second]=temp;
		for(int i=0;i<5;i++){
			System.out.print(scores[i]+" ");
		}
		System.out.println();
		 
		
	}

}
