package gui_board;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BoardWritePanel extends JPanel implements ActionListener{
	AddBoard addBoard = null;
	JButton list;
	BoardWritePanel() {
		setLayout(null);
		
		addBoard = new AddBoard();
		addBoard.setSize(850, 600);
		addBoard.setBackground(Color.PINK);
		addBoard.setLocation(40, 80);
		add(addBoard);	
		
		list = new JButton("Board List");
		list.setSize(100,50);
		list.setBackground(Color.gray);
		list.setLocation(800,20);
		list.addActionListener(this);
		add(list);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==list){
			MainSystem.frame.setContentPane( new BoardListPanel());
			MainSystem.frame.revalidate();
		}
	}

}
