package java4_02;

public class StringEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		
		String temp[] = str.split("/");
		int[] arr = new int[3];
		int total = 0;
		for(int i=0;i<3;i++){
			arr[i] = Integer.parseInt(temp[i]);
			total += arr[i];
		}
		
		System.out.println(total);
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i=0;i<3;i++){
			if(i<2){
				text += String.valueOf(scores[i]);
				text+="/";
			}
			else{
				text += String.valueOf(scores[i]);
			}
		}
		System.out.println(text);


	}

}
