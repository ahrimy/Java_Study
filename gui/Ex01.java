package gui00;
//gui �����ϴ� Ŭ���� awt(old), swing(new)==>J�� �پ��ִ�

import javax.swing.JFrame;//frame Ŭ����

//consol==>�ܼ�==>���ڸ� ���
//gui==>������ ���α׷��� ==>��ǥ, �̹���, ���콺, Ű����, ��� ���� ��� �ڿ��� Ȱ���Ѵ�.
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();//������ ����
		frame.setTitle("��ư");//������
		frame.setSize(300,300);//ũ�� ����(x,y)
		frame.setLocation(100,200);//��ġ ����(���� ��ġ x,y)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//â ���� �� �޸� Ȯ���� ����
		frame.setVisible(true);//������ �ѱ�
		
		
	}

}
