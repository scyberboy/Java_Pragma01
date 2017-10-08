//import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Stoycho Petrov
 * @see http://learn.pragmatic.bg/mod/resource/view.php?id=6608
 */
public class Zadachi {

	public static void printLabel(String label) {
		System.out.println("\t======= " + label + " =======");
	}

	public static void zad1() {
		
		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);
		System.out.println("Stoycho Petrov");
		printLabel("end   " + methodName);

	}

	public static void zad2() {

		byte b = 1;
		short s = 129;
		int i = 33000;
		long l = 3000000000L;
		float f = 1.23456789f;
		double d = 3.213456789123;
		char c = 'ю';
		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		System.out.println("byte b=" + b);
		System.out.println("short s=" + s);
		System.out.println("int i=" + i);
		System.out.println("long l=" + l);
		System.out.println("float f=" + f);
		System.out.println("double d=" + d);
		System.out.println("char c=" + c);

		printLabel("end   " + methodName);

	}

	public static void zad3(Scanner sc) {
		
		int num1 = 0;
		int num2 = 0;
		int res = 0;
		String methodName;
		
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);
		
		System.out.println("Enter value for num1:");
		num1 = sc.nextInt();
		System.out.println("Enter value for num2:");
		num2 = sc.nextInt();
		
		res = num1 + num2;
		if(res > 0) {
			System.out.println(res + " is a positive number");
		} else {
			System.out.println(res + " is NOT a positive number");
		}
		
		printLabel("end   " + methodName);
		
	}
	
	public static void zad4(Scanner sc) {
		
		int hour = 0;
		float money = 0f;
		boolean isHealthy = true;
		String dayOrNight = "";
		String methodName;
		
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		System.out.println("What hour is it (time of day):");
		hour = sc.nextInt();
		
		System.out.println("How much money do you have:");
		money = sc.nextFloat();
		
		System.out.println("I'm healthy [true or false]:");
		isHealthy = sc.nextBoolean();
		
		
		if(hour > 6 && hour < 18 ) {
			dayOrNight = "day";
		} else {
			dayOrNight = "night";
		}
		
		if (isHealthy) {
			// I'm healthy, let's see how much money do I have and decide what to do :)
			if (money < 1.0) {
				System.out.println("I'm healthy, but poor - will stay at home and play board games!");
			} else if (money >= 1.0 && money <= 10.0) {
				System.out.println("I'm healthy and got some money - will go out for a coffee");
			} else {
				System.out.println("I'm healthy and rich - will go out and party all " + dayOrNight );
			}
		} else {
			// I'm sick :(
			if (money >= 5.0) {
				System.out.println("I'm sick and got some money - will go out to buy medicines");
			} else {
				System.out.println("I'm sick and almost without money - will stay home and drink tea");
			}
		}
		
		printLabel("end   " + methodName);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanGlob = new Scanner(System.in);
		///
		zad1();

		///
		zad2();

		///
		zad3(scanGlob);

		///
		zad4(scanGlob);
		
		//beware - Scanner.close() closing the input stream(source) used for reading. 
		//			Which is quite stupid when Eclipse suggest to close it at the end of you methid :D
		scanGlob.close();

	}

}
