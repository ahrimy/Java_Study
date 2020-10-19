package gui_board;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BoardListPanel extends JPanel implements ActionListener{
	ListBoard listBoard = null;
	ShowBoard showBoard = null;
	JButton write;
	BoardListPanel() {
		FileManager.instance.loadData();
		basicSet();
	}
	
	private void basicSet(){
		
		setLayout(null);
		
		showBoard = new ShowBoard(this);
		showBoard.setSize(600,600);
		showBoard.setBackground(Color.pink);
		showBoard.setLocation(40, 80);
		add(showBoard);
		
		listBoard = new ListBoard(this);
		listBoard.setSize(245, 600);
		listBoard.setBackground(Color.PINK);
		listBoard.setLocation(645, 80);
		add(listBoard);
		
		
		write = new JButton("Write Board");
		write.setSize(120,50);
		write.setBackground(Color.gray);
		write.setLocation(780,20);
		write.addActionListener(this);
		add(write);
	}
	public void selectBoard(Board board){
		showBoard.selectBoard(board);
	}
	public void deleteBoard(){
		listBoard.deleteBoard();
	}
	public void updateBoard(Board board){
		listBoard.updateBoard(board);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==write){
			MainSystem.frame.setContentPane( new BoardWritePanel());
			MainSystem.frame.revalidate();
		}
	}

}
