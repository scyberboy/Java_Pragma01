package scyberboy.lect01;

import java.util.*;

public class DemoFunctionalIface {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(-2, 10, 20, 5, 1, 0, -17, 100, 50);
		
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				/*if(o1 == o2) {
					return 0;
				} else if (o1 < o2) {
					return -1;
				} else {
					return 1;
				}*/
				return o1.compareTo(o2);
			}
			
		});
		
		// print em 1
		System.out.println(numbers);
		
		
		// using Lambdas
		List<Integer> numbers2 = Arrays.asList(-2, 10, 20, 5, 1, 0, -17, 100, 50);
		//numbers2.sort( (Integer o1, Integer o2) -> { return o1.compareTo(o2); } );
		//numbers2.sort( (o1, o2) -> { return o1.compareTo(o2); } );
		numbers2.sort( (o1, o2) -> o1.compareTo(o2) );
		
		System.out.println(numbers2);
		
	}

}
