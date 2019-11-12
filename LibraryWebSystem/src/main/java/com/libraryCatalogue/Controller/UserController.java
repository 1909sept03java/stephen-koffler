package com.libraryCatalogue.Controller;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.libraryCatalogue.Model.Bean.Book;
import com.libraryCatalogue.Model.Bean.LibraryUser;
import com.libraryCatalogue.Service.BookService;
import com.libraryCatalogue.Service.LibraryUserService;
import com.libraryCatalogue.Service.tastybeanservice;

@RestController
@RequestMapping(value="/libr")
public class UserController {
	private LibraryUserService libs;
	private BookService bs;
	@Autowired // setter injection
	public void setLibraryUserService(LibraryUserService  libs , BookService bs) {
		this.libs =  libs;
		this.bs = bs;
	}
	@RequestMapping(method=RequestMethod.POST,value="/deregister")
	public @ResponseBody ResponseEntity<String> deregister(@RequestBody String s){
		System.out.println(s);
		boolean flag = false;
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		int librian = 0;
		int removeuser = 0;
		ObjectMapper objectMapper = new ObjectMapper();
		ResponseEntity<String> resp = null;
		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(jsonData);
			JsonNode idNode = rootNode.path("librian");
			System.out.println("librian = "+idNode.asText());
			librian = idNode.asInt();
			
			idNode= rootNode.path("removeuser");
			System.out.println("removeuser = "+idNode.asText());
			removeuser = idNode.asInt();	
			flag = this.libs.removeUser(librian, removeuser);
			
		} catch (Exception e1) {
			e1.printStackTrace();
				return new ResponseEntity<>("Something in the back end has an issue",HttpStatus.BAD_REQUEST);
		}
		if(flag)
			return  new ResponseEntity<>("User Deregistered",HttpStatus.OK);
		else
			return new ResponseEntity<>("Bad REequest",HttpStatus.BAD_REQUEST);
	}
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public @ResponseBody ResponseEntity<String> register( @RequestBody String s) {
		
		System.out.println(s);
		
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		String username = "a";
		String password = "a";
		String firstname = "a";
		String lastname = "a";
		String email = "a";
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();
		ResponseEntity<String> resp = null;
		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(jsonData);
			JsonNode idNode = rootNode.path("username");
			System.out.println("username = "+idNode.asText());
			username = idNode.asText();
			
			idNode= rootNode.path("password");
			System.out.println("password = "+idNode.asText());
			password = idNode.asText();
			
			idNode= rootNode.path("firstname");
			System.out.println("firstname = "+idNode.asText());
			firstname = idNode.asText();
			
			idNode= rootNode.path("lastname");
			System.out.println("lastname = "+idNode.asText());
			lastname = idNode.asText();
			
			idNode= rootNode.path("email");
			System.out.println("email = "+idNode.asText());
			email = idNode.asText();
			this.libs.addUser(username, password, firstname, lastname, email);
			resp = new ResponseEntity<>("Registered",HttpStatus.OK);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
				resp = new ResponseEntity<>("Oh No!",HttpStatus.BAD_REQUEST);
		}
		return resp;
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/update")
	public ResponseEntity<String> update( @RequestBody LibraryUser u) {
	//	System.out.println(u);
		System.out.println(u);
		this.libs.updateUser(u);
		return new ResponseEntity<>("ok",HttpStatus.OK);
		
	}
	@RequestMapping(method=RequestMethod.POST, value=("/removebook"))
	public ResponseEntity<String> removeBook( @RequestBody String s) {
		System.out.println(s);
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		int bookid = 1;

		ObjectMapper objectMapper = new ObjectMapper();
		boolean flag = false;
		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
		rootNode = objectMapper.readTree(jsonData);
			
			JsonNode idNode = rootNode.path("bookid");
			System.out.println("bookid = "+idNode.asInt());
			bookid = idNode.asInt();
	
			this.bs.librarianRemoveBook(bookid);
		} catch (Exception e1) {
			return new ResponseEntity<>("Backend Issue",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("Book is Removed",HttpStatus.OK);
	
	}
	@RequestMapping(method=RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE},value="/addbook")
	public ResponseEntity<String> addBook( @RequestBody String s) {
		System.out.println(s);
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		int userid = 1;
		String name = "a";
		String author = "a";
		String Isbn13 = "a";
		//String publishdate = "a";
		String publisher = "a";
		String tag = "a";
		
		int page = 1;
		//create k instance
		ObjectMapper objectMapper = new ObjectMapper();
		boolean flag = false;
		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(jsonData);
			
			JsonNode idNode = rootNode.path("userid");
			System.out.println("userid = "+idNode.asInt());
			userid = idNode.asInt();
			
			idNode = rootNode.path("name");
			System.out.println("name = "+idNode.asText());
			name = idNode.asText();
			
			idNode = rootNode.path("author");
			System.out.println("author = "+idNode.asText());
			author = idNode.asText();
			
			idNode = rootNode.path("Isbn13");
			System.out.println("name = "+idNode.asText());
			Isbn13 = idNode.asText();
			
			//idNode = rootNode.path("publishdate");
			//System.out.println("name = "+idNode.asText());
			//publishdate = idNode.asText();
			
			idNode = rootNode.path("publisher");
			System.out.println("name = "+idNode.asText());
			publisher = idNode.asText();
			
			idNode = rootNode.path("tag");
			System.out.println("tag = "+idNode.asText());
			tag = idNode.asText();
			
			idNode= rootNode.path("page");
			System.out.println("page = "+idNode.asInt());
			page = idNode.asInt();

			
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Date d = new Date();
		String publishdate = d.toString();
		flag = this.bs.librarianAddBook(userid, name, author, page, Isbn13, publishdate, publisher, tag);
		
		if(flag)
			return new ResponseEntity<String>("Book is added",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Book can't be added, not sure if bad request or bork'd backend",HttpStatus.BAD_REQUEST);	
	}
	
	@RequestMapping(method=RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE},value="/mybook")
	public ResponseEntity<ArrayList<Book>> myBook( @RequestBody LibraryUser u) {
		System.out.println(u);
		return new ResponseEntity<>(this.bs.listBookFromUser(u),HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE},value="/extend")
	public ResponseEntity<String> extendBook( @RequestBody String s) {
		System.out.println(s);
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		int userid = 1;
		int bookid = 1;
		//create k instance
		ObjectMapper objectMapper = new ObjectMapper();
		boolean flag = false;
		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(jsonData);
			JsonNode idNode = rootNode.path("userid");
			System.out.println("userid = "+idNode.asInt());
			userid = idNode.asInt();
			idNode= rootNode.path("bookid");
			System.out.println("bookid = "+idNode.asInt());
			bookid = idNode.asInt();
			flag = this.bs.extendBook(userid,bookid);
			
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(flag)
			return new ResponseEntity<>("ok",HttpStatus.OK);
		else
			return new ResponseEntity<>("no",HttpStatus.BAD_REQUEST);	
		
	}
	@RequestMapping(method=RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE},value="/return")
	public ResponseEntity<String> returnBook( @RequestBody String s) {
		System.out.println(s);
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		int userid = 1;
		int bookid = 1;
		//create k instance
		ObjectMapper objectMapper = new ObjectMapper();
		boolean flag = false;
		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(jsonData);
			JsonNode idNode = rootNode.path("userid");
			System.out.println("userid = "+idNode.asInt());
			userid = idNode.asInt();
			idNode= rootNode.path("bookid");
			System.out.println("bookid = "+idNode.asInt());
			bookid = idNode.asInt();
			flag = this.bs.returnBook(userid, bookid);
			
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		if(flag) {
			return new ResponseEntity<String>("\"{Done}\"",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("no",HttpStatus.BAD_REQUEST);	
		}
	}
	
	@RequestMapping(method=RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE},value="/borrow")
	public ResponseEntity<String> borrowBook( @RequestBody String s) {
		System.out.println(s);
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		int userid = 1;
		int bookid = 1;
		//create k instance
		ObjectMapper objectMapper = new ObjectMapper();
		boolean flag = false;
		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(jsonData);
			JsonNode idNode = rootNode.path("userid");
			System.out.println("userid = "+idNode.asInt());
			userid = idNode.asInt();
			idNode= rootNode.path("bookid");
			System.out.println("bookid = "+idNode.asInt());
			bookid = idNode.asInt();
			flag = this.bs.borrowBook(userid, bookid);
			
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(flag)
			return new ResponseEntity<>("ok",HttpStatus.OK);
		else
			return new ResponseEntity<>("no",HttpStatus.BAD_REQUEST);	
		
	}
	
	@RequestMapping(method=RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE},value="/search")
	public ResponseEntity<ArrayList<Book>> searchBook( @RequestBody String s) {
		System.out.println(s);
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		String method = "a";
		String key = "a";
		//create k instance
		ObjectMapper objectMapper = new ObjectMapper();

		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(jsonData);
			JsonNode idNode = rootNode.path("method");
			System.out.println("method = "+idNode.asText());
			method = idNode.asText();
			idNode= rootNode.path("key");
			System.out.println("v = "+idNode.asText());
			key = idNode.asText();
			
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(key);
		return new ResponseEntity<>(this.bs.searchBook(method, key),HttpStatus.OK);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE},value="/login")
	public ResponseEntity<LibraryUser> Login( @RequestBody String s) {
		System.out.println(s);
		
		byte[] jsonData = s.getBytes(Charset.forName("UTF-8"));
		String username = "a";
		String password = "a";
		//create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		//read JSON like DOM Parser
		JsonNode rootNode;
		try {
			rootNode = objectMapper.readTree(jsonData);
			JsonNode idNode = rootNode.path("username");
			System.out.println("username = "+idNode.asText());
			username = idNode.asText();
			idNode= rootNode.path("password");
			System.out.println("password = "+idNode.asText());
			password = idNode.asText();
			
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LibraryUser u = this.libs.login(username, password);
		ResponseEntity<LibraryUser> resp;// = new ResponseEntity<LibraryUser>()  ;
		
		if(u==null)
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		else
		{
			resp= new ResponseEntity<>(u,HttpStatus.OK);
			System.out.println(resp);
		}
		return resp;
		
	}
	

}
