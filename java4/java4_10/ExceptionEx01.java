package java4_10;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		
		try{
			System.out.println(num/0);
		}catch(Exception e){
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		System.out.println("���α׷� ����");
	}

}
