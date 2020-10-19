package gui_wordGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ManagePanel extends JPanel implements ActionListener{
	WordAddBoard word_add_board = null;
	WordListBoard word_list_board = null;
	JButton back;
	ManagePanel() {
		setLayout(null);
		
		word_list_board = new WordListBoard();
		word_list_board.setSize(400, 600);
		word_list_board.setBackground(Color.PINK);
		word_list_board.setLocation(500, 100);
		add(word_list_board);
	
		word_add_board = new WordAddBoard(word_list_board);
		word_add_board.setSize(330, 200);
		word_add_board.setBackground(Color.PINK);
		word_add_board.setLocation(50, 100);
		add(word_add_board);	
		
		back = new JButton("Back");
		back.setSize(100,50);
		back.setBackground(Color.gray);
		back.setLocation(800,20);
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
