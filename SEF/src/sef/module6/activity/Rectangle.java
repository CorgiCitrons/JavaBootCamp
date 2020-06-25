package sef.module6.activity;

public class Rectangle extends Shape {
	private int lenght, breadth;
	public Rectangle(String color, int lenght, int breadth) {
		super(color);
		this.lenght = lenght;
		this.breadth = breadth;
	}
	public String toString() {
	      return "Rectangle[lenght=" + lenght + ",breadth=" + breadth + ",color=" + super.getColor() + "]";
	}
	public double getArea () {
		return lenght*breadth;
	}
	public double getPerimeter () {
		return 2*(lenght+breadth);
	}

}

