package scyberboy.lect01;

public class ShapeHelpers {
	
	private static final double PI = 3.141592;
	private static final double ALT_PI = calcPi();
	
	//@SuppressWarnings("unused")
	static final double NEW_PI;
	
	// static constructor
	static {
		NEW_PI = 3.3;
	}
	private static double calcPi() {
		return 3.13;
	}
	
	static double getPi() {
		return PI;
	}
	
	static double getAltPi() {
		return ALT_PI;
	}
	
	public static double getCircleArea (double r) {
		return PI * r * r;
	}
	
	public void f() {
		
	}

}
