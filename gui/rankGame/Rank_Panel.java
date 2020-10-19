package gui_rankGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rank_Panel extends JPanel implements ActionListener{
	JLabel mainLb;
	JLabel[] rankLb;
	
	JButton backMain;
	
	public Rank_Panel() {
		
		setLayout(null);
		
		backMain = new JButton("처음으로");
		backMain.setBackground(Color.RED);
		backMain.setForeground(Color.WHITE);
		backMain.setBounds(140, 250, 120, 30);
		backMain.addActionListener(this);
		add(backMain);
		
		Font font = new Font("", Font.BOLD, 30);
		
		mainLb = new JLabel("순발력 게임 랭킹");
		mainLb.setFont(font);
		mainLb.setBounds(50, 2, 300, 150);
		add(mainLb);
		
		rankLb = new JLabel[3];
		
		font = new Font("", Font.BOLD, 20);
		for(int i=0; i<3; i++) {
			rankLb[i] = new JLabel(); 
			rankLb[i].setFont(font);
			rankLb[i].setBounds(80, 60+(30*i), 200, 100);
			add(rankLb[i]);
		}
		
		for(int i=0; i<Rank.intstance.rank.length; i++) {
			rankLb[i].setText("[" + (i+1) + "등] " + Rank.intstance.rank[i][0] + " : " + Rank.intstance.rank[i][1]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backMain) {
			_MainSystem.frame.setContentPane(new Login_Panel());
			_MainSystem.frame.revalidate();
			
		}
	}
}
