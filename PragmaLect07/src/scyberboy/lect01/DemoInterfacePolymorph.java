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
		
		/*
		///
		class RectangleWidthComparator implements Comparator {
			@Override
			public int compare(Object o1, Object o2) {
				double w1 = ((Rectangle) o1).getWidth();
				double w2 = ((Rectangle) o2).getWidth();
				
				if(w1 < w2) {
					return -1;
				} else if ( w1 > w2 ) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		///
		
		RectangleWidthComparator c3 = new RectangleWidthComparator();
		r = (Rectangle)Helper.getMinElement(rects, c3);
		System.out.println("Width...:\t" + r.getWidth());
		*/
		
		/// anonymous class !!!
		r = (Rectangle)Helper.getMinElement(rects, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				double w1 = ((Rectangle) o1).getWidth();
				double w2 = ((Rectangle) o2).getWidth();
				
				if(w1 < w2) {
					return -1;
				} else if ( w1 > w2 ) {
					return 1;
				} else {
					return 0;
				}
				
				
			}
			
			// static (one-time) constructor :)
			{
				System.out.println(this.getClass());
			}
		});//
		System.out.println("Width...:\t" + r.getWidth());
		
		
		////
		
		System.out.println(rects[0]);
		
	}

}
