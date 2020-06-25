package sef.module6.activity;

public class Circle extends Shape {

	private int radius;
	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	public String toString() {
	      return "Circle[radius=" + radius + ",color=" + super.getColor() + "]";
	}
	public double getArea () {
		return Math.PI*radius*radius;
	}
	public double getPerimeter () {
		return 2*Math.PI*radius;
	}
}