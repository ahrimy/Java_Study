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

public class AddBoard extends JPanel implements ActionListener {
	Font font = new Font("", Font.BOLD, 20);
	JButton insertBtn = new JButton();
	JTextField titleTf = new JTextField();
	JTextArea contentTa = new JTextArea();
	JLabel titleLb = new JLabel();
	JLabel contentLb = new JLabel();;
	JButton resetBtn = new JButton();

	AddBoard() {
		setLayout(null);
		titleLb.setSize(100, 30);
		titleLb.setLocation(30, 30);
		titleLb.setFont(font);
		titleLb.setText(" Title : ");
		titleLb.setBackground(Color.ORANGE);
		titleLb.setOpaque(true);
		add(titleLb);
		titleTf.setSize(320, 30);
		titleTf.setLocation(150, 30);
		add(titleTf);

		contentLb.setSize(100, 30);
		contentLb.setLocation(30, 80);
		contentLb.setFont(font);
		contentLb.setText(" Content: ");
		contentLb.setBackground(Color.ORANGE);
		contentLb.setOpaque(true);
		add(contentLb);

		contentTa.setSize(790, 450);
		contentTa.setLocation(30, 120);
		contentTa.setWrapStyleWord(true);
		contentTa.setLineWrap(true);
		add(contentTa);

		insertBtn.setSize(100, 40);
		insertBtn.setLocation(720, 30);
		insertBtn.setBackground(Color.WHITE);
		insertBtn.setText("Insert");
		add(insertBtn);
		insertBtn.addActionListener(this);

		resetBtn.setSize(100, 40);
		resetBtn.setLocation(590, 30);
		resetBtn.setBackground(Color.WHITE);
		resetBtn.setText("Reset");
		add(resetBtn);
		resetBtn.addActionListener(this);
	}
	public void init(){
		titleTf.setText("");
		contentTa.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == insertBtn) {
			if(titleTf.getText().equals("")||contentTa.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Field is not filled", "ALERT", JOptionPane.ERROR_MESSAGE);
				return;
			}
			FileManager.instance.addBoard(new Board(titleTf.getText(),contentTa.getText()));
			MainSystem.frame.setContentPane( new BoardListPanel());
			MainSystem.frame.revalidate();
		} else if (e.getSource() == resetBtn) {
			init();
		}
	}

}
