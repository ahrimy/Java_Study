package java3_06;

public class ArrayEx34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"È«±æµ¿", "±è¿µ", "ÀÚ¹ÙÅ·", "¹Îº´Ã¶", "¸Þ°¡¸Ç"};
		int[] score = {87,42,100,11,98};
		
		int idx = 0;

		for (int i = 0; i < 5; i++) {

			int max = 0;
			int mNum = 0;

			for (int j = 0; j < 5; j++) {
				System.out.print(name[j]+" ");
			}
			System.out.println();
			for (idx = i; idx < 5; idx++) {
				if (score[idx] > max) {
					max = score[idx];
					mNum = idx;
				}
			}
			score[mNum] = score[i];
			score[i] = max;
			String temp = name[mNum];
			name[mNum] = name[i];
			name[i] = temp;
			

		}
	}

}
