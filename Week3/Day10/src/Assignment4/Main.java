package Assignment4;

import java.util.PrimitiveIterator.OfDouble;

public class Main {

	public static void main(String[] args) {
		Area area = new Area();
		area.circleArea(7);
		area.rectangleArea(4, 6);
		area.squareArea(4);

	}

}

abstract class Shape {
	abstract int rectangleArea(int length, int breadth);

	abstract public int squareArea(int side);

	abstract public int circleArea(int radius);
}

class Area extends Shape {

	@Override
	int rectangleArea(int length, int breadth) {
		System.out.println("Area Of Rectangle : " + length * breadth);
		return 0;
	}

	@Override
	public int squareArea(int side) {
		System.out.println("Area Of Square:  " + side * side);
		return 0;
	}

	@Override
	public int circleArea(int radius) {
		System.out.println("Area of Circle : " + radius * radius * 22 / 7);
		return 0;
	}

}