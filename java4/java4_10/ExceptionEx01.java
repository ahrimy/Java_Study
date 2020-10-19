package java4_10;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		
		try{
			System.out.println(num/0);
		}catch(Exception e){
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}

}
