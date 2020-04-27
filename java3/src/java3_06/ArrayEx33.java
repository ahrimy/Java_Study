package java3_06;

public class ArrayEx33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 10, 50, 30, 40, 80, 7 };

		int idx = 0;

		for (int i = 0; i < 6; i++) {

			int max = 0;
			int mNum = 0;
			for (int j = 0; j < 6; j++) {
				System.out.print(score[j]+" ");
				
			}
			System.out.println();
			for (idx = i; idx < 6; idx++) {
				if (score[idx] > max) {
					max = score[idx];
					mNum = idx;
				}
			}
			score[mNum] = score[i];
			score[i] = max;

		}
	}

}
