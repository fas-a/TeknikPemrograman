package task2;

public class Square extends Rectangle{

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public double getSide() {
		return super.getLength();
	}

	@Override
	public String toString() {
		return "A Square with side="+ getSide() + ", which is a subclass of " + super.toString();
	}
	
	
}
