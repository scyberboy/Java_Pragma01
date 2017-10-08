package scyberboy.homework.loops;

import java.util.Random;
import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {

		Scanner scanGlob = new Scanner(System.in);
		
		///
		//zad1();

		///
		//zad2();

		///
		//zad3(scanGlob);

		///
		//zad4(scanGlob);

		///
		//zad5(scanGlob);

		///
		//zad6(scanGlob);

		///
		//zad7(scanGlob);

		scanGlob.close();

	}

	/**
	 * @description Напишете игра “Познай числото”
	 * @param scanGlob
	 */
	private static void zad7(Scanner scanGlob) {

		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		final int N = 20;
		Random randomGenerator = new Random();
		int number = randomGenerator.nextInt(N) + 1;
		boolean isWinner = false;
		final int TRIES = 3;
		
		for( int tryNum = 1 ; tryNum <= TRIES ; tryNum++ ) {
			
			int pick = 0;
			do {
				System.out.println("guess the number [1-" + N + "] (try No." + tryNum + ") :");
				pick = scanGlob.nextInt();
			} while (pick < 1 || pick > N);
			if( pick == number ) {
				isWinner = true;
				break;
			} else if ( pick < number && tryNum != TRIES ) {
				System.out.println("The number is bigger..");
			} else if ( pick > number && tryNum != TRIES ){
				System.out.println("The number is smaller..");
			}
		}
		
		if( isWinner )
			System.out.println("You Win!");
		else
			System.out.println("Game Over!                                                                        it was " + number );

		printLabel("end   " + methodName);

	}

	/**
	 * @description Накарайте потребителя да въведе 15 числа от клавиатурата. След това изведете най-голямото и най-малкото от тях.
	 * @param scanGlob
	 */
	private static void zad6(Scanner scanGlob) {

		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		final int CNT = 15;
		System.out.println("Enter " + CNT + " numbers [INT]");
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for ( int i = 1 ; i <= CNT ; i++ ) {
			System.out.print("num " + i + ":");
			int k = scanGlob.nextInt();
			if( k < min ) {
				min = k;
			}
			if( k > max ) {
				max = k;
			}
		}
		
		System.out.println("Min num is " + min);
		System.out.println("Max num is " + max);

		printLabel("end   " + methodName);

	}

	/**
	 * @description Да се прочете число от стандартния вход - n. Започвайки от 3, да се изведат на екрана първите n числа, които се делят на 3. Числата да са разделени със запетая.
	 * @param scanGlob
	 */
	private static void zad5(Scanner scanGlob) {

		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		int n;
		final int MULTIPLE = 3;
		do {
			System.out.println("Enter positive number[INT>0]:");
			n = scanGlob.nextInt();
		} while ( n <= 0 );
		
		System.out.print("Result: ");
		for( int i = 1 ; i <= n ; i++ ) {
			if( i == n )
				System.out.print(i*MULTIPLE);
			else
				System.out.print(i*MULTIPLE + ", ");
		}
		
		System.out.println();
		printLabel("end   " + methodName);

	}

	/**
	 * @description
	 * Да се прочете число от стандартния вход и да се изведе сборът на всички числа между 1 и въведеното число.
	 * @param scanGlob
	 */
	private static void zad4(Scanner scanGlob) {

		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		int i;
		do {
			System.out.println("Enter positive number[INT]:");
			i = scanGlob.nextInt();
		} while ( i <= 0 );
		
		int total = 0;
		for ( int j = 1 ; j <= i ; j++ ) {
			total += j;
		}
		
		System.out.println("Result: " + total);

		printLabel("end   " + methodName);

	}

	/**
	 * @description
	 * Да се въведат от потребителя 2 числа и да се изведат на екрана всички числа от по-малкото до по-голямото
	 * @param scanGlob
	 */
	private static void zad3(Scanner scanGlob) {

		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		System.out.println("Enter number[INT]:");
		int i = scanGlob.nextInt();
		System.out.println("Enter another number[INT]:");
		int j = scanGlob.nextInt();
		
		int min = j;
		int max = i;
		
		if ( i < j ) {
			min = i;
			max = j;
		}
		
		System.out.print("Result:");
		for ( int k = min ; k <= max ; k++ ) {
			System.out.print(" " + k);
		}
		
		System.out.println();
		printLabel("end   " + methodName);

	}

	/**
	 * @description
	 * Да се изведат на екрана числата от 10 до 1 в обратен ред.
	 */
	private static void zad2() {

		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		for( int i = 10 ; i >= 1 ; i-- ) {
			System.out.println(i);
		}

		printLabel("end   " + methodName);

	}

	/**
	 * @description
	 * Да се изведат на екрана числата от 1 до 100.
	 */
	private static void zad1() {

		String methodName;
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		printLabel("start " + methodName);

		for( int i = 1 ; i <= 100 ; i++ ) {
			System.out.println(i);
		}

		printLabel("end   " + methodName);

	}

	private static void printLabel(String label) {
		System.out.println("\t======= " + label + " =======");
	}

}
