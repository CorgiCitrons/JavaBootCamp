package sef.module6.activity;

public abstract class Shape {

	public String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double

	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public  double getArea() {
		System.err.println("shape is not known, can not calculate area");
		return 0;
	}
	public double getPerimeter() {
		System.err.println("shape is not known, can not calculate perimeter");
		return 0;
	}
	
}
