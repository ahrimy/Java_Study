package gui01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//awt�� �����Ǿ��ִ�. (���콺 ��ȣ)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class My_panel extends JPanel implements ActionListener{ //���̾ƿ�==>������ ��Ģ���� ��ư(���۳�Ʈ)�� �ڵ���ġ���ִ� ���
	
	JButton btn;
	
	My_panel(){
		setLayout(null);//Null�ϸ� ���� ���� �ϰڴٴ� �ǹ�
		btn = new JButton();
		btn.setText("��ư");
		btn.setSize(100, 100);
		btn.setLocation(10, 10);
		btn.addActionListener(this);

		add(btn);		//�гο� ��ư ����

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//e==>��ư
		if(e.getSource() == btn) {
			btn.setText("!!");
		}
	}
	
}

public class Gui01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("��ư");
		frame.setSize(1000, 800);
		frame.setLocation(100 , 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel(); //�г� ����(JPanel�� ��ӹ��� Ŭ����)
		frame.setContentPane(mp);   //�����ӿ� �г� ����
		frame.revalidate();			//���ΰ�ħ
		

	}

}
