package memo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoVO {

	public static int count;
	private int no;				// 글번호, 자동입력
	private String name;		// 이름
	private String password;	// 비밀번호
	private String memo;		// 메모
	private Date writeDate;		// 작성일, 자동입력
	
	public MemoVO() { }
	public MemoVO(String name, String password, String memo) {
		no = ++count;
		this.name = name;
		this.password = password;
		this.memo = memo;
		writeDate = new Date();
	}
	public MemoVO(int no, String name, String password, String memo, String writeDate) {
		this.no = no;
		this.name = name;
		this.password = password;
		this.memo = memo.replace("_", " ");
		
		int year = Integer.parseInt(writeDate.substring(0, 4)) - 1900;
		int month = Integer.parseInt(writeDate.substring(5, 7)) - 1;
		int day = Integer.parseInt(writeDate.substring(8, 10));
		int hour = Integer.parseInt(writeDate.substring(11, 13));
		int minute = Integer.parseInt(writeDate.substring(14, 16));
		int second = Integer.parseInt(writeDate.substring(17));
		
		this.writeDate = new Date(year, month, day, hour, minute, second);
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	

	@Override
	public String toString() {
		Date date = new Date();			// 오늘 날짜
//		오늘 날짜의 년, 월, 일과 작성일과 작성일의 년, 월, 일이 같은가 비교한다.
		SimpleDateFormat sdf = null; 
		if(date.getYear() == writeDate.getYear() && date.getMonth() == writeDate.getMonth() && 
				date.getDate() == writeDate.getDate()) {
			sdf = new SimpleDateFormat("HH:mm:ss");
		} else {
			sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
		}
		return no + ". " + name + " 님이(" + password + ") " + sdf.format(writeDate) + "에 남긴말 " + memo;
	}
	
}


