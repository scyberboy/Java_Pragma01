package scyberboy.lect02;

import java.util.*;

public class DemoCollections {

	public static void main(String[] args) {

		List<Integer> l1 = new LinkedList<>();
		l1.add(12);
		l1.add(5);
		l1.add(99);
		l1.add(5);
		
		System.out.println("size: " + l1.size());
		l1.get(2);
		
		System.out.println("s for");
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		// using iterator
		System.out.println("s iterator");
		Iterator<Integer> it = l1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// using foreach (works with any Iterable)
		System.out.println("s foreach");
		for(Integer elem : l1) {
			System.out.println(elem);
		}

		// modifying collection while iterate over it, without using the iterator - NOT a good idea !!!
		
		List<Integer> l2 = new LinkedList<>();
		l2.addAll(l1);
		l2.add(45);
		l2.add(72);
		l2.add(77);
		l2.add(12);
		// let's remove all odd numbers...
		/*for(Integer elem : l2) {
			if(elem %2 == 1) {
				l2.remove(elem); // WRONG !!!
			}
		}*/
		Iterator<Integer> it2 = l2.iterator();
		while(it2.hasNext()) {
			if(it2.next() %2 == 1) {
				it2.remove(); // CORRECT !!!
			}
		}
		
		System.out.println(l2);
		
		
		////// Set (interface)
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(23);
		set1.add(11);
		set1.add(11);
		set1.add(9);
		set1.add(1);
		set1.add(4);
		System.out.println(set1);
		
		// all collections has a default Ctor and Ctor with 1 arg - another collection
		Set<Integer> set2 = new HashSet<>(l1);
		System.out.println(set2);
		
		ListIterator<Integer> it3 = l1.listIterator();
		it3.next();
		
		
		//// Map - <K,V>
		Map<Integer,String> m = new HashMap<>();
		m.put(5, "pet");
		
		System.out.println(m);
		
	}

}
