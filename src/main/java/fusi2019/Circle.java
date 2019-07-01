package fusi2019;


public class Circle extends Shape {
	protected double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle[radius="+this.radius+
				", color="+this.color+
				", filled="+this.filled+", area="+getArea()+
				", perimeter="+getPerimeter()+"]";
	}
	
	

}
