package Shopping;

import java.util.List;

import Shopping.beans.Author;

public interface AuthorDAO {
	
	public int addNewAuthor(Author author);
	public List<Author> listAllAuthors();
	public Author findByAuthorId(int authorId);
	public int editAuthorDetails(Author author);
	public int deleteAuthor(int authorId);
	

}
