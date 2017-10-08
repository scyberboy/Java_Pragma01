/**
 * 
 */
package scyberboy.homework.books;

import scyberboy.homework.classes.Person;

/**
 * @author stoycho_ani
 *
 */
public class DemoBooks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		BookStore bs1 = new BookStore();
		bs1.printOpeningHours();
		Person p1 = new Person();
		bs1.setOwner(p1);
	
		Book b1 = new Book();
		b1.print();
		
		bs1.addBook(b1);
		
		Book b2 = new Book("Kniga za Djunglata");
		Person p2 = new Person();
		b2.setAuthor(p2);
		b2.setIsbn("23095762-ABKGJ-0953");
		b2.print();
		
		
		bs1.setQty(b1, 5);
		bs1.setQty(b2, 10);
		bs1.listInventory();
		
		bs1.removeBook(b1);
		
		bs1.getQty(b1);

		

	}

}
