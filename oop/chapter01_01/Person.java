package chapter01_01;

import java.util.Date;

public class Person {

	public static int count;
	private int no;
	private String name;
	private boolean gender;
	private String memo;
	private Date writeDate;
	
	public Person(){
		this("¹«¸í¾¾",true,"¾øÀ½");
	}
	public Person(String name, boolean gender, String memo){
		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
}
