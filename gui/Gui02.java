package gui02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class My_panel extends JPanel implements ActionListener {
	// TIC TAC TOE
	JButton ttt[][];
	JButton btn1;
	JButton btn2;
	int data[][];
	boolean turn;

	My_panel() {
		this.setLayout(null);
		basic_set();
	}

	public void basic_set() {
		turn = true;
		ttt = new JButton[3][3];
		data = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < 3; n++) {
				ttt[i][n] = new JButton();
				ttt[i][n].setSize(100, 100);
				ttt[i][n].setLocation((i * 100) + 10, (n * 100) + 10);
				ttt[i][n].addActionListener(this);
				add(ttt[i][n]);
				data[i][n] = 0;

			}
		}
		btn1 = new JButton();
		btn1.setText("승자는?");
		btn1.setSize(140, 50);
		btn1.setLocation(330, 10);
		add(btn1);

		btn2 = new JButton();
		btn2.setText("다시 시작");
		btn2.setSize(140, 50);
		btn2.setLocation(330, 260);
		btn2.addActionListener(this);

		add(btn2); // 패널에 버튼 부착
	}

	void reset() {
		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < 3; n++) {
				ttt[i][n].setText("");
				data[i][n] = 0;
			}
		}
		btn1.setText("승자는?");
		btn1.setBackground(null);
	}

	void CheckWin() {
		int win = 0;
		for (int i = 0; i < 3; i++) {
			if (data[i][0] == 1 && data[i][1] == 1 && data[i][2] == 1) {
				win = 1;
			}
			if (data[i][0] == 2 && data[i][1] == 2 && data[i][2] == 2) {
				win = 2;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (data[0][i] == 1 && data[1][i] == 1 && data[2][i] == 1) {
				win = 1;
			}
			if (data[0][i] == 2 && data[1][i] == 2 && data[2][i] == 2) {
				win = 2;
			}
		}
		if (data[0][0] == 1 && data[1][1] == 1 && data[2][2] == 1) {
			win = 1;
		}
		if (data[0][0] == 2 && data[1][1] == 2 && data[2][2] == 2) {
			win = 2;
		}
		if (data[0][2] == 1 && data[1][1] == 1 && data[2][0] == 1) {
			win = 1;
		}
		if (data[0][2] == 2 && data[1][1] == 2 && data[2][0] == 2) {
			win = 2;
		}
		if (win != 0) {
			btn1.setText("Player" + win + " is win");
			btn1.setBackground(Color.GREEN);
			for (int i = 0; i < 3; i++) {
				for (int n = 0; n < 3; n++) {
					if (data[i][n] == 0) {
						data[i][n] = 3;
					}
				}
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < 3; n++) {
				if (e.getSource() == ttt[i][n]) {
					if (turn == true) {
						if (data[i][n] == 0) {
							data[i][n] = 1;
							ttt[i][n].setText("O");
							turn = !turn;
							CheckWin();
						}
					} else {
						if (data[i][n] == 0) {
							data[i][n] = 2;
							ttt[i][n].setText("X");
							turn = !turn;
							CheckWin();
						}
					}
				}
			}
		}
		if (e.getSource() == btn2) {
			reset();
		}
	}
}

public class Gui02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("TIC TAC TOE");
		frame.setSize(500, 380);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel();
		frame.setContentPane(mp);
		frame.revalidate();

	}

}
