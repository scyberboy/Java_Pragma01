package scyberboy.lect01;

public class Alarm {

	private int time;
	
	/*public void setDay(int day) {
		
	}*/
	
	public void setDay(Day day) {
		switch(day) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
			time = 8;
			break;
		case SATURDAY:
		case SUNDAY:
			time = 10;
			break;
		}
	}

	public int getTime() {
		return time;
	}
	
}
