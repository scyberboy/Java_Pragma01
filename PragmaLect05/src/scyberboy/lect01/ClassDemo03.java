package scyberboy.lect01;

import java.util.Scanner;

public class ClassDemo03 {

	public static void main(String[] args) {

		System.out.println("Enter radius:");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = ShapeHelpers.getCircleArea(r);
		System.out.println("Area of the given cirle with r=" + r + " is " + area);
		
		ShapeHelpers sh = new ShapeHelpers();
		//double pi = sh.PI;
		double pi = ShapeHelpers.getPi();
		//double pi2 = sh.getPI();
		//double pi2 = ShapeHelpers.PI;
		
		System.out.println(pi);
		System.out.println(sh);
		
		double area2 = ShapeHelpers.getCircleArea(2);
		System.out.println(area2);
		
		
		System.out.println(ShapeHelpers.NEW_PI);
		
		sc.close();
	}

}
