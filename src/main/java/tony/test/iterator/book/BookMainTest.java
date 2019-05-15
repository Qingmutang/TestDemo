package tony.test.iterator.book;

import tony.test.iterator.MyIterator;

public class BookMainTest {

	/**
	 * 说明：
	 *    1.首先两个接口 iterator aggregate  将迭代功能和实体区分开
	 *      iterator 含有具体的迭代功能 hasNext next
	 *      aggregate 获取iterator对象
	 *    2.BookShelfIterator 实现iterator 里面的 hasNext next 入参bookself
	 *    3.BookSelf 实现aggregate ,获取到iterator子类
	 * @param args
	 */
	public static void main(String[] args) {
		BookSelf bookSelf = new BookSelf(4);
		bookSelf.appendBook(new Book("Around the World in 80 Days"));
		bookSelf.appendBook(new Book("Daddy-Long-Legs"));
		bookSelf.appendBook(new Book("hhaha"));
		bookSelf.appendBook(new Book("abc"));
		
		MyIterator iterator = bookSelf.iterator();
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName()); 
			
		}
	}
}
