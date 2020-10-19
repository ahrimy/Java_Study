package gui_board;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ListBoard extends JPanel implements ActionListener {
	private BoardListPanel boardListPanel = null;

	private int pageNum = 1;
	public int boardMax = 10;
	private int pageCnt = 3;
	private int startRow = 0;
	private int endRow = 0;
	private int count = 10;
	private int pageMin = 1;
	private int pageMax = 3;
	private int selectedBoard = -1;
	private Font font = new Font("", Font.BOLD, 20);

	private JButton pageBtn[] = new JButton[pageMax];
	private JButton leftBtn = null;
	private JButton rightBtn = null;
	JLabel[] list = null;
	JButton[] listTitle = null;

	ListBoard(BoardListPanel boardListPanel) {
		this.boardListPanel = boardListPanel;
		setLayout(null);
		pageBtnInit();
	}

	void pageBtnInit() {
		Component[] componentList = this.getComponents();
		for (Component c : componentList) {
			if (c instanceof JButton) {
				this.remove(c);
			}
		}
		int width = 45;
		int height = 50;
		for (int i = 0; i < pageCnt; i++) {
			pageBtn[i] = new JButton();
			pageBtn[i].setSize(width, height);
			pageBtn[i].setLocation(55 + i * 45, 520);
			pageBtn[i].setBackground(Color.WHITE);
			pageBtn[i].setText((pageNum + i) + "");
			add(pageBtn[i]);
			pageBtn[i].addActionListener(this);
		}
		pageBtn[(pageNum - 1) % 3].setBackground(Color.LIGHT_GRAY);
		leftBtn = new JButton();
		leftBtn.setSize(width + 5, height);
		leftBtn.setLocation(5, 520);
		leftBtn.setBackground(Color.WHITE);
		leftBtn.setText("¢·");
		add(leftBtn);
		leftBtn.addActionListener(this);

		rightBtn = new JButton();
		rightBtn.setSize(width + 5, height);
		rightBtn.setLocation(190, 520);
		rightBtn.setBackground(Color.WHITE);
		rightBtn.setText("¢¹");
		add(rightBtn);
		rightBtn.addActionListener(this);
		printList();
	}

	void printList() {
		System.out.println("printList()");
		Component[] componentList = this.getComponents();
		for (Component c : componentList) {
			if (c instanceof JLabel) {
				this.remove(c);
			}
		}
		startRow = (pageNum - 1) * boardMax;
		int total = FileManager.instance.boardList.size();
		endRow = startRow + boardMax;
		if (total < endRow) {
			endRow = total;
		}
		count = endRow - startRow;
		if (count < 0) {
			count = 0;
		}
		System.out.println("startRow : " + startRow);
		System.out.println("endRow : " + endRow);
		list = new JLabel[count];
		listTitle = new JButton[count];
		for (int i = 0; i < count; i++) {
			list[i] = new JLabel((startRow + i + 1) + "");
			list[i].setBounds(10, 30 + (i * 45), 225, 45);
			list[i].setBackground(Color.white);
			add(list[i]);

			listTitle[i] = new JButton((FileManager.instance.boardList.get(startRow + i).title));
			listTitle[i].setBounds(20, 0, 205, 45);
			listTitle[i].addActionListener(this);
			listTitle[i].setFont(font);
			listTitle[i].setBackground(Color.white);
			list[i].add(listTitle[i]);
		}
		System.out.println(selectedBoard+"");
		if(selectedBoard!=-1){
			if(selectedBoard>=startRow&&selectedBoard<endRow){
				listTitle[selectedBoard].setBackground(Color.DARK_GRAY);
			}
		}
		repaint();
	}

	public void deleteBoard() {
		if (selectedBoard != -1) {
			FileManager.instance.removeBoard(selectedBoard);
			selectedBoard = -1;
			printList();
		}
	}

	public void updateBoard(Board board) {
		FileManager.instance.updateBoard(selectedBoard, board.title, board.content);
		printList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == leftBtn) {
			if (pageMin > 1) {
				leftBtn();
			}

		} else if (e.getSource() == rightBtn) {
			rightBtn();
		}

		for (int i = 0; i < pageCnt; i++) {
			if (e.getSource() == pageBtn[i]) {
				pageBtn(i);
				break;
			}
		}

		for (int i = 0; i < count; i++) {
			if (e.getSource() == listTitle[i]) {
				if(selectedBoard!=-1){
					listTitle[selectedBoard].setBackground(Color.white);
				}
				selectedBoard = startRow + i;
				listTitle[selectedBoard].setBackground(Color.DARK_GRAY);
				boardListPanel.selectBoard(FileManager.instance.boardList.get(startRow + i));
				break;
			}
		}
	}

	void leftBtn() {
		pageBtn[(pageNum - 1) % 3].setBackground(Color.WHITE);
		pageMax -= pageCnt;
		pageMin -= pageCnt;
		pageNum = pageMax;
		pageBtn[(pageNum - 1) % 3].setBackground(Color.LIGHT_GRAY);
		for (int i = 0; i < pageCnt; i++) {
			pageBtn[i].setText((pageMin + i) + "");
		}
		printList();
	}

	void rightBtn() {
		pageBtn[(pageNum - 1) % 3].setBackground(Color.white);
		pageMax += pageCnt;
		pageMin += pageCnt;
		pageNum = pageMin;
		pageBtn[(pageNum - 1) % 3].setBackground(Color.LIGHT_GRAY);
		for (int i = 0; i < pageCnt; i++) {
			pageBtn[i].setText((pageMin + i) + "");
		}
		printList();
	}

	void pageBtn(int i) {
		pageBtn[(pageNum - 1) % 3].setBackground(Color.white);
		int num = Integer.parseInt(pageBtn[i].getText());
		pageNum = num;
		pageBtn[(pageNum - 1) % 3].setBackground(Color.LIGHT_GRAY);
		printList();
	}

}
