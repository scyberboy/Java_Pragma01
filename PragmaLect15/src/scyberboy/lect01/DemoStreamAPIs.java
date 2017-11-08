package scyberboy.lect01;

import java.util.*;
import java.util.stream.Stream;


public class DemoStreamAPIs {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(-2, 10, 20, 5, 1, 0, -17, 100, 50);
		System.out.println(numbers);
		
		Stream<Integer> s1 = numbers.stream();
		System.out.println(s1);

		Stream<Integer> s2 = s1.filter( x -> x % 2 == 0 );
		System.out.println(s2);
		s2.forEach( x -> System.out.println(x) );
		
		// we can combine them all at once
		numbers.stream()
			.filter( x -> x % 2 == 0)
			.forEach(x -> System.out.println(x));
		
		
		
		// The Optional... :)
		
		Optional<Integer> result = getFirstEvenNumber(numbers);
		if( result.isPresent() ) {
			System.out.println(result.get());
		}
		
		
		// Lambdas , Stream APIs and Optional
		System.out.println("****************");
		Optional<Integer> res = numbers.stream().filter(x -> x > 3 && x % 2 == 0).findFirst();
		if( res.isPresent() ) {
			System.out.println(res.get() * 2);
		} else {
			System.out.println("намаааа");
		}
		
		
	}
	
	static Optional<Integer> getFirstEvenNumber( Collection<Integer> nums ) {
		for( Integer num : nums ) {
			if( num % 2 == 0 ) {
				return Optional.of(num);
			}
		}
		
		return Optional.empty();
	}

}
