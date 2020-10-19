package java3_13;

import java.util.Random;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int[] check = new int[6];
		Random ran = new Random();
		int cnt = 0;
		while(cnt<10){
			arr[cnt] = ran.nextInt(5)+1;
			if(check[arr[cnt]]<2){
				check[arr[cnt]]++;
				cnt++;
			}
		}
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
