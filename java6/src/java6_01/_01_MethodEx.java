package java6_01;

class Student2{
	void setScore(int score){
		score = 100;
	}
}

public class _01_MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 hgd = new Student2();
		
		int score = 87;
		System.out.println("�޼��� ȣ�� ���� ���� = "+score);
		
		hgd.setScore(score);
		
		System.out.println("�޼��� ȣ�� ���� ���� = "+score);
	}

}
