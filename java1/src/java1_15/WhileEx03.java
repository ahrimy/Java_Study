package java1_15;

public class WhileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum = 0;
		while(i<=5){
			sum = sum+i;
			i = i+1;
		}
		System.out.println(sum);
		i=1;
		sum=0;
		int count = 0;
		while(i<=10){
			if(i<3||i>=7){
				System.out.print(i+" ");
				sum = sum+i;
				count++;
			}
			i = i+1;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(count);
	}

}
