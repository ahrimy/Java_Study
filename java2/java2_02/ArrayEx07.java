package java2_02;

public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sNum = {1001,1002,1003,1004,1005};
		int[] score = {87,11,45,98,23};
		
		int first = 0;
		int num = 0;
		for(int i=0;i<5;i++ ){
			if(score[i]>first){
				first = score[i];
				num = sNum[i];
			}
		}
		System.out.println(first);
		System.out.println(num);
	}

}
