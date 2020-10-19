package chapter01_01;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;

		boolean result;
		//SCE (Short Circuit Evaluation) : 최단거리연산
		//&&의 경우 앞의 값이 false일 경우 뒤에 연산 안함
		//||의 경우 앞의 갑이 true일 경우 뒤에 연산 안함
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}
