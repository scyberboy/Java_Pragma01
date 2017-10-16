package scyberboy.lect01;

import java.util.Date;

@SuppressWarnings("serial")
public class MyDivisionException extends Exception {

	private Date date;
	
	public MyDivisionException(String message, Date date) {
		super(message);
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}

}
