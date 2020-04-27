package java3_08;

public class ArrayEx39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		int total = 0;
		int four = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				total += arr[i][j];
				if(arr[i][j]%4==0){
					System.out.print(arr[i][j] + " ");
					count++;
					four+=arr[i][j];
				}
			}
			//System.out.println();
		}
		System.out.println();
		System.out.println("total:"+total);
		System.out.println("four total:"+four);
		System.out.println("four count:"+count);
	}

}
