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
		
		
		BookStore bs1 = new BookStore("Knijarnichkata na ygyla", new Person("kaka Meg"), "Prodavame s lyuboff");
		//bs1.printOpeningInfo();
		bs1.printStoreInfo();
		
		Person p1 = new Person();
		bs1.setOwner(p1);
	
		Book b1 = new Book("Java programming for beginners");
		b1.print();
		
		bs1.addBookToInventory(b1);
		
		System.out.println("--- List 1 ---");
		bs1.listInventory();
		
		Book b2 = new Book("Kniga za Djunglata");
		Person p2 = new Person();
		b2.setAuthor(p2);
		b2.setIsbn("23095762-ABKGJ-0953");
		//b2.print();
		
		
		bs1.setQty(b1, 5);
		bs1.addBookToInventory(b2);
		System.out.println("--- List 2 ---");
		bs1.listInventory();
		
		
		bs1.setQty(b2, 10);
		System.out.println("--- List 3 ---");
		bs1.listInventory();
		
		bs1.addBookToInventory(new Book("nqkva kniga"));
		bs1.removeBookFromInventory(b1);
		System.out.println("--- List 4 ---");
		bs1.listInventory();
		
		System.out.println(bs1.getQty(b1));
		System.out.println(bs1.getQty(b2));
		System.out.println(bs1.getQty(bs1.findBookInInventory("nqkva kniga").getBook()));
		
		bs1.removeBookFromInventory(bs1.findBookInInventory("nqkva kniga").getBook());
		System.out.println("--- List 5 ---");
		bs1.listInventory();
		
		
		System.out.println("--- Rabotno ---");
		bs1.setOpeningHours(1, "13:00", "");
		bs1.setOpeningHours(7, null, "13:45");
		bs1.printOpeningInfo();
		
		
		// i t.n. :)

	}

}
