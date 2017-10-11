package scyberboy.lect01;

public interface Comparator {
	
	/**
	 * @param o1
	 * @param o2
	 * @return -1 if o1 < o2
	 * 			0 if o1 == o2
	 * 			1 if o1 > o2
	 */
	int compare(Object o1, Object o2);

}
