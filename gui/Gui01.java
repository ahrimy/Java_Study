package gui01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//awt에 구현되어있다. (마우스 신호)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class My_panel extends JPanel implements ActionListener{ //레이아웃==>일정한 규칙으로 버튼(컴퍼넌트)을 자동배치해주는 기능
	
	JButton btn;
	
	My_panel(){
		setLayout(null);//Null하면 직접 세팅 하겠다는 의미
		btn = new JButton();
		btn.setText("버튼");
		btn.setSize(100, 100);
		btn.setLocation(10, 10);
		btn.addActionListener(this);

		add(btn);		//패널에 버튼 부착

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//e==>버튼
		if(e.getSource() == btn) {
			btn.setText("!!");
		}
	}
	
}

public class Gui01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("버튼");
		frame.setSize(1000, 800);
		frame.setLocation(100 , 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel(); //패널 생성(JPanel을 상속받은 클래스)
		frame.setContentPane(mp);   //프레임에 패널 부착
		frame.revalidate();			//새로고침
		

	}

}
