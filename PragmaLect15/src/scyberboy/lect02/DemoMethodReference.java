package scyberboy.lect02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class DemoMethodReference {

	public static void main(String[] args) {
		
		List<Square> squares = Arrays.asList(new Square(5), new Square(10), new Square(3));
		List<Integer> areas = squares.stream().map( s -> s.getArea() ).collect(Collectors.toList());
		System.out.println(areas);
		
		// using Method reference
		List<Integer> areas2 = squares.stream().map( Square::getArea ).collect(Collectors.toList());
		System.out.println(areas2);
		
		/// for (when using) Ctors !!! :)
		List<Integer> sides = Arrays.asList(3, 5, 6, 10, 2);
		List<Square> squares2 = sides.stream().map(Square::new).collect(Collectors.toList());
		System.out.println(squares2);
		
		///
		sides.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		
		// generate() - generates infinite stream...
		Stream<Integer> s3 = Stream.generate( () -> 5 );
		System.out.println(s3.findFirst());
		
		// iterate 
		Stream<Integer> s4 = Stream.iterate( 3, x -> x + 2 );
		System.out.println(s4.filter(x -> x > 5).findFirst());

	}

}
