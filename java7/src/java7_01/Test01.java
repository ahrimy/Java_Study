package java7_01;
class Product{
	String name;
	int price;
}
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pr = new Product();
		pr.name = "馬濠條";
		pr.price = 1000;
		
		Product[] arr = new Product[3];
		arr[0] = new Product();
		arr[1] = new Product();
		arr[2] = new Product();
		arr[0].price = 10;
		arr[1].price = 20;
		arr[2].price = 30;
		arr[0].name = "檜虜熱";
		arr[1].name = "檜艙��";		
		arr[2].name = "梯繹團";
		System.out.println(arr[1].name);
		
		Product temp = arr[1];
		System.out.println(temp.name);	

	}

}
