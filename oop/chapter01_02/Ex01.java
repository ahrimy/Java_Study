package chapter01_02;

/*
 * #���(control statement)
 * 1.���ǹ� : if, switch-case
 * 2.�ݺ��� : for, while, do-while
 * 3.���� ���(*) : break, continue
 */
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month =5;
		if(month==3||month==4||month==5){
			System.out.println("��");
		}else if(month==6||month==7||month==8){
			System.out.println("����");
		}else if(month==9||month==10||month==11){
			System.out.println("����");
		}else if(month==12||month==1||month==2){
			System.out.println("�ܿ�");
		}else{
			System.out.println("�߸��� �Է�");
		}
		//----------------------------------
		switch(month){ //()�ȿ��� ���� or ����(��)		
		case 3:
		case 4:
		case 5:
			System.out.println("��"); break;
		case 6:
		case 7:
		case 8:
			System.out.println("�"); break;
		case 9:
		case 10:
		case 11:
			System.out.println("����"); break;
		case 12: case 1: case 2:
			System.out.println("�ܿ�"); break;
		default :
			System.out.println("�߸��Է��߾��!");
		}
	}

}
