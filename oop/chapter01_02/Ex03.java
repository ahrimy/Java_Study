package chapter01_02;

import java.util.Random;

/*
 * for�� vs while��
 * for�� : �ݺ� Ƚ���� �� ��
 * while�� : �ݺ� Ƚ���� �� ��(while(true))
 */
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ѷ���
//		for(;;){
//			System.out.println(1);
//		}
//		while(true){
//			
//		}
		
		Random ran = new Random();
		//#�ߺ����� ����(1�ܰ�)
		int[] check = new int[5];
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++){
			int r = ran.nextInt(5);
			if(check[r]==0){
				check[r]=1;
				arr[i] = r;
				System.out.print(arr[i] + " ");
			}else{
				i--;
			}
		}
		System.out.println();
		int cnt = 0;
		check = new int[5];
		while(cnt<5){
			int r = ran.nextInt(5);
			if(check[r]==0){
				check[r]=1;
				arr[cnt] = r;
				System.out.print(arr[cnt] + " ");
				cnt++;
			}
		}
		
	}

}
