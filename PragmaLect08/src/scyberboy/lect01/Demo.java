package scyberboy.lect01;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("before f()");
		f();
		System.out.println("after f()");
	}
	
	private static void f() {
		System.out.println("start f()");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int r = Helpers.divide(a, b);
		
		System.out.println("Result is: " + r);
		
	}

}
