package java3_08;

public class ArrayEx41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					garo[i] += arr[i][j];
					sero[j] += arr[i][j];
				}
			}



			for(int i=0;i<garo.length;i++){
				System.out.print(garo[i]+" ");
			}
			System.out.println();
			for(int i=0;i<sero.length;i++){
				System.out.print(sero[i]+" ");
			}
			System.out.println();
			


	}

}
