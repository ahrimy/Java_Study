package gui_mealTicket;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class CustomerPanel extends JPanel implements ActionListener {
	JButton ticketPlus;
	JButton ticketMinus;
	JButton next;
	boolean isMax;

	CustomerPanel() {
		setLayout(null);
		setButton();
		init();
	}

	void init() {
		isMax = false;
		FileManager.instance.ticketCnt = 0;
	}

	void setButton() {
		ticketPlus = new JButton();
		ticketMinus = new JButton();

		ticketPlus.setSize(50, 50);
		ticketPlus.setLocation(50, 100);
		ticketPlus.addActionListener(this);
		add(ticketPlus);
		ticketPlus.setText("+");

		ticketMinus.setSize(50, 50);
		ticketMinus.setLocation(200, 100);
		ticketMinus.addActionListener(this);
		add(ticketMinus);
		ticketMinus.setText("-");

		next = new JButton();
		next.setSize(100, 50);
		next.setLocation(200, 200);
		next.addActionListener(this);
		add(next);
		next.setText("NEXT");
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
		Font font = new Font("", Font.BOLD, 30);
		g.setFont(font);
		g.drawString("Ticket", 100, 30);
		font = new Font("", Font.PLAIN, 20);
		g.setFont(font);
		g.drawString("ticket", 130, 130);
		g.drawString(FileManager.instance.ticketCnt + "", 300, 130);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (!isMax) {
			if (e.getSource() == ticketPlus) {
				if (FileManager.instance.ticketCnt < FileManager.instance.dataManager.get("ticket").getCnt()) {

					FileManager.instance.ticketCnt++;
				} else {
					isMax = true;
				}
			}
		}
		if (FileManager.instance.ticketCnt > 0) {
			if (e.getSource() == ticketMinus) {
				FileManager.instance.ticketCnt--;
				if (FileManager.instance.ticketCnt < FileManager.instance.dataManager.get("ticket").getCnt()) {
					isMax = false;
				}
			}
		}
		if (e.getSource() == next) {
			MealTicket.frame.setContentPane(new PurchasePanel());
			MealTicket.frame.revalidate();
		}

	}

}