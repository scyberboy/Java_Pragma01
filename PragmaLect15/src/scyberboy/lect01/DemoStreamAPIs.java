package scyberboy.lect01;

import java.util.*;
import java.util.stream.Collectors;
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
		System.out.println("****************");
		Optional<Integer> result = getFirstEvenNumber(numbers);
		if( result.isPresent() ) {
			System.out.println("First even: " + result.get());
		}
		
		
		// Lambdas , Stream APIs and Optional
		System.out.println("****************");
		Optional<Integer> res = numbers.stream().filter(x -> x > 3 && x % 2 == 0).findFirst();
		if( res.isPresent() ) {
			System.out.println("Doubled: " + res.get() * 2);
		} else {
			System.out.println("намаааа");
		}
		
		// Same example with map
		System.out.println("****************");
		Optional<Integer> res2 = numbers.stream().filter(x -> x > 3 && x % 2 == 0).map(x -> x * 2).findFirst();
		if( res2.isPresent() ) {
			System.out.println("Doubled 2: " + res2.get());
		} else {
			System.out.println("намаааа");
		}
		
		// map of different type than the source data
		System.out.println("****************");
		Stream<String> words = Stream.of("ala", "bala", "nica", "123456");
		Stream<Integer> lengths = words.map(x -> x.length());
		System.out.println(lengths.collect(Collectors.toList()));
		
		
		// Create a Map<string,int> - elements -> element lengths
		System.out.println("****************");
		List<String> names = Arrays.asList("Pesho", "Gosho", "Ivan", "Dragan", "Petkancho");
		Map<String,Integer> mappedNames = names.stream().collect(Collectors.toMap( x -> x, x -> x.length() ));
		System.out.println(mappedNames);
		
		// reduce (find min)
		System.out.println("****************");
		Optional<Integer> res3 = numbers.stream().reduce( (x, y) -> (x < y ? x : y) );
		if( res3.isPresent() ) {
			System.out.println("Min: " + res3.get());
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
