package java2_01;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ϲݺ��� : ������
		int num = 0;
		num = 10;
		System.out.println("num = "+num);
		
		//�ּҺ��� : �ּ� ����
		int[] arr = null;
		arr = new int[5];
		System.out.println("arr = "+arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
	}

}
