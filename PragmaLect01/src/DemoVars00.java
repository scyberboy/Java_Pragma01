import java.util.Scanner;

/**
 * 
 */

/**
 * @author Stoycho Petrov
 *
 */
public class DemoVars00 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byte varByte01 = 65;
		System.out.println(varByte01);

		long varLong01 = 9123456789L;
		System.out.println(varLong01);

		@SuppressWarnings("unused")
		int varInt01 = 1567;

		float varFloat01 = 2.3456789123456789f;
		System.out.println(varFloat01);

		char varChar01 = 'я';
		System.out.println(varChar01);

		char varChar02 = '\u262F';
		System.out.println(varChar02);

		int i = 0b1010_0000_0000_0001_0000_0001_1000_0100;
		byte by = (byte) i;
		System.out.println(by);

		// Reading from standard input
		// Scanner class...

		Scanner sc = new Scanner(System.in);
		int blah = sc.nextByte();

		System.out.println(blah);

		sc.close();

		////////

		if (true)
			;
		{
			blah++;
		}

	}

}
