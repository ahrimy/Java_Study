package chapter01_01;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;

		boolean result;
		//SCE (Short Circuit Evaluation) : �ִܰŸ�����
		//&&�� ��� ���� ���� false�� ��� �ڿ� ���� ����
		//||�� ��� ���� ���� true�� ��� �ڿ� ���� ����
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}
