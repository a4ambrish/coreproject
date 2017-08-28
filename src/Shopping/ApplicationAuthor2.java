package Shopping;

import java.security.GeneralSecurityException;
import java.util.Scanner;

import Shopping.beans.Author;

public class ApplicationAuthor2 {

	public static void main(String[] args) {

		
		ApplicationAuthor2 obj = new ApplicationAuthor2();

		
		
	}

	private void addAuthorMenuOption(ApplicationAuthor2 obj) {
		// Get Input From User
		Author author = obj.getInputFromUser();

		// Save into DB
		int result = obj.addNewAuthor(author);
		if (result == 1) {
			System.out.println("Author Data Saved Successfully");
		} else {
			System.out.println("Operation Failed");
		}

	}

	private int addNewAuthor(Author author) {

		AuthorDAO authorDAO = new AuthorDAOImpl();
		return authorDAO.addNewAuthor(author);

	}

	private Author getInputFromUser() {
		Author author = new Author();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Author Id ");
		author.setAuthorId(Integer.parseInt(input.nextLine()));

		System.out.println("Enter Author Name");
		author.setAuthorName(input.nextLine());
		input.close();
		return author;

	}
	
	

}
