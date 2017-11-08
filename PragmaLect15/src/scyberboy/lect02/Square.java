package scyberboy.lect02;

public class Square {

	private int side;
	
	public Square (int a) {
		side = a;
	}
	
	public int getSide() {
		return side;
	}
	
	public int getArea() {
		return side * side;
	}
	
	@Override
	public String toString() {
		return "blah " + side;
	}
}
