package Exercise2;
public class Circle extends Shape {
	private double radius; 
	
	public Circle() {
		this.radius = 1.0; 
	}
	
	public Circle(double radius) {
		this.radius = radius; 
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius; 
		super.getColor(); 
		super.isFilled();
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		 return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "A circle with radius " + getRadius() + ", which is a subclass of : " + super.toString();
	}
}