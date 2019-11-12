package testDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.libraryCatalogue.Model.Bean.Book;
import com.libraryCatalogue.Model.Bean.LibraryUser;
import com.libraryCatalogue.Model.DAO.*;

public class testDAOLibraryUser {

	public static void main(String[] args) {
//		LibraryUserDAOImpl u = new LibraryUserDAOImpl();
//		LibraryUser lib = u.getUserById(1002);
//		LibraryUser user = u.getUserById(1104);
//		
//		u.librarianSuspendUser(user);
		//u.addUser("spidy", "web", "Spider", "man", spider56@yahoo.com"
		
		
//TestLogin();
TestgetUserById();
	}
@Test 
public static void TestLogin(){
	LibraryUserDAO uu = new LibraryUserDAOImpl();
	LibraryUser user = uu.login("admin", "admin");
	LibraryUser user1 = uu.getUserById(1002);
	assertEquals(user1, user);	
	
}

@Test
public static void TestaddUser() {
	LibraryUserDAO uu = new LibraryUserDAOImpl();
	uu.addUser("spidy", "web", "Spider", "man", "spider56@yahoo.com");
	//The user was added in the database	
}
@Test
public static void TestgetUserById() {
	LibraryUserDAO uu = new LibraryUserDAOImpl();
	LibraryUser user = uu.getUserById(1002);
	System.out.println(user.getLastname());
	//correct user is sysout
}

@Test
public static void TestlibrarianRemoveUser() {
	LibraryUserDAO uu = new LibraryUserDAOImpl();
	LibraryUser user = uu.getUserById(1104);
	uu.librarianRemoveUser(user);
	//The user was removed
	

	
}
@Test
public static void TestlibrarianSuspendUser() {
	LibraryUserDAO uu = new LibraryUserDAOImpl();
	LibraryUser user = uu.getUserById(1002);
	uu.librarianSuspendUser(user);
	//the user was suspended in the database
}
}
