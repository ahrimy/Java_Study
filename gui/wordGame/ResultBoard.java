package gui_wordGame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultBoard extends JPanel implements ActionListener {
	JLabel score;
	JLabel scoreCnt;
	JButton home;
	JButton retry;

	ResultBoard(GameListBoard game_list_board) {
		Font font = new Font("", Font.BOLD, 30);

		score = new JLabel("Score : " + game_list_board.scoreCnt * 10);
		score.setFont(font);
		score.setSize(200, 100);
		score.setLocation(10, 50);
		score.setOpaque(true);
		add(score);
		scoreCnt = new JLabel("Correct : " + game_list_board.scoreCnt);
		scoreCnt.setFont(font);
		scoreCnt.setSize(200, 100);
		scoreCnt.setLocation(10, 160);
		scoreCnt.setOpaque(true);
		add(scoreCnt);

		home = new JButton("Home");
		home.setSize(100, 50);
		home.setLocation(50, 400);
		home.addActionListener(this);
		add(home);

		retry = new JButton("Retry");
		retry.setSize(100, 50);
		retry.setLocation(50, 460);
		retry.addActionListener(this);
		add(retry);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == home) {

			MainSystem.frame.setContentPane(new TitlePanel());
			MainSystem.frame.revalidate();

		} else if (e.getSource() == retry) {
			MainSystem.frame.setContentPane(new GamePanel());
			MainSystem.frame.revalidate();
		}
	}

}
