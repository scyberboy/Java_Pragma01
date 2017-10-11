package scyberboy.lect01;

public class Helper {
	
	public static Object getMinElement ( Object[] elements, Comparator comp ) {
		
		Object min = null;
		
		if( elements != null && elements.length > 0 ) {
			min = elements[0];
		} else {
			return null;
		}
		
		for( int i = 1 ; i < elements.length ; i ++ ) {
			if( comp.compare(elements[i], min) == -1 ) {
				min = elements[i];
			}
		}
		
		return min;
	}

}
