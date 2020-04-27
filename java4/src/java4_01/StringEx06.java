package java4_01;

public class StringEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin = "890101-2012932";
		
		String[] ar = jumin.split("-");
		int bNum = Integer.parseInt(ar[0]);
		if(bNum<200000){
			bNum+=20000000;
		}else{
			bNum+=19000000;
		}
		char gender = ar[1].charAt(0);
		int gNum = (int)gender;
		
		int age = (20200424-bNum)/10000;
		System.out.println("AGE:"+age);
		
		if(gNum==1||gNum==3){
			System.out.println("Gender:남자");
		}else{
			System.out.println("Gender:여자");
		}
	}

}
