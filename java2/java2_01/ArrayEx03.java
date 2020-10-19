package java2_01;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++){
			arr[i] = (i+1)*10;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int total = 0;
		int count = 0;
		for(int i=0;i<5;i++){
			if(arr[i]%4==0){
				System.out.print(arr[i]+" ");
				total += arr[i];
				count++;
			}
		}
		System.out.println();
		System.out.println(total);
		System.out.println(count);
		count =0;
		for(int i=0;i<5;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
