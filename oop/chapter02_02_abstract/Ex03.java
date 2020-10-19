package chapter02_02_abstract;

import java.util.Scanner;

abstract class Shape{
	int x,y;
	public void move(){}
	public abstract void draw();
}
class Point extends Shape{
	@Override 
	public void draw(){
		System.out.println("���� ��´�.");
	}
}
class Line extends Shape{
	@Override
	public void draw(){
		System.out.println("���� �׸���.");
	}
}
class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("���� �׸���.");
	}
}
class Rect extends Shape{
	@Override
	public void draw(){
		System.out.println("�簢���� �׸���.");
	}
}
class TriAngle extends Shape {
	@Override 
	public void draw(){
		System.out.println("�ﰢ���� �׸���.");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = {new Point(),new Line(),new Circle(), new Rect(), new TriAngle()};
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �۾��� �����ϼ��� : ");
		int menu = sc.nextInt();
		shapes[menu-1].draw();
	}

}
