package java6_12;

public class ClassEx16 {
	static int x;
	int y;
	int z;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static º¯¼ö = " + ClassEx16.x); // 0

		ClassEx16 e = new ClassEx16();
		System.out.println("¸â¹ö º¯¼ö = " + e.y); // 0
		ClassEx16 e1 = new ClassEx16();
		System.out.println("¸â¹ö º¯¼ö = " + e1.y); // 0

	}

}
