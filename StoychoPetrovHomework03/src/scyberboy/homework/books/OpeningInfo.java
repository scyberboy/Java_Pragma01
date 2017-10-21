package scyberboy.homework.books;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class OpeningInfo {
	
	/// Fields...
	
	private DayOfWeek openingDay;// = DayOfWeek.MONDAY;
	private LocalTime openingHourFrom;// = LocalTime.parse("08:30");
	private LocalTime openingHourTo;// = LocalTime.parse("19:00");
		
	
	/// Ctors...
	
	public OpeningInfo(DayOfWeek openingDay, LocalTime openingHourFrom, LocalTime openingHourTo) {
		this.openingDay = openingDay;
		this.openingHourFrom = openingHourFrom;
		this.openingHourTo = openingHourTo;
	}

	public OpeningInfo() {
	}

	
	/// Getters and Setters...
	
	public DayOfWeek getOpeningDay() {
		return openingDay;
	}

	public void setOpeningDay(DayOfWeek openingDay) {
		if( DayOfWeek.from(openingDay) instanceof DayOfWeek ) {
			this.openingDay = openingDay;
		}
		
	}

	public LocalTime getOpeningHourFrom() {
		return openingHourFrom;
	}

	public void setOpeningHourFrom(LocalTime openingHourFrom) {
			this.openingHourFrom = openingHourFrom;
	}

	public LocalTime getOpeningHourTo() {
		return openingHourTo;
	}

	public void setOpeningHourTo(LocalTime openingHourTo) {
			this.openingHourTo = openingHourTo;
	}

	
	/// Misc methods...
	
	public void print() {
		String day = getOpeningDay().getDisplayName(TextStyle.FULL, Locale.getDefault());
		
		String time = "CLOSED";
		if(getOpeningHourFrom() != null && getOpeningHourTo() != null) {
			String from = getOpeningHourFrom().format(DateTimeFormatter.ofPattern("H:mm"));
			String to = getOpeningHourTo().format(DateTimeFormatter.ofPattern("H:mm"));
			time = from + " to " + to;
		}
		
		System.out.println(day + " : " + time);
	}
	
	
}
