package Shopping;

import java.util.List;

import Shopping.beans.Book;

public interface BookDAO {
	
	public int addNewBook(Book book);
	public List<Book> listAllBooks();
	public Book findByBookId(int bookId);
	public int editBookDetails(Book book);
	public int deleteBook(int bookId);
	

}
