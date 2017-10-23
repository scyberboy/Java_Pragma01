package scyberboy.lect01;

public class Box<T> {
	
	private T data;
	
	public Box () {
		
	}
	
	public Box (T arg) {
		setObject(arg);
	}
	public void setObject(T o) {
		data = o;
	}
	
	public T getObject() {
		return data;
	}

}
