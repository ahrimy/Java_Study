package java1_21;

public class WhileEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~5���� ���
		int x = 1;
		while (x <= 5) {
			System.out.println(x);
			x = x + 1;
		}

		System.out.println();

		for (int y = 1; y <= 5; y++) {
			System.out.println(y);
		}
		System.out.println();
		// ���� 1) 1���� 5���� ���
		// ���� 1) 1, 2, 3, 4, 5
		for(int i=1;i<=5;i++){
			System.out.print(i+" ");
		}
		System.out.println();

		// ���� 2) 1���� 10���� �ݺ���, 5~9���� ���
		// ���� 2) 5, 6, 7, 8, 9
		for(int i=1;i<=10;i++){
			if(i>=5&&i<=9){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// ���� 3) 1���� 10���� �ݺ��� 6~3���� ���
		// ���� 3) 6, 5, 4, 3
		for(int i=10;i>=1;i--){
			if(i>=3&&i<=6){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
		// ���� 4) 1, 2, 7, 8, 9, 10
		for(int i=1;i<=10;i++){
			if(i<3||i>=7){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

}
