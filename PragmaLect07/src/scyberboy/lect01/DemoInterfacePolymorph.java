package scyberboy.lect01;

public class DemoInterfacePolymorph {

	public static void main(String[] args) {

		Rectangle[] rects = { new Rectangle(10, 4),
								new Rectangle(20, 40),
								new Rectangle(11, 2)
		};
		
		RectangleMinAreaComparator c1 = new RectangleMinAreaComparator();
		Rectangle r = (Rectangle)Helper.getMinElement(rects, c1);
		System.out.println("Area...:\t" + r.getArea());

		RectangleMinHeightComparator c2 = new RectangleMinHeightComparator();
		r = (Rectangle)Helper.getMinElement(rects, c2);
		System.out.println("Heigh...:\t" + r.getHeight());
		
		
	}

}
