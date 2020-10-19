package bookshop;


	import java.text.DecimalFormat;
	import java.text.NumberFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;

//		책 1권의 정보를 기억하는 클래스
	public class BookVO {

		private String title;		// 도서명
		private String author;		// 저자
		private String publisher;	// 출판사
		private Date date;			// 출판일
		private double price;		// 가격
		
		public BookVO() {
			// TODO Auto-generated constructor stub
		}
		public BookVO(String title, String author, String publisher, Date date, double price) {
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			
//			생성자의 인수(data)로 넘어온 날짜에서 년도는 1900을 월은 1을 빼서 저장시킨다.
			date.setYear(date.getYear() - 1900);
			date.setMonth(date.getMonth() - 1);
			
			this.date = date;
			this.price = price;
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		@Override
		public String toString() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
			
//			숫자 서식 지정
//			NumberFormat nf = NumberFormat.getNumberInstance();		// 천 단위 구분 기호
//			NumberFormat nf = NumberFormat.getCurrencyInstance();	// 통화 기호
//			NumberFormat nf = NumberFormat.getPercentInstance();	// 백분율
			
//			DecimalFormat df = new DecimalFormat("숫자 서식");
//			숫자 서식은 무조건 "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여준다.
//			DecimalFormat df = new DecimalFormat("#,##0");			// 천 단위 구분 기호
//			DecimalFormat df = new DecimalFormat("￦#,##0");		// 통화 기호
//			DecimalFormat df = new DecimalFormat("￥#,##0");
//			DecimalFormat df = new DecimalFormat("€#,##0");
//			DecimalFormat df = new DecimalFormat("￡#,##0");
//			소숫점 아래 숫자를 출력하려면 "#,##0"뒤에 "."을 찍고 필요한 자리 만큼 "0"을 입력한다.
//			DecimalFormat df = new DecimalFormat("$#,##0.00");
//			DecimalFormat df = new DecimalFormat("#,##0%");			// 백분율
			DecimalFormat df = new DecimalFormat("#,##0원");
			
//			return "BookVO [title=" + title + ", author=" + author + ", publisher=" + publisher + ", date=" + sdf.format(date)
//					+ ", price=" + df.format(price) + "]";
			return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(date), df.format(price));
		}
		
	

















}
