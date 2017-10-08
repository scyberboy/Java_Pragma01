package scyberboy.homework.books;

import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;

import scyberboy.homework.classes.Person;

public class BookStore {

	private String company;
	private Person owner;
	private String description;
	private LocalTime[] openingHourFrom = { LocalTime.parse("08:30"), LocalTime.parse("08:30"),
			LocalTime.parse("08:30"), LocalTime.parse("08:30"), LocalTime.parse("08:30"), LocalTime.parse("09:30"),
			null };

	private LocalTime[] openingHourTo = { LocalTime.parse("19:00"), LocalTime.parse("19:00"), LocalTime.parse("19:00"),
			LocalTime.parse("19:00"), LocalTime.parse("19:00"), LocalTime.parse("16:00"), null };

	private DayOfWeek[] openingDays = { DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY,
			DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, null };

	private ArrayList<Book> inventory = new ArrayList<Book>();
	private Vector<Integer> availability = new Vector<Integer>(1);

	public void printOpeningHours() {
		for (DayOfWeek dow : openingDays) {
			if (dow != null) {
				System.out.print(dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " - ");
				System.out.printf("%s to %s\n", openingHourFrom[dow.ordinal()].toString(),
						openingHourTo[dow.ordinal()].toString());
			}
		}
	}

	/**
	 * 
	 */
	public BookStore() {
	}

	/**
	 * @param company
	 * @param owner
	 * @param description
	 */
	public BookStore(String company, Person owner, String description) {
		this.company = company;
		this.owner = owner;
		this.description = description;
	}

	/// And so on, different combinations of constructors using given fields ;)
	

	/// Getters and setters...
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the owner
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addBook(Book b) {
		if( !inventory.contains(b) && inventory.add(b) ) {
			// set initial qty of any new added book to 1
			int index = inventory.indexOf(b);
			availability.add(index,1);
			System.out.println("added " + b);
		}
	}
	
	public void removeBook(Book b) {
		if( inventory.contains(b)  ) {
			// remove the availability of the book to be removed
			int index = inventory.indexOf(b);
			availability.remove(index);
			inventory.remove(b);
			System.out.println("removed " + b);
		}
	}
	
	public int getQty(Book b) {
		int index = inventory.indexOf(b);
		return ( index >= 0 ? availability.get(index): 0 );
	}
	
	public void setQty(Book b, int qty) {
		int index = inventory.indexOf(b);
		if(index >= 0) {
			availability.set(index, qty);
		} else {
			System.out.print("Not available in this bookstore: ");
			b.print();
		}
	}

	public void listInventory() {
		for(Book b: inventory) {
			int qty = getQty(b);
			System.out.print(qty + " books available for selling: ");
			b.print();
		}
		
	}

}
