package java1_04;

public class OpEx08_¹®Á¦ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		System.out.println(num%3==0 && num%2==0);
		
		int kor = 100;
		int eng = 87;
		int math = 41;
		int total = kor+eng+math;
		double avg = total/3.0;
		System.out.println(avg>=60.0 && kor>=50 && eng>=50 && math>=50);
		
		int height1 = 199;
		int weight1 = 199;
		
		int height2 = 200;
		int weight2 = 68;
		
		System.out.println(height1>=200||weight1>=200);
		System.out.println(height2>=200||weight2>=200);
		
		
		
	}

}
