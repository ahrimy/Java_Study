package java3_13;
import java.util.Scanner;
public class ArrayEx47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] jang = { { "ö��", "�Ұ��" }, { "ö��", "���" }, { "����", "��ġ" }, { "ö��", "�ٳ���" }, { "ö��", "�����" },
				{ "����", "��¡��" }, { "����", "����" } };
Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���:");
		String name = scan.next();
		System.out.print("��ȣ�� �Է��ϼ���:");
		int num = scan.nextInt();
		
		for(int i=0;i<jang.length;i++){
			if(name.equals(jang[i][0])){
				num--;
				if(num==-1){
					int count = jang.length-1;
					String[][] temp = new String[count][2];
					for(int j=0;j<i;j++){
						temp[j] = jang[j];
					}for(int j=i;j<temp.length;j++){
						temp[j] = jang[j+1];
					}
					jang = temp;
					break;
				}
			}
		}
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}


	}

}
