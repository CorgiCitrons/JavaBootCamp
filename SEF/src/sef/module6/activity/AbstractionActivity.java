package sef.module6.activity;

import sef.module6.activity.Shape;

public class AbstractionActivity {
	public static void main(String[] args) {
	Shape s1 = new Rectangle ("blue", 5, 6);
	System.out.print(s1);
	
	System.out.println("Area is " + s1.getArea());
	System.out.println("Perimeter is " + s1.getPerimeter());
	
	Shape s2 = new Circle ("yellow", 5);
	System.out.print(s2);
		
	System.out.println("Area is " + s2.getArea());
	System.out.println("Perimeter is " + s2.getPerimeter());
	} 
	
}


		