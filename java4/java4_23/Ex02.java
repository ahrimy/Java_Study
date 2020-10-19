package java4_23;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1;
		int end = 5;
		
		for(int i=0; i<5; i++) {
			if(i % 2 == 0) {
				for(int j=start; j<=end; j++) {
					System.out.print(j + "\t");
				}
			}else {
				for(int j=end; j>=start; j--) {
					System.out.print(j + "\t");
				}
			}
			System.out.println();

			start = end + 1;
			end = end + 5;
		}



	}

}
