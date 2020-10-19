package gui_board;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ShowBoard extends JPanel implements ActionListener {
	private BoardListPanel boardListPanel = null;

	public JLabel lableNum = new JLabel();
	int num = 0;
	JLabel lableTitle = new JLabel();
	JLabel lableContent = new JLabel();
	JButton updateBtn = new JButton();
	JButton deleteBtn = new JButton();
	JTextField titleTf = new JTextField();
	JTextArea contentTa = new JTextArea();
	ListBoard listBoard = null;
	
	private Font font = new Font("", Font.BOLD, 20);

	ShowBoard(BoardListPanel boardListPanel) {
		this.boardListPanel = boardListPanel;
		setLayout(null);

		lableTitle.setSize(80, 30);
		lableTitle.setLocation(30, 30);
		lableTitle.setText("Title");
		lableTitle.setBackground(Color.magenta);
		lableTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lableTitle.setOpaque(true);
		lableTitle.setFont(font);
		add(lableTitle);

		lableContent.setSize(100, 30);
		lableContent.setLocation(30, 80);
		lableContent.setText("Content");
		lableContent.setOpaque(true);
		lableContent.setFont(font);
		lableContent.setHorizontalAlignment(SwingConstants.CENTER);
		add(lableContent);
		titleTf.setSize(420, 30);
		titleTf.setLocation(150, 30);
		titleTf.setFont(font);
		titleTf.setEditable(false);
		add(titleTf);

		updateBtn.setSize(100, 30);
		updateBtn.setLocation(195, 540);
		updateBtn.setBackground(Color.LIGHT_GRAY);
		updateBtn.setText("Edit");
		updateBtn.addActionListener(this);
		add(updateBtn);
		contentTa.setSize(540, 400);
		contentTa.setLocation(30, 120);
		contentTa.setFont(font);
		contentTa.setWrapStyleWord(true);
		contentTa.setLineWrap(true);
		contentTa.setEditable(false);
		add(contentTa);

		deleteBtn.setSize(100, 30);
		deleteBtn.setLocation(305, 540);
		deleteBtn.setBackground(Color.LIGHT_GRAY);
		deleteBtn.setText("Delete");
		deleteBtn.addActionListener(this);
		add(deleteBtn);
	}

	public void selectBoard(Board board) {

		titleTf.setEditable(true);
		titleTf.setText(board.title);
		contentTa.setEditable(true);
		contentTa.setText(board.content);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == updateBtn) {
			String title = titleTf.getText();
			String content = contentTa.getText();
			if (!title.isEmpty() && !content.isEmpty()) {
				
				boardListPanel.updateBoard(new Board(title, content));
			}
		} else if (e.getSource() == deleteBtn) {
			int result = JOptionPane.showConfirmDialog(null, "Are you going to delete the word?", "Delete",
					JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				titleTf.setText("");
				contentTa.setText("");
				titleTf.setEditable(false);
				contentTa.setEditable(false);
				boardListPanel.deleteBoard();
			}

		}
	}

}
