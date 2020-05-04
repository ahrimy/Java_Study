package java7_06;

import java.util.ArrayList;

class Member {
	private int custno;
	private String custname;
	private String phone;
	private String address;
	private String joindate;
	private String grade;
	private String city;
	private int sales;

	public Member() {
	}

	public int getCustno() {
		return custno;
	}
	public int getSales(){
		return sales;
	}
	public void addSales(int price) {
		sales += price;
	}

	public Member(int custno, String custname, String phone, String address, String joindate, String grade,
			String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
		this.sales = 0;
	}
	public void showSales(){
		System.out.println(this.custno+"\t"+this.custname+"\t"+this.sales);
	}
}

class Money {
	int custno; // 회원번호
	int saleno; // 판매번호
	int pcost; // 단가
	int amount; // 수량
	int price; // 가격(매출)
	String pcode; // 상품코드
	String sdate; // 판매일자

	public Money() {
	}

	public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		this.custno = custno;
		this.saleno = saleno;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdate = sdate;
	}
}

class Manager {
	ArrayList<Member> memberList = new ArrayList<Member>();
	ArrayList<Money> moneyList = new ArrayList<Money>();

	void init() {
		memberList.add(new Member(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));
		memberList.add(new Member(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
		memberList.add(new Member(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
		memberList.add(new Member(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
		memberList.add(new Member(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
		memberList.add(new Member(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));

		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));
	}

	void saleResult() {
		for (int i = 0; i < moneyList.size(); i++) {
			for (int j = 0; j < memberList.size(); j++) {
				if (moneyList.get(i).custno == memberList.get(j).getCustno()) {
					memberList.get(j).addSales(moneyList.get(i).price);
				}
			}
		}
	}
	void sortResult(){
		for (int i = 0; i < memberList.size(); i++) {
			for (int j = 0; j < memberList.size()-1-i; j++) {
				if (memberList.get(j).getSales() < memberList.get(j+1).getSales()) {
					Member temp = memberList.get(j);
					memberList.set(j, memberList.get(j + 1));
					memberList.set(j + 1, temp);
				}
			}
		}
	}
	void showResult(){
		for(int i=0;i<memberList.size();i++){
			memberList.get(i).showSales();
			System.out.println();
		}
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager();
		mg.init();

		mg.saleResult();
		mg.sortResult();
		mg.showResult();
	}

}
