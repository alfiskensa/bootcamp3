package fusi2019;

public abstract class Shape {
	protected String color;
	protected Boolean filled;
	
	
	public Shape() {
		
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Boolean getFilled() {
		return filled;
	}


	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public abstract String toString();
	
}
