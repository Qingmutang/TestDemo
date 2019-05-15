package tony.test.iterator.book;

import tony.test.iterator.MyAggregate;
import tony.test.iterator.MyIterator;

public class BookSelf implements MyAggregate {
	private Book[] books;
	private int last = 0;

	public BookSelf(int maxSize) {
		this.books = new Book[maxSize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public MyIterator iterator() {
		
		return new BookShelfIterator(this);
	}

}
