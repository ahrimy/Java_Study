package java2_11;

public class WhileEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			System.out.print("#");
			if (i % 3 == 2) {
				System.out.println();
			}
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			for(int k=i+1;k<3;k++){
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for(int k=i+1;k<3;k++){
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)+1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
