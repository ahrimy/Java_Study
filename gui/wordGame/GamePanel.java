package gui_wordGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener{
	GameBoard game_board = null;
	GameListBoard game_list_board = null;
	JButton back;
	GamePanel() {
		setLayout(null);
		game_list_board = new GameListBoard();
		game_list_board.setSize(250,550);
		game_list_board.setBackground(Color.PINK);
		game_list_board.setLocation(40,100);
		add(game_list_board);
		
		game_board = new GameBoard(game_list_board);
		game_board.setSize(600, 550);
		game_board.setBackground(Color.PINK);
		game_board.setLocation(330, 100);
		add(game_board);	
		
		back = new JButton("Back");
		back.setSize(100,50);
		back.setBackground(Color.gray);
		back.setLocation(820,40);
		back.addActionListener(this);
		add(back);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back){
			MainSystem.frame.setContentPane( new TitlePanel());
			MainSystem.frame.revalidate();
		}
	}

}
