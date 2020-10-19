package gui_wordGame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JPanel;

public class WordListBoard extends JPanel implements ActionListener {
	private Font font = new Font("", Font.BOLD, 20);
	//public Vector<Word> word_list = new Vector<Word>();
	public Vector<WordBoard> word_board_list = new Vector<>();

	private int page_num = 1;
	public int page_word_max = 10;
	private int page_btn_max = 5;
	int page_max = 0;
	int page_min = 0;
	private JButton page_btns[] = new JButton[page_btn_max];
	private JButton left_btn = null;
	private JButton right_btn = null;

	WordListBoard() {
		setLayout(null);
		page_btn_init();
	}

	void page_btn_init() {
		Component[] componentList = this.getComponents();
		for (Component c : componentList) {
			if (c instanceof JButton) {
				this.remove(c);
			}
		}
		page_min = page_num;
		page_max = page_btn_max;
		int width = 50;
		int height = 40;
		for (int i = 0; i < page_btn_max; i++) {
			page_btns[i] = new JButton();
			page_btns[i].setSize(width, height);
			page_btns[i].setLocation(75 + i * 50, 550);
			page_btns[i].setBackground(Color.WHITE);
			page_btns[i].setText((page_num + i) + "");
			add(page_btns[i]);
			page_btns[i].addActionListener(this);
		}

		left_btn = new JButton();
		left_btn.setSize(width, height);
		left_btn.setLocation(25, 550);
		left_btn.setBackground(Color.WHITE);
		left_btn.setText("◁");
		add(left_btn);
		left_btn.addActionListener(this);

		right_btn = new JButton();
		right_btn.setSize(width, height);
		right_btn.setLocation(325, 550);
		right_btn.setBackground(Color.WHITE);
		right_btn.setText("▷");
		add(right_btn);
		right_btn.addActionListener(this);
		print_word_list();
	}

	void print_word_list() {
		System.out.println("print_word_list()");
		Component[] componentList = this.getComponents();
		for (Component c : componentList) {
			if (c instanceof WordBoard) {
				this.remove(c);
			}
		}
		int start_index = (page_num - 1) * page_word_max;
		int total = FileManager.instance.wordManager.size() - start_index;
//		int total = word_list.size() - start_index;
		int count = page_word_max;
		if (total < page_word_max) {
			count = total;
		}
		word_board_list = new Vector<>();
		for (int i = 0; i < count; i++) {
			WordBoard wb = new WordBoard(i + start_index,FileManager.instance.wordManager.get(start_index + i), this);
//			WordBoard wb = new WordBoard(i + start_index, word_list.get(start_index + i), this);
			add(wb);
			word_board_list.add(wb);
		}
		repaint();
	}

	public void insert_word(String eng, String kor) {
		Word word = new Word();
		word.eng = eng;
		word.kor = kor;
//		word_list.add(word);
		FileManager.instance.addWord(word);
		print_word_list();

	}

	public void delete_word(int index) {
		FileManager.instance.removeWord(index);
		print_word_list();
	}

	public void update_word(int index, String eng, String kor) {
//		word_list.get(index).eng = eng;
//		word_list.get(index).kor = kor;
		FileManager.instance.updateWord(index,eng,kor);
		print_word_list();
	}

//	public void test_rand_insert() {
//		String[] en = { "a", "b", "c", "d", "e", "f", "g" };
//		String[] ko = { "가", "나", "다", "라", "마", "사", "자" };
//		Random ran = new Random();
//		String temp_en = "";
//		String temp_ko = "";
//		for (int i = 0; i < 5; i++) {
//			int id = ran.nextInt(en.length);
//			temp_en += en[id];
//			temp_ko += ko[id];
//		}
//		insert_word(temp_en, temp_ko);
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == left_btn) {
			left_btn_click();

		} else if (e.getSource() == right_btn) {
			right_btn_click();
		}

		for (int i = 0; i < page_btn_max; i++) {
			if (e.getSource() == page_btns[i]) {
				num_btn_click(i);
				break;
			}
		}
	}

	void left_btn_click() {
		page_max -= page_btn_max;
		page_min -= page_btn_max;
		page_num = page_max;
		for (int i = 0; i < page_btn_max; i++) {
			int num = Integer.parseInt(page_btns[i].getText());
			page_btns[i].setText((num - page_btn_max) + "");
		}
		if (page_min < 0) {
			page_min = 1;
			page_max = 5;
			page_num = 1;
			for (int i = 0; i < page_btn_max; i++) {
				page_btns[i].setText((i + 1) + "");
			}
		}
		print_word_list();
	}

	void right_btn_click() {
		page_max += page_btn_max;
		page_min += page_btn_max;
		page_num = page_min;

		for (int i = 0; i < page_btn_max; i++) {
			int num = Integer.parseInt(page_btns[i].getText());
			page_btns[i].setText((num + page_btn_max) + "");
		}
		print_word_list();
	}

	void num_btn_click(int i) {
		int num = Integer.parseInt(page_btns[i].getText());
		page_num = num;
		print_word_list();
	}

}
