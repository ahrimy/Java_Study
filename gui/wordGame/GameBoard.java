package gui_wordGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameBoard extends JPanel implements ActionListener {
	GameListBoard game_list_board = null;
	int que_num = 1;
	static final int que_max = 10;
	String answers[] = new String[que_max];
	public ResultBoard result;
	JButton prev_que;
	JButton next_que;
	JButton clear;
	JButton submit;
	JButton enter;
	JLabel question = new JLabel();
	JTextField answer = new JTextField();
	boolean end;

	GameBoard(GameListBoard game_list_board) {
		this.game_list_board = game_list_board;

		end = false;
		setLayout(null);
		question.setSize(300, 100);
		question.setLocation(150, 100);
		question.setBackground(Color.WHITE);
		question.setOpaque(true);
		add(question);

		answer.setSize(300, 50);
		answer.setLocation(150, 250);
		add(answer);

		submit = new JButton("Submit");
		submit.setSize(100, 50);
		submit.setLocation(490, 10);
		submit.setBackground(Color.ORANGE);
		submit.addActionListener(this);
		add(submit);

		prev_que = new JButton("¢¸");
		prev_que.setSize(100, 50);
		prev_que.setBackground(Color.PINK);
		prev_que.setLocation(70, 400);
		prev_que.addActionListener(this);
		add(prev_que);

		next_que = new JButton("¢º");
		next_que.setSize(100, 50);
		next_que.setBackground(Color.PINK);
		next_que.setLocation(470, 400);
		next_que.addActionListener(this);
		add(next_que);

		clear = new JButton("Clear");
		clear.setSize(100, 50);
		clear.setBackground(Color.PINK);
		clear.setLocation(270, 400);
		clear.addActionListener(this);
		add(clear);

		enter = new JButton("Enter");
		enter.setSize(100, 50);
		enter.setBackground(Color.PINK);
		enter.setLocation(450, 250);
		enter.addActionListener(this);
		add(enter);

		setGame();
	}

	void setGame() {
		// getWord();
		showWord(que_num);
	}

	void showWord(int index) {
		question.setFont(new Font("", Font.BOLD, 30));
		question.setText(game_list_board.word_list.get(index - 1).eng);
	}

	void showScore() {
		result = new ResultBoard(game_list_board);
		result.setSize(400, 400);
		result.setBackground(Color.GREEN);
		result.setLocation(10, 10);
		add(result);
	}

	void check() {
		game_list_board.check();
		System.out.println(game_list_board.scoreCnt);
		//showScore();
		//repaint();
		end = true;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (end) {
			return;
		}
		if (e.getSource() == prev_que) {
			if (que_num > 1) {
				que_num--;
				showWord(que_num);
			}
		} else if (e.getSource() == next_que) {
			if (que_num < que_max) {
				que_num++;
				showWord(que_num);
			}
		} else if (e.getSource() == clear) {
			answer.setText("");
		} else if (e.getSource() == submit) {
			check();

			// MainSystem.frame.setContentPane( new
			// ResultBoard(game_list_board));
			// MainSystem.frame.revalidate();
		} else if (e.getSource() == enter) {
			if (!answer.getText().equals("")) {
				game_list_board.insertAnswer(que_num, answer.getText());
				answer.setText("");
				if (que_num < que_max) {
					showWord(++que_num);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Field must be filled", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
