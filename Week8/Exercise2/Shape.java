package Exercise2;

public class Shape {
	public String color;
	public boolean filled;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Shape() {
		color = "green";
		filled = true;
	}
	public Shape(String color, boolean filled) {
		color = color;
		filled = filled;
	}
	public String toString() {
		return "A Shape with color of " + getColor() + "and filled = " + isFilled();
	}
//	publcic double getArea();
}

