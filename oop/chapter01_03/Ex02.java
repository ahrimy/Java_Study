package chapter01_03;

/*
 * #����������(=����������)
 * public > protected > default > private
 * .public : ������Ʈ ��ü���� ��� ����
 * .protected : ���� ��Ű��/�ٸ� ��Ű���� �ִ��� �ڽ� Ŭ������ ��� ���� ����
 * .default : (���� ������ ����) ���� ��Ű�� �������� ��밡��
 * .private : Ŭ���� ���� ����鿡�Ը� ������ ���
 * 
 * #����ȭ (=ĸ��ȭ)
 * �������� private�� �ٿ� �����͸� �����,
 * public �޼��带 ���� ���� ��ȿ�� �˻縦 ��ģ
 * ������ �����͸� �����Ѵ�. 
 */

class Student{
	private int score;
	//get�� set�޼��� �ڵ��ϼ� ����Ű
	//alt + shift + s,r
	
	//���Խ� : Ư�����ڳ� ���ĺ����� �˻����ִ� ���(���)
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hgd =  new Student();
		
	}

}
