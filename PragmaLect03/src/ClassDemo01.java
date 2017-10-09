import java.lang.reflect.Field;

//import java.awt.Rectangle;

//import Rectangle;

public class ClassDemo01 {
	
	static Rectangle rect1 = new Rectangle();
	static java.awt.Rectangle rect2 = new java.awt.Rectangle();
	
	//private
		int blah;

	public static void main(String[] args) {
		
		Person pesho = new Person();
		Person gosho = new Person();
		
		System.out.println( "pesho equals gosho =>" + pesho.equals(gosho) );
		
		Person pepi = pesho;
		System.out.println( "pesho equals pepi =>" + ( pesho == pepi ) );
		
		System.out.println("pepi is from Class =>" + pepi.getClass());
		
		
		/////////////
		//Field f;
		for( Field f : pepi.getClass().getFields()) {
			System.out.println("Field f:");
			System.out.println(f.getName());
		}
		
		Field[] f = pepi.getClass().getFields();
		System.out.println(f.length);
		
		///////////
		Person nullcho = gosho;
		System.out.println(nullcho);
		nullcho = null;
		
		//nullcho.hasCar = true;
		
		
		//blah = gosho.age;
		//blah = 5;
		
		//////
		
		Car mosko = new Car();
		System.out.println(mosko.color);
		mosko.owner = pepi;
		System.out.println(mosko.owner);
		
		Rectangle myRect1 = rect1;
		System.out.println(myRect1);
		
		java.awt.Rectangle myRect2 = rect2;
		System.out.println(myRect2);

		

	}
	
	

}
