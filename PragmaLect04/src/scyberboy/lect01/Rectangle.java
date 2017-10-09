package scyberboy.lect01;


public class Rectangle {
	
	float width;
	float height;

	public float getMaxSide() {
		return (width > height) ? width : height;
	}
	
	public float getArea() {
		return width * height;
	}
}

