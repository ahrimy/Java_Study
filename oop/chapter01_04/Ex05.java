package chapter01_04;
/*
 * 다형성(polymorhpism)
 */
class Fruits{
	String name;
	
}
class Mango extends Fruits{}
class Banana extends Fruits{}
class Apple extends Fruits{}

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {10,3.14,"문자"};
		Mango mango = new Mango();
		Banana banana = new Banana();
		Apple apple = new Apple();
		
		Fruits[] arr = {mango, banana, apple};
	}

}
