package gui_rankGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

class Rect {
	int x;
	int y;
	int size;
	int num;
	Color color;
	int back;
}

public class Game_Panel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
	Random ran = new Random();
	JButton game_button;
	JButton ranking_button;
	JButton reset_button;
	JButton back_main;
	Rect[][] rect;
	boolean end;
	boolean start;
	int game_num;
	int[][] front;
	int[][] back;
	StopWatch st;

	static int BTN_CNT = 5;
	static int BTN_SIZE = 40;

	Game_Panel() {

		setLayout(null);
		addMouseListener(this); // 마우스 와 패널 연결
		addMouseMotionListener(this); // 마우스 모션 과 패널 연결

		game_button = new JButton("게임");
		game_button.setBackground(Color.GRAY);
		game_button.setForeground(Color.WHITE);
		game_button.setBounds(10, 10, 80, 30);
		game_button.addActionListener(this);
		add(game_button);

		ranking_button = new JButton("랭킹");
		ranking_button.setBackground(Color.CYAN);
		ranking_button.setForeground(Color.BLACK);
		ranking_button.setBounds(100, 10, 80, 30);
		ranking_button.addActionListener(this);
		add(ranking_button);

		back_main = new JButton("처음화면");
		back_main.setBackground(Color.RED);
		back_main.setForeground(Color.WHITE);
		back_main.setBounds(280, 10, 95, 30);
		back_main.addActionListener(this);
		add(back_main);

		reset_button = new JButton("리셋");
		reset_button.setBounds(190, 10, 80, 30);
		reset_button.setBackground(Color.GREEN);
		reset_button.addActionListener(this);
		add(reset_button);

		setGamePanel();
		
		FileManager.instance.loadRankData();
	}

	void setGamePanel() {
		// JOptionPane.showMessageDialog(null, "게임 스타트", "게임 스타트",
		// JOptionPane.WARNING_MESSAGE);

		end = false;
		start = false;
		rect = new Rect[5][5];
		front = new int[5][5];
		back = new int[5][5];
		st = new StopWatch();

		game_num = 1;

		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				rect[i][n] = new Rect();
				rect[i][n].size = 50;
				rect[i][n].x = (i * 50) + 70;
				rect[i][n].y = (n * 50) + 80;
				rect[i][n].color = Color.WHITE;
				front[i][n] = (i * 5) + n + 1;
				back[i][n] = front[i][n] + 25;

			}
		}

		shuffle_set();

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

	public void reset() {
		end = false;
		game_num = 1;
		st.play=false;
		st.reset = true;
		//st.interrupt();
		st = new StopWatch();
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 5; n++) {
				rect[i][n].num = 0;
			}
		}
		shuffle_set();
		repaint();
	}

	void setRankPanel() {

	}

	@Override
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
		if (start) {
			Font font = new Font("", Font.BOLD, 30);
			g.setFont(font);
			g.drawString(st.data, 30, 70);
			g.setFont(new Font("", Font.BOLD, 15));
			g.drawString("다음 숫자 : " + game_num, 250, 70);

			font = new Font("", Font.BOLD, 20);
			g.setFont(font);
			for (int i = 0; i < 5; i++) {
				for (int n = 0; n < 5; n++) {
					g.setColor(rect[i][n].color);
					g.fillRect(rect[i][n].x, rect[i][n].y, rect[i][n].size, rect[i][n].size);
					g.setColor(Color.BLACK);
					g.drawRect(rect[i][n].x, rect[i][n].y, rect[i][n].size, rect[i][n].size);
					if (rect[i][n].num > 0 && rect[i][n].num <= 50) {
						g.drawString(rect[i][n].num + "", rect[i][n].x + 20, rect[i][n].y + 30);
					} else {
						g.drawString("", rect[i][n].x + 20, rect[i][n].y + 30);
					}

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
					System.out.println("x");
					if (rect[i][n].y < y && y < rect[i][n].y + rect[i][n].size) {
						System.out.println("y");
						if (rect[i][n].num == game_num) {
							if (game_num == 1) {
								st.start();
								System.out.println("Start");
							}
							if (game_num < 26) {
								rect[i][n].num = back[i][n];
								game_num += 1;
								System.out.println(game_num);
							} else {
								if (game_num == 50) {
									rect[i][n].num = 0;
									game_num = 0;
									end = true;		
									st.play = false;
									Rank.intstance.setInfo(FileManager.LOG, st.data);
									FileManager.instance.saveRankData();
								} else {
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
		// System.out.println(x + " " + y);
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
		if (e.getSource() == back_main) {
			_MainSystem.frame.setContentPane(new Login_Panel());
			_MainSystem.frame.revalidate();
		} else if (e.getSource() == ranking_button) {
			_MainSystem.frame.setContentPane(new Rank_Panel());
			_MainSystem.frame.revalidate();
		} else if (e.getSource() == game_button) {
			start = true;
		} else if (e.getSource() == reset_button) {
			
			reset();
		}
	}

}
