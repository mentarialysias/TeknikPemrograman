package Exercise2;


public class Square extends Rectangle {

	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
		super.setLength(side);
	}

	public void setWidth(double side) {
		super.setWidth(side);
		super.setWidth(side);
	}
	
	public double getArea() {
		return getSide() * getSide();
	}
	
	public double getPerimeter() {
		return 4*getSide();
	}
	
	public String toString() {
		return "A Square with side " + getSide() + ", which is a subclass of " + super.toString();
				
	}
}