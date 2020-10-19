package gui03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class My_panel extends JPanel implements ActionListener {
	// 1to50
	JButton btn;
	JButton btn_arr[][];
	int game_num;
	int[][] front;
	int[][] back;
	Random ran;

	My_panel() {
		this.setLayout(null);
		game_num = 1;
		ran = new Random();
		basic_set();
		num_shuffle();
		btn_shuffle();
	}

	public void btn_shuffle() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				btn_arr[i][j].setText(front[i][j] + "");
			}
		}
	}

	public void num_shuffle() {
		for (int i = 0; i < 10000; i++) {
			int r1 = ran.nextInt(5);
			int r2 = ran.nextInt(5);
			int temp = front[r1][r2];
			front[r1][r2] = front[0][0];
			front[0][0] = temp;

			r1 = ran.nextInt(5);
			r2 = ran.nextInt(5);
			temp = back[r1][r2];
			back[r1][r2] = back[0][0];
			back[0][0] = temp;
		}
	}

	public void basic_set() {
		btn = new JButton();
		btn.setText("NEXT NUM : " + game_num);
		btn.setSize(300, 50);
		btn.setLocation(110,515 );
		add(btn);

		btn_arr = new JButton[5][5];
		front = new int[5][5];
		back = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				btn_arr[i][n] = new JButton();
				btn_arr[i][n].setSize(100, 100);
				btn_arr[i][n].setLocation((i * 100) + 10, (n * 100) + 10);
				btn_arr[i][n].addActionListener(this);
				add(btn_arr[i][n]);

				front[i][n] = (i*5) + n + 1;
				back[i][n] = front[i][n] + 25;

			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				if (e.getSource() == btn_arr[i][n]) {
					if (btn_arr[i][n].getText().equals(game_num + "")) {
						if (game_num < 26) {
							btn_arr[i][n].setText(back[i][n] + "");
							game_num += 1;
							btn.setText("NEXT NUM : " + game_num);
						} else {
							btn_arr[i][n].setText("");
							game_num += 1;
							if (game_num > 50) {
								btn.setText("GAME OVER");
							} else {
								btn.setText("NEXT NUM : " + game_num);
							}

						}

					}
				}
			}
		}
	}
}

public class Gui03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("1TO50");
		frame.setSize(540, 650);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		My_panel mp = new My_panel();
		frame.setContentPane(mp);
		frame.revalidate();

	}

}
