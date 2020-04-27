package java4_01;

public class StringEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "megait";
		System.out.println(str);
		
		int size= str.length();
		System.out.println(size);
		
		char ch=str.charAt(0);
		System.out.println(ch);
		ch = str.charAt(size-1);
		System.out.println(ch);
		
		String rs = str.substring(4,6);
		System.out.println(rs);
		
		rs = str.substring(4);
		System.out.println(rs);
		
		str = "hello,java,android";
		String[] ar = str.split(",");
		System.out.println(ar.length);
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
	}

}
