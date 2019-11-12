package testDriver;
import com.libraryCatalogue.Model.Bean.Book;
import com.libraryCatalogue.Model.Bean.LibraryUser;
import com.libraryCatalogue.Model.DAO.*;
public class tester {

	public static void main(String[] args) {
		BookDAO e = new BookDAOImpl();
		
		
		for(Book b: e.getAllBooks()) {
			System.out.println(b.getName());
		}
		System.out.println("\n\nSearching for: Java");
		for(Book b: e.searchBookByName("Java")) {
			System.out.println(b.getTag());
		}
		
		
	}

}
