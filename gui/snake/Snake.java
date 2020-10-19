package gui_snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Rect {
	int x;
	int y;
	int size;
	int type;
}

class MyPanel extends JPanel implements ActionListener, MouseListener {

	final int SIZE = 9;
	final int REC_SIZE = 40;

	final int GRID_SIZE = 30;
	Rect[][] map;
	JButton[] dir;
	int snakeSize;
	int[][] snake;
	int[][] item;
	int headY;
	int headX;
	int tailY;
	int tailX;
	boolean end;

	public MyPanel() {

		setLayout(null);
		addMouseListener(this);
		setBackground(Color.WHITE);

		map = new Rect[SIZE][SIZE];
		dir = new JButton[4];



		init();
		setButton();
	}

	void init() {
		Random ran = new Random();
		snake = new int[8][2];
		item = new int[4][2];
		snakeSize = 4;
		end = false;
		// set the location of snake
		for (int i = 0; i < snakeSize; i++) {
			snake[i][0] = i + 3; // snake location Y
			snake[i][1] = 3; // snake location X
		}
		headY = snake[0][0];
		headX = snake[0][1];
		tailY = snake[snakeSize - 1][0];
		tailX = snake[snakeSize - 1][1];
		// set item
		for (int i = 0; i < 4; i++) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			int check = -1;
			for (int j = 0; j < snakeSize; j++) {
				if (rY == snake[j][0]&& rX == snake[j][1]) {
					check = j;
					break;
				}
			}
			if (check == -1) {
				item[i][0] = rY;
				item[i][1] = rX;
			} else {
				i--;
			}
		}
		int snakeLo = 1;
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				Rect rect = new Rect();
				rect.x = 10 + (x * REC_SIZE);
				rect.y = 10 + (y * REC_SIZE);
				rect.size = REC_SIZE;
				int check = -1;
				for (int j = 0; j < snakeSize; j++) {
					if (y == snake[j][0] && x == snake[j][1]) {
						check = j;
						rect.type = snakeLo++;
						break;
					}
				}
				for (int j = 0; j < 4; j++) {
					if (y == item[j][0] && x == item[j][1]) {
						check = j;
						rect.type = -1;
						break;
					}
				}
				if (check == -1) {
					rect.type = 0;
				}
				map[y][x] = rect;

			}

		}
	}

	void setButton() {
		// 이동버튼
		for (int i = 0; i < 4; i++) {
			dir[i] = new JButton();
			dir[i].setSize(50, 50);
			if (i < 3) {
				dir[i].setLocation(350 + 50 * (i + 1), 300);
			} else {
				dir[i].setLocation(350 + 50 * 2, 250);
			}
			dir[i].addActionListener(this);

			add(dir[i]);
		}

		dir[0].setText("←");
		dir[1].setText("↓");
		dir[2].setText("→");
		dir[3].setText("↑");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (end) {
			return;
		} else {
			int idx = 0;
			for (int i = 0; i < 4; i++) {
				if (e.getSource() == dir[i]) {
					idx = i;
				}
			}

			// dir[0].setText("←");

			if (idx == 0) {
				if (headX > 0) {// not on the edge
					headX -= 1;
					if (map[headY][headX].type == 0) {// normal move
						map[snake[snakeSize - 1][0]][snake[snakeSize - 1][1]].type = 0;
						for (int i = snakeSize - 1; i > 0; i--) {
							snake[i][0] = snake[i - 1][0];
							snake[i][1] = snake[i - 1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					} else if (map[headY][headX].type == -1) {// item, plus
																// length
						snakeSize++;
						for (int i = snakeSize - 1; i > 0; i--) {
							snake[i][0] = snake[i - 1][0];
							snake[i][1] = snake[i - 1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					} else if (map[headY][headX].type == 2) {
						System.out.println("Cannot go");
					} else if (map[headY][headX].type > 2 && map[headY][headX].type <= snakeSize) {
						System.out.println("Crush yourself");
						end = true;
					} else {
						System.out.println("Error" + map[headY][headX]);
					}

				} else {
					System.out.println("Your on the edge");
				}

				// dir[2].setText("→");

			} else if (idx == 2) {
				if (headX < 9) {// not on the edge
					headX += 1;
					if (map[headY][headX].type == 0) {// normal move
						map[snake[snakeSize - 1][0]][snake[snakeSize - 1][1]].type = 0;
						for (int i = snakeSize - 1; i > 0; i--) {
							snake[i][0] = snake[i - 1][0];
							snake[i][1] = snake[i - 1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					} else if (map[headY][headX].type == -1) {// item, plus
																// length
						snakeSize++;
						for (int i = snakeSize - 1; i > 0; i--) {
							snake[i][0] = snake[i - 1][0];
							snake[i][1] = snake[i - 1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;

					} else if (map[headY][headX].type == 2) {
						System.out.println("Cannot go");
					} else if (map[headY][headX].type > 2 && map[headY][headX].type <= snakeSize) {
						System.out.println("Crush yourself");
						end = true;
					} else {
						System.out.println("Error" + map[headY][headX]);
					}

				} else {
					System.out.println("Your on the edge");
				}
				// dir[3].setText("↑");
			} else if (idx == 3) {
				if (headY > 0) {// not on the edge
					headY -= 1;
					if (map[headY][headX].type == 0) {// normal move
						map[snake[snakeSize - 1][0]][snake[snakeSize - 1][1]].type = 0;
						for (int i = snakeSize - 1; i > 0; i--) {
							snake[i][0] = snake[i - 1][0];
							snake[i][1] = snake[i - 1][1];

						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					} else if (map[headY][headX].type == -1) {// item, plus
																// length
						snakeSize++;
						for (int i = snakeSize - 1; i > 0; i--) {
							snake[i][0] = snake[i - 1][0];
							snake[i][1] = snake[i - 1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					} else if (map[headY][headX].type == 2) {
						System.out.println("Cannot go");
					} else if (map[headY][headX].type > 2 && map[headY][headX].type <= snakeSize) {
						System.out.println("Crush yourself");
						end = true;
					} else {
						System.out.println("Error" + map[headY][headX]);
					}

				} else {
					System.out.println("Your on the edge");
				}
				// dir[1].setText("↓");
			} else if (idx == 1) {
				if (headY < 9) {// not on the edge
					headY += 1;
					if (map[headY][headX].type == 0) {// normal move
						map[snake[snakeSize - 1][0]][snake[snakeSize - 1][1]].type = 0;
						for (int i = snakeSize - 1; i > 0; i--) {
							snake[i][0] = snake[i - 1][0];
							snake[i][1] = snake[i - 1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					} else if (map[headY][headX].type == -1) {// item, plus
																// length
						snakeSize++;
						for (int i = snakeSize - 1; i > 0; i--) {
							snake[i][0] = snake[i - 1][0];
							snake[i][1] = snake[i - 1][1];
						}
						snake[0][0] = headY;
						snake[0][1] = headX;
					} else if (map[headY][headX].type == 2) {
						System.out.println("Cannot go");
					} else if (map[headY][headX].type > 2 && map[headY][headX].type <= snakeSize) {
						System.out.println("Crush yourself");
						end = true;
					} else {
						System.out.println("Error" + map[headY][headX]);
					}

				} else {
					System.out.println("Your on the edge");
				}
			} else {

			}
			for (int i = 0; i < snakeSize; i++) {
				map[snake[i][0]][snake[i][1]].type = i + 1;
			}
		}
	}

	@Override

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		try {

			Thread.sleep(10);

			repaint();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		for (int y = 0; y < SIZE; y++) {

			for (int x = 0; x < SIZE; x++) {

				g.drawRect(map[y][x].x, map[y][x].y, map[y][x].size, map[y][x].size);

				if (map[y][x].type == -1) {

					g.setColor(Color.green);

					g.fillOval(map[y][x].x, map[y][x].y, map[y][x].size, map[y][x].size);
					g.setColor(Color.BLACK);

				}				else if (map[y][x].type ==1) {

					g.setColor(Color.red);

					g.fillOval(map[y][x].x, map[y][x].y, map[y][x].size, map[y][x].size);

					g.setColor(Color.BLACK);
				}


				else if (map[y][x].type >1) {

					g.setColor(Color.ORANGE);

					g.fillOval(map[y][x].x, map[y][x].y, map[y][x].size, map[y][x].size);

					g.setColor(Color.BLACK);
				}

			}

		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

public class Snake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 650;

		int height = 500;

		JFrame frame = new JFrame();

		frame.setTitle("Snake Game");

		frame.setSize(width, height);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

		Toolkit tk = Toolkit.getDefaultToolkit();

		Dimension screenSize = tk.getScreenSize();

		frame.setLocation(screenSize.width / 2 - width / 2, screenSize.height / 2 - height / 2);

		MyPanel mp = new MyPanel();

		frame.setContentPane(mp);

		frame.revalidate();

	}

}
