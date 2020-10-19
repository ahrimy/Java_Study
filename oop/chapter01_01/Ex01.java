package chapter01_01;

//단항 연산자(++,--)

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
		//단항연산자가 다른 연산자와 함께 쓰이고,
		//후위형으로 작성되었을 경우.
		//1증가의 역할을 가장 마지막에 수행한다.
		num=10;
		result = num++;
		
		System.out.println("num ="+num);
		System.out.println("Result = "+result);
		
		
	}

}
