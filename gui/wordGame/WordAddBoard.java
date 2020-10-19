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

public class WordAddBoard extends JPanel implements ActionListener {
	Font font = new Font("", Font.BOLD, 20);
	JButton insert_btn = new JButton();
	JTextField eng_tf = new JTextField();
	JTextField kor_tf = new JTextField();
	JLabel eng_lb = new JLabel();
	JLabel kor_lb = new JLabel();;
	WordListBoard word_list_board = null;
	JButton reset_btn = new JButton();

	WordAddBoard(WordListBoard word_list_board) {
		this.word_list_board = word_list_board;
		setLayout(null);
		eng_lb.setSize(100, 30);
		eng_lb.setLocation(30, 30);
		eng_lb.setFont(font);
		eng_lb.setText(" Word : ");
		eng_lb.setBackground(Color.ORANGE);
		eng_lb.setOpaque(true);
		add(eng_lb);
		eng_tf.setSize(150, 30);
		eng_tf.setLocation(150, 30);
		add(eng_tf);

		kor_lb.setSize(100, 30);
		kor_lb.setLocation(30, 80);
		kor_lb.setFont(font);
		kor_lb.setText(" Meaning: ");
		kor_lb.setBackground(Color.ORANGE);
		kor_lb.setOpaque(true);
		add(kor_lb);

		kor_tf.setSize(150, 30);
		kor_tf.setLocation(150, 80);
		add(kor_tf);

		insert_btn.setSize(100, 40);
		insert_btn.setLocation(30, 130);
		insert_btn.setBackground(Color.WHITE);
		insert_btn.setText("Insert");
		add(insert_btn);
		insert_btn.addActionListener(this);

		reset_btn.setSize(100, 40);
		reset_btn.setLocation(180, 130);
		reset_btn.setBackground(Color.WHITE);
		reset_btn.setText("Reset");
		add(reset_btn);
		reset_btn.addActionListener(this);
	}
	public void init(){
		eng_tf.setText("");
		kor_tf.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == insert_btn) {
			// Word temp = new Word(eng_tf.getText(),kor_tf.getText());
			if(eng_tf.getText().equals("")||kor_tf.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Field is not filled", "ALERT", JOptionPane.ERROR_MESSAGE);
				return;
			}
			word_list_board.insert_word(eng_tf.getText(), kor_tf.getText());
			init();
		} else if (e.getSource() == reset_btn) {
			//word_list_board.test_rand_insert();
			init();
		}
	}

}
