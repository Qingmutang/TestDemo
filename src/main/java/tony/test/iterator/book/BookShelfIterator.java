package tony.test.iterator.book;

import tony.test.iterator.MyIterator;

/**
 * 实现具体的迭代方法
 * @author 
 *
 */
public class BookShelfIterator implements MyIterator {
	
	BookSelf bookSelf;
	private int index;
	
	public BookShelfIterator(BookSelf bookSelf) {
		this.bookSelf = bookSelf;
		this.index = 0;
	}

	public boolean hasNext() {
		if(index<bookSelf.getLength()) {
			return true;
		}
		return false;
	}

	public Object next() {
		Book book = bookSelf.getBookAt(index);
		index++;
		return book;
	}

}
