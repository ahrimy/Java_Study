package gui_wordGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WordBoard extends JPanel implements ActionListener {
	public JLabel lable_num = new JLabel();
	int num = 0;
	JLabel lable_eng = new JLabel();
	JLabel lable_kor = new JLabel();
	JButton update_btn = new JButton();
	JButton delete_btn = new JButton();
	WordListBoard word_list_board = null;

	WordBoard(int index, Word word, WordListBoard panel) {
		word_list_board = panel;
		setLayout(null);
		int pos = index % panel.page_word_max;
		setLocation(40, 40 + pos * 50);
		setSize(320, 30);
		// ==============================================
		num = index;
		lable_num.setSize(40, 30);
		lable_num.setLocation(0, 0);
		lable_num.setText((num + 1) + "");
		add(lable_num);
		
		lable_eng.setSize(80, 30);
		lable_eng.setLocation(40, 0);
		lable_eng.setText(word.eng);
		lable_eng.setBackground(Color.magenta);
		lable_eng.setOpaque(true);
		add(lable_eng);

		lable_kor.setSize(80, 30);
		lable_kor.setLocation(120, 0);
		lable_kor.setText(word.kor);
		add(lable_kor);

		update_btn.setSize(60, 30);
		update_btn.setLocation(200, 0);
		update_btn.setBackground(Color.LIGHT_GRAY);
		update_btn.setText("Edit");
		update_btn.addActionListener(this);
		add(update_btn);

		delete_btn.setSize(60, 30);
		delete_btn.setLocation(260, 0);
		delete_btn.setBackground(Color.LIGHT_GRAY);
		delete_btn.setText("Delete");
		delete_btn.addActionListener(this);
		add(delete_btn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == update_btn) {
			String eng = JOptionPane.showInputDialog("[Edit] Enter the word ");
			String kor = JOptionPane.showInputDialog("[Edit] Enter the meaning");
			if (!eng.isEmpty() && !kor.isEmpty()) {
				word_list_board.update_word(num, eng, kor);
			}
		} else if (e.getSource() == delete_btn) {
			int result = JOptionPane.showConfirmDialog(null, "Are you going to delete the word?", "Delete",
					JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				word_list_board.delete_word(num);
			}

		}
	}

}
