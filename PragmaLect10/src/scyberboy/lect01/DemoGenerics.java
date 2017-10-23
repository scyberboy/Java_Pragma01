package scyberboy.lect01;

public class DemoGenerics {

	public static void main(String[] args) {
		
		BoxObject b1 = new BoxObject();
		b1.setObject("hello");
		
		//b1.setObject(40);
		////
		
		int len = ((String)b1.getObject()).length();
		System.out.println(len);
		
		System.out.println(b1.getClass());

		/////
		
		
		Box<String> b2 = new Box<String>();
		b2.setObject("world");
		System.out.println(b2.getObject());
		
		Box<Float> b3 = new Box<Float>();
		b3.setObject(45.33f);
		System.out.println(b3.getObject());
		
		Box<Integer> b4 = new Box<>(13); 
		// can omit the type when create object with new - it uses the one from the reference :)
		System.out.println(b4.getObject());
		
		
		///////
		// Unknown types / wildcards
		f(b3);
		
		// generic type argument, declared by the method itself...
		g(32);
	}

	// Wildcards - <? extends BaseClass> ;)
	private static void f(Box<? extends Number> b) {
		
		System.out.println(b.getObject().doubleValue());
		
	}
	
	private static <N extends Number> void g(N num) {
		System.out.println(num);
	}
}
