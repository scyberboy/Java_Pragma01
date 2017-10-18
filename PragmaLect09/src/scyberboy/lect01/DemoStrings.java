/**
 * 
 */
package scyberboy.lect01;

import java.util.regex.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

/**
 * @author Stoycho Petrov
 *
 */
public class DemoStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String s1 = "text";
//		String s2 = new String("blah");
		
		String s1 = "text";
		String s2 = "text";
		
//		System.out.println(s1);
//		System.out.println(s2);
		if(s1 == s2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		
//		System.out.println(s3);
//		System.out.println(s4);
		if(s3 == s4) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		/// Strings should be compared for equallity with .equals()
		if( s3.equals(s4) )  {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
		
		/////// Concatenate /////////
		String firstName = "Chuck";
		String lastName = "Norris";
//		String fullName = firstName + " " + lastName;
		String fullName = firstName.concat(lastName);
		
		System.out.println(fullName);
		
		////// sub-strings 
		System.out.println(fullName.substring(1, 6));
		
		// split / join
		String beers = "Zagorka , Pirinsko,Leffe Burgasko";
		String[] beersArr = beers.split("[,\\s]+");
		System.out.println(beersArr.length);
		for(String beer : beersArr) {
			System.out.println(beer);
		}
		
		///// regex Pattern Matcher...
		boolean res = beers.matches(".*[a-h].*");
		System.out.println(res);
		
		Pattern pat = Pattern.compile("[A-Z][a-z]+");
		Matcher mat = pat.matcher(beers);
		System.out.println(pat);
		System.out.println(mat);
		
		while(mat.find()) {
			System.out.println(beers.substring(mat.start(), mat.end()));
			
		}
		
		/////////
		String blah = "\\";
		System.out.println(blah);
		
		StringBuffer sb1 = new StringBuffer("blah");
		
		
	}

}
