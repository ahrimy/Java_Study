package java6_01;

class Student3{
	int setScore(int score){
		score = 100;
		return score;
	}
}

public class _02_MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 hgd = new Student3();
		
		int score = 87;
		System.out.println("�޼��� ȣ�� ���� ���� = "+score);
		
		score = hgd.setScore(score);
		
		System.out.println("�޼��� ȣ�� ���� ���� = "+score);
	}

}
