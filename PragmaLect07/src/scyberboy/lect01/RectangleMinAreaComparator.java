package scyberboy.lect01;

public class RectangleMinAreaComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		double a1 = ((Rectangle) o1).getArea();
		double a2 = ((Rectangle) o2).getArea();
		
		if(a1 < a2) {
			return -1;
		} else if ( a1 > a2 ) {
			return 1;
		} else {
			return 0;
		}
	}

}
