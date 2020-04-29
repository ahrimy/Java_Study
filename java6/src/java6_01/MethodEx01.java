package java6_01;
import java.util.Scanner;
class Ex01{

	int num;
	void setNum(){
		System.out.println(this);
		this.num = 10;
	}
	void test1(){
		int total = 0;
		for(int i=0;i<5;i++){
			total+=(i+1);
		}
		System.out.println(total);
	}
	void test2(){
		Scanner scan = new Scanner(System.in);
		int max = 0;
		for(int i=0;i<3;i++){
			int temp = scan.nextInt();
			if(temp>max){
				max=temp;
			}
		
		}
		System.out.println(max);
		scan.close();
	}

}


class Character{
	int level = 1;
	int power = 1;
	int a = 0;
	int b = 0;
	void printData(){
		System.out.println(this.level + ":" + this.power);
	}
	void setData(int a , int b){
		this.a = a;
		this.b =b;
	}
}
public class MethodEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01 e = new Ex01();
		System.out.println(e);
		
		e.num = 20;
		
		System.out.println(e.num);
		
		e.setNum();
		System.out.println(e.num);
		
		e.test1();
		
		e.test2();
		
		Character ch1 = new Character();
		ch1.setData(10, 20);
		ch1.level = 19;
		Character ch2 = new Character();
		Character ch3 = new Character();
		
		
	}

}
