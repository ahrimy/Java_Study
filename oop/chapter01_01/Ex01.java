package chapter01_01;

//���� ������(++,--)

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		num++;		//num = num+1;
		++num;	
		
		System.out.println(num);
		
		//----------------------------------------
		num=10;
		int result = ++num;
		
		System.out.println("num ="+num);
		System.out.println("Result = "+result);
		
		//-----------------------------------------
		//���׿����ڰ� �ٸ� �����ڿ� �Բ� ���̰�,
		//���������� �ۼ��Ǿ��� ���.
		//1������ ������ ���� �������� �����Ѵ�.
		num=10;
		result = num++;
		
		System.out.println("num ="+num);
		System.out.println("Result = "+result);
		
		
	}

}
