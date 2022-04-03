package Exercise2;

public class Rectangle extends Shape {
	public double width;
	public double length;
	
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		super.setColor(color);
		super.isFilled();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*(width + length);
	}
	@Override
	public String toString() {
		return "A Rectangle with width " + getWidth() + " and length = " + getLength() + ", which is a subclass of " + super.toString();
	}
}