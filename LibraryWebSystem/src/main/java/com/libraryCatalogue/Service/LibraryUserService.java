package com.libraryCatalogue.Service;


import java.util.ArrayList;
import java.util.List;
import com.libraryCatalogue.Model.DAO.*;
import com.libraryCatalogue.Model.Bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibraryUserService {
	
	
	
	public LibraryUserService() {
		// TODO Auto-generated constructor stub
	}

	LibraryUserDAO libraryUserDAO = new LibraryUserDAOImpl();
	
		//test variable
	//static LibraryUser currentUser = new LibraryUser();
		
	//single user
	public LibraryUser login(String username, String password) {    
		LibraryUser user = null;
		if(username != null && password != null) {
			user = this.libraryUserDAO.login(username, password);
			user.setUsername(username);
			user.setPassword(password);
			//currentUser.setId(user.getId()); // track current user
		}
	//	System.out.println("Returned user in service class " + user); //test
		return user;
	}
	public boolean removeUser(int libraryid, int removeid) {
		boolean flag = false;
		LibraryUser lib = this.libraryUserDAO.getUserById(libraryid);
		LibraryUser del = this.libraryUserDAO.getUserById(removeid);
		if(lib!=null && del!=null && lib.getSuperuser()==1) {
			this.libraryUserDAO.librarianRemoveUser(del);
			flag = true;
		}
		return flag;
	}
	public LibraryUser addUser(String username, String password, String firstname, String lastname, String email) { // pending 
		//	this.libraryUserDAO.addUser(username, password, firstname, lastname, email);
		LibraryUser user = new LibraryUser();
		if(username!=null && password!= null && firstname!=null && lastname!= null && email != null) {
			user = this.libraryUserDAO.addUser(username,password,firstname,lastname,email);
			user.setUsername(username);
			user.setPassword(password);
			user.setFirstname(firstname);
			user.setLastname(lastname);
			user.setEmail(email);
			System.out.println("added test service: "+ user);
		}
		return user;
	}
	
	public LibraryUser getUserById(int id) { 						// pending 
		LibraryUser user = null;
		user = this.libraryUserDAO.getUserById(id);
		user.setId(id);
		System.out.println("libraryservice class method " + user);
		return user;
	}

	public void updateUser(LibraryUser Currentuser) {  
		if (Currentuser != null)
			this.libraryUserDAO.updateUser(Currentuser);
		else
			System.out.println("Error Here at updateUser in Service");
	}
		/*
		// pending
		LibraryUser currentUser = new LibraryUser(); 
		currentUser.setId(user.getId()); //static
		System.out.println(currentUser.getId());
		if(currentUser.getId() == user.getId()) {
			
			currentUser.setUsername(user.getUsername());
			currentUser.setPassword(user.getPassword());
			currentUser.setFirstname(user.getFirstname());
			currentUser.setLastname(user.getLastname());
			currentUser.setSsn(user.getSsn());
			currentUser.setEmail(user.getEmail());
			currentUser.setSuperuser(user.getSuperuser());
			currentUser.setSuspension(user.getSuspension());
			currentUser.setBookborrowed(user.getBookborrowed());
			System.out.println("it worked ");
		} else
			System.out.println("uh oh");
			return currentUser;
*/

	
	

	/*
	
	// add user
	/*
	/*
	public boolean deleteUser(LibraryUser user) {
		if(user != null) {
			this.libraryUserDAOImpl.deleteUser(user);
			} 
				return false;
	}
	//book table method
	public Book searchBookList(String isbn) {
		Book b = null;
		for(Book x : this.bookList) {
			if(x.getIsbn() == isbn) {
				b = x;
				break;
			}
		}
		return b;
	}
	public ArrayList<String[]> searchBookByName(String name) {
		Book b = new Book();
		b.setName(name);
		return this.bookDAO.searchBookByName(name);
	}
	public ArrayList<String[]> searchBookByAuthor(String author) {
		b.setAuthor(author);
		return this.bookDAO.searchBookByAuthor(author);
	}
	public ArrayList<String[]> searchBookByTag(String tag) {
		b.setTag(tag);
		return this.bookDAO.searchBookByTag(tag);
	}
	public boolean borrowBook(int userid, int bookid) {
		b.setUserid(userid);
		b.setId(bookid);
		return this.bookDAO.borrowBook(userid,bookid);
	}
	public boolean reserveBook(int userid, int bookid, String date) {
		b.setUserid(userid);
		b.setId(bookid);
		b.setReservedate(date);
		return this.bookDAO.reserveBook(userid,bookid,date);
	}
	public ArrayList<String[]> listBook(int userid) {
		return this.bookDAO.listBook(userid);
	}
	public boolean returnBook(int userid, int bookid) {
		b.setUserid(userid);
		b.setId(bookid);
		return this.bookDAO.returnBook(userid,bookid);
	}
	public boolean extendBook(int userid, int bookid, int days) {
		return this.bookDAO.extendBook(userid,bookid,days);	
	}
	public boolean cancleReserve(int userid, int bookid) {
		return this.bookDAO.cancleReserve(userid, bookid);
	}
	public boolean changeReserve(int userid, int bookid, String date) {
		return this.bookDAO.changeReserve(userid, bookid, date);
	}
	 */

}