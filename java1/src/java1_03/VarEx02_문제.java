package java1_03;

public class VarEx02_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("�ܵ� = "+change +"��");
		
		int salary = 100;
		double income = (salary*12)*0.9;
		System.out.println("���� = "+income);
		
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		int sum = score1+score2+score3;
		double avg = sum/3.0;
		System.out.println("��� = "+avg);
		
		int width = 3;
		int length = 6;
		double area = (width*length)/2.0;
		System.out.println("�ﰢ���� ���� = "+area);
		
		int time = 100;
		int minutes = time/60;
		int seconds = time%60;
		System.out.println(minutes+"�� "+seconds+"��");
		
		int amount = 800;
		int numof500 = amount/500;
		int numof100 = (amount%500)/100;
		System.out.println("500��:"+numof500+" 100��:"+numof100);
		
	}

}
