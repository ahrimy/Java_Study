package java1_18;

public class WhileEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int count = 0;
		while(i<=50){
			count = 0;
			if(i%10==3||i%10==6||i%10==9){
				count++;
			}
			if(i/10==3||i/10==6||i/10==9){
				count++;
			}
			if(count == 0){
				System.out.print(i + " ");
			}else if(count ==1){
				System.out.print("¦ ");
			}else{
				System.out.print("¦¦ ");
			}
			i++;
		}
		System.out.println();
		
	}

}
