package scyberboy.lect01;

public class RectanglePrivate {
	
	private float width;
	private float height;

	public RectanglePrivate () {
		
	}
	
	public RectanglePrivate (float f) {
		this(f, f);
	}
	
	public RectanglePrivate (float w, float h) {
		setWidth(w);
		setHeight(h);
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	public void setHeight(float h) {
		height = h;
	}
	
	public void resize(float w, float h) {
		setWidth(w);
		setHeight(h);
	}
	
	public void resize(float f) {
		resize(f,f);
	}
	
	public float getMaxSide() {
		return (width > height) ? width : height;
	}
	
	public float getArea() {
		return width * height;
	}
	
	public void print() {
		System.out.printf("\twidth = %.2f cm\n", width);
		System.out.printf("\theight = %.2f cm\n", height);
		System.out.printf("\tarea = %.2f cm^2\n", getArea());
	}

}
