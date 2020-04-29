package java6_03;
class Ex03{
	
	int num;
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
}


public class MethodEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 e = new Ex03();
		e.setNum(100);
		
		int result = e.getNum();
		System.out.println(result);

	}

}
