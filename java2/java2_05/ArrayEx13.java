package java2_05;

public class ArrayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {44,11,29,24,76};
		int[] temp = null;
		int count = 0;
		for(int i=0;i<5;i++){
			if(arr[i]%4==0){
				count++;
			}
		}
		temp = new int[count];
		count = 0;
		for(int i=0;i<5;i++){
			if(arr[i]%4==0){
				
				temp[count]=arr[i];
				System.out.print(temp[count++] + " ");
			}
		}
		
	}

}
