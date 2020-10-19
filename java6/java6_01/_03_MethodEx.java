package java6_01;
class Student4{
	int score;
	
	void setScore(){
		score = 87;
		System.out.println("this = "+this);
	}
}
public class _03_MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 hgd = new Student4();
		hgd.score = 100;
		System.out.println(hgd.score);
		hgd.setScore();
		System.out.println(hgd.score);
		
		System.out.println("hgd = "+hgd);
	}

}
