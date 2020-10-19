package gui_mealTicket;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

class SelectPanel extends JPanel implements ActionListener {
	JButton manager;
	JButton customer;

	SelectPanel() {
		setLayout(null);// Null하면 직접 세팅 하겠다는 의미
		Font font = new Font("",Font.BOLD,30);
		manager = new JButton();
		manager.setFont(font);
		manager.setText("Manager");
		manager.setSize(550, 200);
		manager.setLocation(15, 100);

		manager.addActionListener(this);

		add(manager); // 패널에 버튼 부착
		customer = new JButton();
		customer.setFont(font);
		customer.setText("Customer");
		customer.setSize(550, 200);
		customer.setLocation(15, 320);
		customer.addActionListener(this);

		add(customer); // 패널에 버튼 부착
		init();
	}

	public void init() {
		FileManager.instance.loadData();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == manager) {
			MealTicket.frame.setContentPane(new ManagerPanel());
			MealTicket.frame.revalidate();
		} else if (e.getSource() == customer) {
			MealTicket.frame.setContentPane(new CustomerPanel());
			MealTicket.frame.revalidate();
		}

	}

}