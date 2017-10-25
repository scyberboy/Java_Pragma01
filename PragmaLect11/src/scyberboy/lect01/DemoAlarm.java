package scyberboy.lect01;

public class DemoAlarm {

	public static void main(String[] args) {

		Alarm al = new Alarm();
		//al.setDay(DayConstants.MONDAY);
		
		System.out.println(al.getTime());
		
		Alarm al2 = new Alarm();
		al2.setDay(Day.WEDNESDAY);
		System.out.println(al2.getTime());
		
		al2.setDay(Day.SUNDAY);
		System.out.println(al2.getTime());
		
		System.out.println(Day.FRIDAY.toString());
		System.out.println(Day.FRIDAY.getShortName());

	}

}
