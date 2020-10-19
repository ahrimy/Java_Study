package gui_mealTicket;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class ManagerPanel extends JPanel implements ActionListener {
	JButton[] listPlus;
	JButton[] listMinus;
	JButton save;
	JButton ticketPlus;
	JButton ticketMinus;
	Data[] mCounts;
	JButton home;
	int tCounts;

	ManagerPanel() {
		setLayout(null);
		listPlus = new JButton[6];
		listMinus = new JButton[6];

		mCounts = new Data[6];
		init();
		setButton();

	}

	void init() {
		tCounts = 0;
		mCounts[0] = new Data("50000", 50000, 0);
		mCounts[1] = new Data("10000", 10000, 0);
		mCounts[2] = new Data("5000", 5000, 0);
		mCounts[3] = new Data("1000", 1000, 0);
		mCounts[4] = new Data("500", 500, 0);
		mCounts[5] = new Data("100", 100, 0);

	}

	void setButton() {
		for (int i = 0; i < 6; i++) {
			listPlus[i] = new JButton();
			listPlus[i].setSize(50, 50);

			listPlus[i].setLocation(200, 70 + (i * 70));

			listPlus[i].addActionListener(this);

			add(listPlus[i]);
			listPlus[i].setText("+");

			listMinus[i] = new JButton();
			listMinus[i].setSize(50, 50);

			listMinus[i].setLocation(150, 70 + (i * 70));

			listMinus[i].addActionListener(this);

			add(listMinus[i]);
			listMinus[i].setText("-");

		}
		save = new JButton();
		save.setSize(100, 50);
		save.setLocation(200, 500);
		save.addActionListener(this);
		add(save);
		save.setText("PUT");
		home = new JButton();
		home.setSize(100, 50);
		home.setLocation(10, 500);
		home.addActionListener(this);
		add(home);
		home.setText("HOME");
		ticketPlus = new JButton();
		ticketMinus = new JButton();

		ticketPlus.setSize(50, 50);
		ticketPlus.setLocation(490, 70);
		ticketPlus.addActionListener(this);
		add(ticketPlus);
		ticketPlus.setText("+");

		ticketMinus.setSize(50, 50);
		ticketMinus.setLocation(440, 70);
		ticketMinus.addActionListener(this);
		add(ticketMinus);
		ticketMinus.setText("-");
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		try {

			Thread.sleep(10);

			repaint();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		Font font = new Font("", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("Cash", 90, 30);
		g.drawString("Ticket", 380, 30);
		font = new Font("", Font.PLAIN, 20);
		g.setFont(font);
		g.drawString("Ticket : " + FileManager.instance.dataManager.get("ticket").getCnt() + " + " + tCounts, 300, 100);

		for (int i = 0; i < mCounts.length; i++) {
			g.drawString(mCounts[i].getName() + " : "
					+ FileManager.instance.dataManager.get(mCounts[i].getName()).getCnt() + " + " + mCounts[i].getCnt(),
					10, 100 + (i * 70));
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int idx = -1;
		boolean isPlus = true;
		for (int i = 0; i < 6; i++) {
			if (e.getSource() == listPlus[i]) {
				idx = i;
				isPlus = true;
			}
			if (e.getSource() == listMinus[i]) {
				idx = i;
				isPlus = false;
			}
		}
		if (idx > -1) {
			if (isPlus) {
				int cnt = mCounts[idx].getCnt();
				mCounts[idx].setCnt(cnt + 1);
			} else {
				int cnt = mCounts[idx].getCnt();
				if (cnt > 0) {
					mCounts[idx].setCnt(cnt - 1);
				}
			}
		}

		if (e.getSource() == ticketPlus) {
			tCounts++;
		}
		if (e.getSource() == ticketMinus) {
			if (tCounts > 0) {
				tCounts--;
			}
		}

		if (e.getSource() == save) {
			int cnt = FileManager.instance.dataManager.get("ticket").getCnt();
			FileManager.instance.dataManager.get("ticket").setCnt(cnt + tCounts);
			for (int i = 0; i < mCounts.length; i++) {
				cnt = FileManager.instance.dataManager.get(mCounts[i].getName()).getCnt();
				FileManager.instance.dataManager.get(mCounts[i].getName()).setCnt(cnt + mCounts[i].getCnt());
			}
			FileManager.instance.add();
			init();
		}
		if(e.getSource()==home){
			MealTicket.frame.setContentPane(new SelectPanel());
			MealTicket.frame.revalidate();
		}
	}

}