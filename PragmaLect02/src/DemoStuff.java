import java.util.Scanner;

public class DemoStuff {

	public static void main(String[] args) {
		
		/*
		 * Въведете от стандартния вход:
		 * ден от седмицата - цяло число от 1 до 7 (Пон - Нед)
		 * Изход: аларма - делничен ден в 6 ч.
		 * 					почивен ден в 9 ч.
		 */
		
		Scanner sc = new Scanner(System.in);
		int dayOfWeek = -1;
		/*System.out.print("Enter day of week [1-7]:");
		dayOfWeek = sc.nextInt();
		*/
		
		int alarmHour = -1;
		/*
		if (dayOfWeek >= 6) {
			alarmHour = 9;
		}*/
		
		// the ternary operator :)
		alarmHour = (dayOfWeek >= 6) ? 9 : 6;
		System.out.println("Alarm would be at " + alarmHour + " o'clock");
		
		
		// switch (dvijenie) - u, d, l, r:
		System.out.print("Enter direction (u|U,d|D,l|L,r|R):");
		String direction = sc.next().substring(0, 1);
		
		switch(direction.toLowerCase()) {
		case "u":
			System.out.println("Up");
			break;
		case "d":
			System.out.println("Down");
			break;
		case "l":
			System.out.println("Left");
			break;
		case "r":
			System.out.println("Right");
			break;
		default:
			System.out.println("Invalid direction character '" + direction + "'");
		} // switch
		
		
		
	} // main

}
