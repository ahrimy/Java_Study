package chapter01_04;

import java.util.ArrayList;

/*
 * #�÷���(Collection) : �������̽�
 * 		java.util.Vector		:������
 * 		java.util.ArrayList		:�Ź���
 * 
 */
class MyArrayList<T>{
	private Object[] arr;
	private int count;
	public void add(T data){
		if(count ==0){
			arr = new Object[count+1];
		}else{
			Object[] temp = arr;
			arr = new Object[count+1];
			for(int i=0;i<count;i++){
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[count] = data;
		count++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "[";
		for(int i=0;i<count;i++){
			result+=arr[i];
			if(i!=count-1){
				result+=",";
			}
		}
		result +="]";
		return result;
	}
}
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<> ���׸�(generic) : Ŭ���� Ÿ�Ը� ��� (int -> Integer)
		/*ArrayList<Integer> list = new ArrayList();
		//1. �߰��ϱ�
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
*/	
		MyArrayList<Integer> myList = new MyArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		System.out.println(myList);
		
	}

}
