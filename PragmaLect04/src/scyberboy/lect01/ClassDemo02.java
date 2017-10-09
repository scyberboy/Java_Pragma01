package scyberboy.lect01;

public class ClassDemo02 {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.width = 3.5f;
		r1.height = 11;
		
		Rectangle r2 = new Rectangle();
		r2.height = 5.5f;
		r2.width = 10;
		
		System.out.println("r1 bigger side is " + r1.getMaxSide() + " cm.");
		System.out.println("r1 has area of " + r1.getArea() + " sq. cm.");
		
		
		RectanglePrivate rp1 = new RectanglePrivate();
		rp1.setHeight(20);
		rp1.setWidth(5.5f);
		
		RectanglePrivate rp2 = new RectanglePrivate(10, 4.5f);
		
		RectanglePrivate rp3 = new RectanglePrivate();
		System.out.println("rp3 bigger side is " + rp3.getMaxSide() + " cm.");
		
		System.out.println("rp2 has");
		rp2.print();
		
		

	}

}
