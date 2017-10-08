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
	
	// instance (object) fields
	private String isbn = "001-002-003-ABCD";
	private Person author;
	private String title = "<empty title>";
	
	
	//// Constructors
	/**
	 * @param isbn
	 * @param author
	 * @param title 
	 */
	public Book(String isbn, Person author, String title) {
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
		this.author = author;
		this.title = title;
	}

	
	public Book(String title) {
		this.title = title;
	}

	////////// Getters and Setters
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
		
		System.out.printf("[%s] %s", isbn, title);
		if(author != null) {
			System.out.print(", author : ");
			author.printBrief();
		} else {
			System.out.println("");
		}
		
	}

}
