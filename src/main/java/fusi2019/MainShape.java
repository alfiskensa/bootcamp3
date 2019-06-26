package fusi2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String shapeType;
		double radius, width, length;
		String color;
		boolean filled;

		System.out.println("Selamat Datang di Program Kalkulator Shape");
		System.out.print("Pilih shape: ");
		shapeType = in.next();
		
		switch(shapeType) {
		case "circle":
			System.out.print("Masukan radius: ");
			radius = in.nextDouble();
			System.out.print("Masukan Color: ");
			color = in.next();
			System.out.print("Filled? ");
			filled = in.hasNext("yes");
			Shape circle = new Circle(radius, color, filled);
			System.out.println(circle.toString());
		
		case "rectangle":
			System.out.print("Masukan panjang: ");
			length = in.nextDouble();
			System.out.print("Masukan lebar: ");
			width = in.nextDouble();
			System.out.print("Masukan Color: ");
			color = in.next();
			System.out.print("Filled?  ");
			filled = in.hasNext("yes");
			Shape rectangle = new Rectangle(width, length, color, filled);
			System.out.println(rectangle.toString());
		}
		
		List<Circle> lc = new ArrayList<Circle>();
		
	
	}

}
