package gui06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * #�ڹ� GUI
 * 1)������ java.awt		:Frame, Panel
 * 2)�Ź��� java.swing		:JFrame, JPanel
 */
class MyPanel extends JPanel implements ActionListener {
	JButton btn;
	int height=10;

	public MyPanel() {
		setLayout(null);
		// TODO Auto-generated constructor stub
		setBackground(Color.YELLOW);

		btn = new JButton("��ư");
		btn.setBounds(10, 10, 300, 300);
		btn.addActionListener(this);
		add(btn);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btn) {
			height+=10;
			btn.setLocation(10, height);
		}

	}
}

public class Gui06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("GUI ����");

		// frame.setBounds(50, 50, 500, 500);
		frame.setSize(500, 500);

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension size = tk.getScreenSize();
		frame.setLocation(size.width / 2 - 250, size.height / 2 - 250);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// MyPanel mp = new MyPanel();
		// frame.setContentPane(mp);
		frame.setContentPane(new MyPanel());
		frame.revalidate();
	}

}
