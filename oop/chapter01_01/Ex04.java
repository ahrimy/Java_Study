package chapter01_01;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼항연산자
		int num = 1;
		if(num>5){
			System.out.println("5보다 크다");
		}else{
			System.out.println("5보다 작다");
		}
		
		String result = num>5?"5보다 크다" : "5보다 작다";
		System.out.println(result);
	}

}
