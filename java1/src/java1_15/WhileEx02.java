package java1_15;

public class WhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		while(i<=10){
			if(i>=5&&i<=9){
				System.out.println(i);
			}
			i= i+1;
		}
		i=10;
		while(i>=1){
			if(i>=3&&i<=6){
				System.out.println(i);
			}
			i= i-1;
		}
		i=1;
		while(i<=10){
			if(i%2==0){
				System.out.println(i);
			}
			i= i+1;
		}
		
	}

}
