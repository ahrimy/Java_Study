package java1_04;

public class OpEx06_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 30;
		System.out.println(score>=60);
		
		System.out.println("3�ǹ�� "+(score%3==0));
		
		System.out.println("¦�� "+(score%2==0));
		System.out.println("Ȧ�� " +(score%2==1));
		
		int money = 178600;
		int numof1000 = (money%5000)/1000;
		System.out.println(numof1000>=3);
	}

}
