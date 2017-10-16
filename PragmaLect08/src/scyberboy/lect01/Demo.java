package scyberboy.lect01;

import java.io.IOException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws MyDivisionException {
		System.out.println("before f()");
		try {
			f();
		} catch (MyDivisionException e) {
			ArithmeticException e1 = new ArithmeticException();
			e1.initCause(e);
			throw e1;
		}
		System.out.println("after f()");
	}
	
	private static void f() throws MyDivisionException {
		System.out.println("start f()");
		
		try (Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			sc.next();
			int r = Helpers.divide(a, b);
			System.out.println("Result is: " + r);
			//System.out.flush();
		} catch (ArithmeticException ex) {
			//System.out.println("deleno na nulaaa :)");
			//System.out.println(ex);
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			
		} catch (MyDivisionException e) {
			System.out.println("Greshka pri deleneto: " + e.getMessage() + "   " + e.getDate());
			e.printStackTrace();
		} finally {
			//System.out.println("FINALLY");
		}
		
		//System.out.flush();
		
		//Helpers.divide(5, 0);
		
		Scanner sc2 = new Scanner(System.in);
		String str1 = sc2.nextLine();
		
		System.out.println("end f()");
	}

}
