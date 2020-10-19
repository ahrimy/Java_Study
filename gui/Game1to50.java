package gui12;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Rect {
	int x;
	int y;
	int size;
	int num;
	Color color;
	int back;
}

class MyPanel extends JPanel implements MouseListener, MouseMotionListener, ActionListener {

	Random ran = new Random();
	Rect[][] rect;
	JButton resetBtn;
	boolean end;
	int game_num;
	int[][] front;
	int[][] back;

	MyPanel() {
		setLayout(null);

		game_num = 1;
		addMouseListener(this); // 마우스 와 패널 연결
		addMouseMotionListener(this); // 마우스 모션 과 패널 연결
		basic_set();
		shuffle_set();
		resetBtn.setBounds(520, 460, 110, 50);
		resetBtn.setBackground(Color.GREEN);
		resetBtn.addActionListener(this);
		add(resetBtn);
	}

	public void shuffle_set() {
		shuffle();
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				rect[i][n].num = front[i][n];
			}
		}
	}

	public void shuffle() {
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

		end = false;
		rect = new Rect[5][5];
		front = new int[5][5];
		back = new int[5][5];
		resetBtn = new JButton("Reset");
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 15);
		resetBtn.setFont(font);

		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				rect[i][n] = new Rect();
				rect[i][n].size = 100;
				rect[i][n].x = (i * 100) + 10;
				rect[i][n].y = (n * 100) + 10;
				rect[i][n].color = Color.WHITE;
				front[i][n] = (i * 5) + n + 1;
				back[i][n] = front[i][n] + 25;

			}
		}
	}

	public void reset() {
		end = false;
		game_num = 1;
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				rect[i][n].num = 0;
			}
		}
		shuffle_set();
		repaint();
	}

	// 부모를 상속받은 자식만 사용가능 protected
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // 지우기기능
		// 자동 repaint (100/1 초)
		try {

			Thread.sleep(10);
			repaint();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ======================================================
		Font font = new Font("", Font.BOLD, 15);

		g.setFont(font);
		g.drawString("다음 숫자 : " + game_num, 530, 50);

		font = new Font("", Font.BOLD, 20);
		g.setFont(font);
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				g.setColor(rect[i][n].color);
				g.fillRect(rect[i][n].x, rect[i][n].y, rect[i][n].size, rect[i][n].size);
				g.setColor(Color.BLACK);
				g.drawRect(rect[i][n].x, rect[i][n].y, rect[i][n].size, rect[i][n].size);
				if (rect[i][n].num > 0 && rect[i][n].num <= 50) {
					g.drawString(rect[i][n].num + "", rect[i][n].x + 40, rect[i][n].y + 50);
				} else {
					g.drawString("", rect[i][n].x + 40, rect[i][n].y + 50);
				}

			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (end) {
			return;
		}
		int x = e.getX();
		int y = e.getY();
		System.out.println(x + " " + y);
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				if (rect[i][n].x < x && x < rect[i][n].x + rect[i][n].size) {
					if (rect[i][n].y < y && y < rect[i][n].y + rect[i][n].size) {
						if (rect[i][n].num == game_num) {
							if (game_num < 26) {
								rect[i][n].num = back[i][n];
								game_num += 1;

							} else {
								if (game_num == 50) {
									rect[i][n].num = 0;
									game_num = 0;
									end = true;
									
								}else{
									rect[i][n].num = 0;
									game_num += 1;
								}

							}
						}

					}
				}
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if (end) {
			return;
		}
		int x = e.getX();
		int y = e.getY();
		System.out.println(x + " " + y);
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				if (rect[i][n].x < x && x < rect[i][n].x + rect[i][n].size && rect[i][n].y < y
						&& y < rect[i][n].y + rect[i][n].size) {
					rect[i][n].color = Color.BLUE;
				} else {
					rect[i][n].color = Color.WHITE;
				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == resetBtn) {
			reset();
		}
	}
}

public class Game1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("마우스연습");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 600);
		frame.setLocation(100, 0);
		MyPanel mp = new MyPanel();
		frame.setContentPane(mp);
		frame.setVisible(true);

	}

}
