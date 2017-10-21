package scyberboy.homework.books;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.time.DayOfWeek;
import java.util.ArrayList;

import scyberboy.homework.classes.Person;

public class BookStore {

	private String company;
	private Person owner;
	private String description;
	
	// Plamen: Тия 3-те масива надолу са готини, ама са леко не ООП :) В смисъл, че пазят инфо за всеки ден,
	// но това инфо е разбито на 3 масива, които трябва да имат еднакъв брой елементи. По-добре да имаш нов клас,
	// например OpeningInfo с 3 полета и само един масив OpeningInfo[].
	// Stoycho: Re-factored :)
	
	private OpeningInfo[] openingInfo = new OpeningInfo[7];
	
	// Plamen: Тук аналогично на горния коментар - имаш данните за всяка книга, разписани в 2 колекции и трябва навсякъде
	// в кода да се поддържат тези 2 колекции. Има шанс за бъг, ако някъде забравя за едната или нещо се омотат индексите.
	// Може да имам нов клас BookInventory с 2 полета: Book и Integer и само една колекция с BookInventory обекти.
	// Stoycho: Re-factored :)
	
	//private ArrayList<Book> inventory = new ArrayList<Book>();
	//private Vector<Integer> availability = new Vector<Integer>(1);
	private ArrayList<BookInventory> inventory = new ArrayList<BookInventory>();

	
	///////// Methods....
	
	public void printStoreInfo() {
		System.out.println(getCompany());
		System.out.println( ((getOwner() != null) ? getOwner().getBriefInfo() : null) );
		System.out.println("\t" + getDescription());
		printOpeningInfo();
	}
	public void printOpeningInfo() {
		for (OpeningInfo elem : openingInfo) {
			if (elem != null) {
				elem.print();
			}
		}
	}
	
	public void initOpeningInfo() {
		for (int i=0 ;i < openingInfo.length; i++) {
			
			OpeningInfo elem = openingInfo[i];
			
			if (elem == null) {
				
				elem = new OpeningInfo();
				
				DayOfWeek dow = DayOfWeek.of(i+1);
				LocalTime from = null;
				LocalTime to = null;
				
				if(i >= 0 && i <=4) { // mon-fri
					from = LocalTime.parse("08:30");
					to = LocalTime.parse("19:00");
				} else if (i == 5) { // sat
					from = LocalTime.parse("10:00");
					to = LocalTime.parse("16:00");
				} else if (i == 6) { // sun
					from = LocalTime.parse("10:00");
					to = LocalTime.parse("14:00");
				}
				
				elem.setOpeningDay(dow);
				elem.setOpeningHourFrom(from);
				elem.setOpeningHourTo(to);
				
				openingInfo[i] = elem;
			}
		}
	}
	
	/**
	 * If any of the hours is null - means CLOSED :)
	 * @param day - 1 (Monday) to 7 (Sunday)
	 * @param from - format "HH:MM", not changed if empty string
	 * @param to - format "HH:MM", not changed if empty string
	 */
	public void setOpeningHours(int day, String from, String to) {		
		if( (from == null || to == null) && day >= 1 && day <= 7) {
			// CLOSED :)
			openingInfo[day-1].setOpeningHourFrom(null);
			openingInfo[day-1].setOpeningHourTo(null);
		} else if(day >= 1 && day <= 7) {
			try {
				openingInfo[day-1].setOpeningHourFrom(LocalTime.parse(from));
			} catch (DateTimeParseException e){
				
			}
			
			try {
				openingInfo[day-1].setOpeningHourTo(LocalTime.parse(to));
			} catch (DateTimeParseException e){
				
			}
		}
	}
	
	/// Ctors ...
	
	public BookStore() {
		initOpeningInfo();
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
		initOpeningInfo();
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
	
	public void addBookToInventory(Book b) {
		addBookToInventory(b, 1);
	}
	
	public void addBookToInventory(Book b, int qty) {
		inventory.add(new BookInventory(b, qty));
	}
	
	public void removeBookFromInventory(Book b) {
		
		if(b == null) {
			return;
		}
		
		for(BookInventory cur : inventory) {
			Book member = cur.getBook();
			if(member.equals(b)) {
				inventory.remove(cur);
				break;
			}
		}
	}
	
	/**
	 * @param b - Book
	 * @return BookInventory member if found, otherwise null
	 */
	public BookInventory findBookInInventory(Book b) {		
		for(BookInventory cur : inventory) {
			if( cur.getBook().equals(b) ) {
				return cur;
			}
		}
		return null;
	}
	
	/**
	 * @param str - title or ISBN
	 * @return BookInventory member if found, otherwise null
	 */
	public BookInventory findBookInInventory(String str) {
		for(BookInventory cur : inventory) {
			Book member = cur.getBook(); 
			if(member.getTitle().equals(str) || member.getIsbn().equals(str)) {
				return cur;
			}
		}
		return null;
	}
	
	
	public int getQty(Book b) {
		BookInventory item = findBookInInventory(b);
		if(item != null) {
			return item.getQty();
		} else {
			return 0;
		}
	}
	
	public void setQty(Book b, int qty) {
		BookInventory item = findBookInInventory(b);
		if(item != null) {
			item.setQty(qty);
		}
	}

	public void listInventory() {
		for(BookInventory item: inventory) {
			int qty = item.getQty();
			System.out.print("Avail QTY: " + qty + " - ");
			item.getBook().print();
		}
		
	}

}
