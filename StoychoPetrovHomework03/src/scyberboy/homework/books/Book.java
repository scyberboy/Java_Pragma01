/**
 * 
 */
package scyberboy.homework.books;

import scyberboy.homework.classes.Person;

/**
 * @author stoycho_ani
 *
 */
public class Book {
	
	// static (class) fields
	private static int id = 0;
	private static int nrAvailable = 0;
	private static int nrSold = 0;
	
	// instance (object) fields
	private String isbn;
	private Person author;
	private String title;
	
	
	//// Constructors
	/**
	 * @param isbn
	 * @param author
	 * @param title 
	 */
	public Book(String isbn, Person author, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	// default Ctor...
	public Book( ) {
		
	}

	/**
	 * @param author
	 * @param title
	 */
	public Book(Person author, String title) {
		super();
		this.author = author;
		this.title = title;
	}

	
	////////// Getters and Setters
	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public static void setId(int id) {
		Book.id = id;
	}

	/**
	 * @return the nrAvailable
	 */
	public static int getNrAvailable() {
		return nrAvailable;
	}

	/**
	 * @param nrAvailable the nrAvailable to set
	 */
	public static void setNrAvailable(int nrAvailable) {
		Book.nrAvailable = nrAvailable;
	}

	/**
	 * @return the nrSold
	 */
	public static int getNrSold() {
		return nrSold;
	}

	/**
	 * @param nrSold the nrSold to set
	 */
	public static void setNrSold(int nrSold) {
		Book.nrSold = nrSold;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the author
	 */
	public Person getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Person author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/// kind of Brief print :)
	public void print( ) {
		
		System.out.printf("[%d][%s] %s, author: %s", id, isbn, title);
		author.printBrief();
		
	}

}
