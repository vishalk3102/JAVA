import java.util.*;
import java.lang.Math;

abstract class shape {
	abstract void rectangleArea(int l, int b);

	abstract void circleArea(int r);

	abstract void squareArea(int s);
}

public class area extends shape {

	void rectangeArea(int l, int b) {
		int area;
		area = l * b;
		System.out.println("area of the rectangle is :" + area);
	}

	void circleArea(int r) {
		double area;
		area = Math.PI * r * r;
		System.out.println("area of the cirlce is :" + area);
	}

	void squareArea(int s) {
		int area;
		area = s * s;
		System.out.println("area of the square is :" + area);
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		area a = new area();

		int l, b, s, r;

		System.out.println("Enter the length and breadth of rectangle :");
		l = sc.nextInt();
		b = sc.nextInt();
        a.rectangeArea(l, b);
		System.out.println("\nEnter the radius of circle :");
		r = sc.nextInt();
        a.circleArea(r);
		System.out.println("Enter the side of square :");
		s = sc.nextInt();
		a.squareArea(s);
		

	}

	@Override
	void rectangleArea(int l, int b) {
		// TODO Auto-generated method stub
		
	}

	
}
