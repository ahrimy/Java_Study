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
		System.out.println("점을 찍는다.");
	}
}
class Line extends Shape{
	@Override
	public void draw(){
		System.out.println("선을 그린다.");
	}
}
class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("원을 그린다.");
	}
}
class Rect extends Shape{
	@Override
	public void draw(){
		System.out.println("사각형을 그린다.");
	}
}
class TriAngle extends Shape {
	@Override 
	public void draw(){
		System.out.println("삼각형을 그린다.");
	}
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = {new Point(),new Line(),new Circle(), new Rect(), new TriAngle()};
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 작업을 선택하세요 : ");
		int menu = sc.nextInt();
		shapes[menu-1].draw();
	}

}
