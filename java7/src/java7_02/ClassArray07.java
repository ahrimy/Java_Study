package java07_02;

import java.util.Random;

class RanNum{
	int num;
}
public class ClassArray07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		RanNum[] arr = new RanNum[5];
		
		for(int i=0;i<5;i++){
			arr[i] = new RanNum();
		}
		int check[] = new int[6];
		for(int i=0;i<5;i++){
			int temp = ran.nextInt(5)+1;
			if(check[temp]==1){
				i--;
			}else{
				check[temp] = 1;
				arr[i].num = temp;
				
			}
		}
		for(int i=0;i<5;i++){
			System.out.print(arr[i].num+" ");
		}
		System.out.println();
		
	}

}
