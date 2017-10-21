package scyberboy.homework.books;

/**
 * @author stoycho_ani
 */
public class BookInventory {

	private Book book;
	private int qty;

	/**
	 * @param book
	 * @param qty
	 */
	public BookInventory(Book book, int qty) {
		this.book = book;
		this.qty = qty >= 0 ? qty : 0;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty >= 0 ? qty : 0;
	}
	

}
