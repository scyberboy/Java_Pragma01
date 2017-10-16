package scyberboy.lect01;

import java.util.Date;

public class Helpers {
	
	public static int divide(int a, int b) throws MyDivisionException {
		if(b == 0) {
			throw new MyDivisionException("delim na nula!", new Date() );
		}
		System.out.println("before /");
		int result = a / b;
		System.out.println("after /");
		return result;
	}

}
