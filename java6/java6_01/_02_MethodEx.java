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
		System.out.println("메서드 호출 전의 성적 = "+score);
		
		score = hgd.setScore(score);
		
		System.out.println("메서드 호출 후의 성적 = "+score);
	}

}
