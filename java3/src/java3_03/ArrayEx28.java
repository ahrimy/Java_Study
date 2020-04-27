package java3_03;
import java.util.Random;

public class ArrayEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int[] check = new int[11];
		Random ran = new Random();
		int cnt = 0;
		while(cnt<5){
			arr[cnt] = ran.nextInt(10)+1;
			if(check[arr[cnt]]==0){
				check[arr[cnt]]=1;
				cnt++;
			}
		}
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
	}

}
