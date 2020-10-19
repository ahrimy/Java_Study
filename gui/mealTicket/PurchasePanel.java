package gui_mealTicket;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class PurchasePanel extends JPanel implements ActionListener {
	JButton[] listPlus;
	JButton[] listMinus;
	JButton purchase;
	JButton home;
	JButton retry;
	int totalPrice;
	int inputPrice;
	int result;
	Data[] mCounts;

	PurchasePanel() {
		setLayout(null);
		listPlus = new JButton[6];
		listMinus = new JButton[6];

		mCounts = new Data[6];
		init();
		setButton();

	}

	void init() {
		result = 0;
		mCounts[0] = new Data("50000", 50000, 0);
		mCounts[1] = new Data("10000", 10000, 0);
		mCounts[2] = new Data("5000", 5000, 0);
		mCounts[3] = new Data("1000", 1000, 0);
		mCounts[4] = new Data("500", 500, 0);
		mCounts[5] = new Data("100", 100, 0);
		totalPrice = FileManager.instance.ticketCnt * FileManager.instance.dataManager.get("ticket").getPrice();

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
		purchase = new JButton();
		purchase.setSize(100, 50);
		purchase.setLocation(200, 500);
		purchase.addActionListener(this);
		add(purchase);
		purchase.setText("Purchase");
		retry = new JButton();
		retry.setSize(100, 50);
		retry.setLocation(400, 500);
		retry.addActionListener(this);
		add(retry);
		retry.setText("Retry");
		home = new JButton();
		home.setSize(100, 50);
		home.setLocation(10, 500);
		home.addActionListener(this);
		add(home);
		home.setText("Home");
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
		g.drawString("Purchase", 100, 20);
		font = new Font("", Font.PLAIN, 20);
		g.setFont(font);
		g.drawString("Ticket : " + FileManager.instance.ticketCnt, 100, 40);
		g.drawString("Price : " + totalPrice, 100, 60);

		for (int i = 0; i < mCounts.length; i++) {
			g.drawString(mCounts[i].getName() + " : " + mCounts[i].getCnt(), 10, 100 + (i * 70));
		}
		if (result == 1) {
			g.drawString((totalPrice - inputPrice) + "¿ø ºÎÁ·", 300, 100);
		} else if (result == 2) {
			g.drawString("ÀÜµ· :" + (inputPrice - totalPrice) + "¿ø", 300, 100);
		} else if (result == 3) {
			g.drawString("ÀÜµ· ºÎÁ·, ±¸¸Å ÀÚµ¿ Ãë¼Ò", 300, 100);
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
		if(e.getSource()==retry){
			init();
		}
		if(e.getSource()==home){
			MealTicket.frame.setContentPane(new SelectPanel());
			MealTicket.frame.revalidate();
		}
		if (e.getSource() == purchase) {
			inputPrice = 0;
			for (int i = 0; i < mCounts.length; i++) {
				inputPrice += mCounts[i].getPrice() * mCounts[i].getCnt();
			}
			if (inputPrice < totalPrice) {
				System.out.println(totalPrice - inputPrice + "¿ø ºÎÁ·");
				result = 1;
			} else {
				for (int i = 0; i < 6; i++) {
					int cnt = FileManager.instance.dataManager.get(mCounts[i].getName()).getCnt();
					FileManager.instance.dataManager.get(mCounts[i].getName()).setCnt(mCounts[i].getCnt() + cnt);
				}
				int charge = inputPrice - totalPrice;

				int[] charges = new int[6];
				int temp = charge;
				for (int i = 0; i < 6; i++) {
					int cnt = temp / mCounts[i].getPrice();
					if (FileManager.instance.dataManager.get(mCounts[i].getName()).getCnt() >= cnt) {
						charges[i] = cnt;
						temp -= (cnt * mCounts[i].getPrice());
					}
				}
				if (temp == 0) {

					System.out.println("ÀÜµ· :" + charge + "¿ø");
					for (int i = 0; i < 6; i++) {
						int cnt = FileManager.instance.dataManager.get(mCounts[i].getName()).getCnt();
						FileManager.instance.dataManager.get(mCounts[i].getName()).setCnt(cnt - charges[i]);
						System.out.println(mCounts[i].getName() + "¿ø " + charges[i] + "°³");
					}
					int cnt = FileManager.instance.dataManager.get("ticket").getCnt();
					FileManager.instance.dataManager.get("ticket").setCnt(cnt - FileManager.instance.ticketCnt);
					result = 2;
					FileManager.instance.add();
					this.remove(retry);

				} else {
					System.out.println("ÀÜµ· ºÎÁ·, ±¸¸Å ÀÚµ¿ Ãë¼Ò");
					for (int i = 0; i < 6; i++) {
						int cnt = FileManager.instance.dataManager.get(mCounts[i].getName()).getCnt();
						FileManager.instance.dataManager.get(mCounts[i].getName()).setCnt(cnt - mCounts[i].getCnt());
					}
					result = 3;

				}
			}
		}
	}

}