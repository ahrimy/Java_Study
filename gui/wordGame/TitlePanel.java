package gui_wordGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TitlePanel extends JPanel implements ActionListener
{
	JButton startBtn = new JButton(); 
	JButton manageBtn = new JButton(); 
	TitlePanel(){	
		setLayout(null);
		Font font = new Font("",Font.BOLD,40);
		startBtn.setFont(font);
		startBtn.setText("Game");
		startBtn.setSize(500, 200);
		startBtn.setLocation(250 , 150);
		startBtn.setBackground(Color.WHITE);
		startBtn.addActionListener(this);
		add(startBtn);
		
		manageBtn.setFont(font);
		manageBtn.setText("Manager");
		manageBtn.setSize(500, 200);
		manageBtn.setLocation(250 , 380);
		manageBtn.setBackground(Color.WHITE);
		manageBtn.addActionListener(this);
		add(manageBtn);
		FileManager.instance.loadData();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==startBtn){
			MainSystem.frame.setContentPane( new GamePanel());
			MainSystem.frame.revalidate();

		}else if(e.getSource()==manageBtn){

			MainSystem.frame.setContentPane( new ManagePanel());
			MainSystem.frame.revalidate();

		}
	}

}
